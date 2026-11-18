package NeonAffect;

import OpenAIClassLibrary.OpenAI;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Turns a judge's scored rows into a CoJACK plan value for every candidate plan.
 *
 * <p>Lives in plain Java rather than inside PlanSelectorPlan.plan on purpose. JAL's
 * preprocessor blanks generic type arguments before the JACK parser sees them, so a
 * {@code Map<String, Integer>} arrives at the type checker as a raw {@code Map} and
 * {@code put(String, Integer)} fails to resolve against {@code put(Object, Object)}.
 * Keeping the collection work here avoids that, and makes the rules testable without
 * standing up an agent.
 *
 * <h2>Match on name, never on position</h2>
 * The judge may reorder rows, omit them, merge them, or echo a name back with different
 * casing. Pairing its Nth row with our Nth candidate attaches scores to the wrong plans,
 * silently. {@link OpenAI.PlanResult} carries the name it scored; this matches on that.
 *
 * <h2>Grading, and why winner-takes-all was losing information</h2>
 * The judge returns a distribution, not a winner. Measured on real rage/nonverbal data,
 * roughly 8 of 10 candidate plans are meaningfully in play per personality type and the
 * top plan holds only 18-40% of the mass. Collapsing that to
 * {@code RANDOM_SELECTED_PLAN} for the argmax and {@code 0} for everything else threw
 * nearly all of it away: 16 personality types produced just 5 distinct behaviours, and
 * because exactly one plan then had a non-zero PLAN_VALUE, CoJACK's expected-gain
 * competition ran with a single candidate.
 *
 * <p>{@link Mode#GRADED} instead sets
 * {@code PLAN_VALUE = GRADED_PLAN_VALUE_OFFSET + GRADED_PLAN_VALUE_SCALE * p} for each
 * plan the judge scored, and 0 for those it did not, so CoJACK arbitrates a real field
 * of candidates without ever reaching for one the judge passed over.
 * {@link Mode#WINNER_TAKES_ALL} preserves the old behaviour for A/B comparison.
 */
public final class PlanSelectionResolver {

    private PlanSelectionResolver() {} // non-instantiable

    public enum Mode {
        /** PLAN_VALUE proportional to the judge's probability for each plan. */
        GRADED,
        /** Legacy: argmax gets RANDOM_SELECTED_PLAN, everything else 0. */
        WINNER_TAKES_ALL
    }

    /** Resolve using {@link Mode#GRADED}. */
    public static ArrayList<SelectedPlan> Resolve(ArrayList<String> planNames,
                                                  ArrayList<OpenAI.PlanResult> rows,
                                                  String strEmotion,
                                                  boolean bDebug) {
        return Resolve(planNames, rows, strEmotion, bDebug, Mode.GRADED);
    }

    /**
     * @param planNames  candidate plans, fully qualified (e.g. "NeonAffect.ScreamPlan")
     * @param rows       what the judge returned; may be reordered, short, or partly unusable
     * @param strEmotion the emotion the prompt used (case-insensitive)
     * @param bDebug     verbose tracing
     * @param mode       grading strategy
     * @return one entry per candidate plan, in candidate order - never fewer, so no plan
     *         can retain a PLAN_VALUE written by an earlier cycle
     */
    public static ArrayList<SelectedPlan> Resolve(ArrayList<String> planNames,
                                                  ArrayList<OpenAI.PlanResult> rows,
                                                  String strEmotion,
                                                  boolean bDebug,
                                                  Mode mode) {

        return Build(planNames, IndexRows(rows, bDebug), strEmotion, bDebug, mode);
    }

    /**
     * Resolve from a {@link JudgeDecision} instead of raw judge rows. The decision's
     * probabilities are keyed by the display name we offered, so they match the same way.
     */
    public static ArrayList<SelectedPlan> Resolve(ArrayList<String> planNames,
                                                  JudgeDecision decision,
                                                  String strEmotion,
                                                  boolean bDebug) {

        Map<String, Integer> percentByName = new HashMap<String, Integer>();

        if (decision != null) {
            for (Map.Entry<String, Double> e : decision.probabilities().entrySet()) {
                double d = (e.getValue() == null) ? 0.0 : e.getValue().doubleValue();
                if (d <= 0.0) continue;
                percentByName.put(PlanUtils.NormaliseName(e.getKey()),
                                  Integer.valueOf((int) Math.round(d * 10000.0)));
            }
        }

        return Build(planNames, percentByName, strEmotion, bDebug, Mode.GRADED);
    }

    /** The display names a judge is offered for these plans, in candidate order. */
    public static ArrayList<String> DisplayNames(ArrayList<String> planNames, String strEmotion) {
        String strEmotionLower = (strEmotion == null) ? "" : strEmotion.toLowerCase();
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < planNames.size(); i++) {
            out.add(PlanUtils.DisplayName(Bare(planNames.get(i)), strEmotionLower));
        }
        return out;
    }

    private static ArrayList<SelectedPlan> Build(ArrayList<String> planNames,
                                                 Map<String, Integer> percentByName,
                                                 String strEmotion,
                                                 boolean bDebug,
                                                 Mode mode) {

        ArrayList<SelectedPlan> out = new ArrayList<SelectedPlan>();

        if (planNames == null || planNames.isEmpty()) {
            return out;
        }

        String strEmotionLower = (strEmotion == null) ? "" : strEmotion.toLowerCase();

        // scores aligned to the candidate list, and their total
        int iCount = planNames.size();
        double[] scores = new double[iCount];
        double dTotal = 0.0;
        int iMax = -1;

        for (int i = 0; i < iCount; i++) {
            Integer pct = LookUp(percentByName, planNames.get(i), strEmotionLower);
            double d = (pct == null) ? 0.0 : pct.doubleValue();
            scores[i] = d;
            dTotal += d;
            if (pct != null && pct.intValue() > iMax) iMax = pct.intValue();
        }

        // Nothing usable came back. Fall back to a uniform field rather than setting every
        // PLAN_VALUE to 0 - that would give every plan negative expected gain, leaving
        // CoJACK nothing to select and stalling the waiting agent. Say so loudly, because
        // it means the judge call effectively failed. Measured rate is around 8% of calls.
        boolean bDegraded = (dTotal <= 0.0);

        if (bDegraded) {
            System.out.println("PlanSelectionResolver: WARNING no usable percentages matched the "
                + Integer.toString(iCount) + " candidate plans; falling back to a uniform field.");
        }

        for (int i = 0; i < iCount; i++) {
            String strPlanName = Bare(planNames.get(i));
            String strFormula;

            if (mode == Mode.WINNER_TAKES_ALL) {
                boolean bSelected = bDegraded || (scores[i] > 0.0 && (int) scores[i] == iMax);
                strFormula = bSelected
                    ? PlanConstants.RANDOM_SELECTED_PLAN
                    : PlanConstants.RANDOM_NON_SELECTED_PLAN;
            } else if (bDegraded) {
                // uniform field: every plan scored equally, none excluded.
                // CoJACK picks at random between equal PLAN_VALUEs, so this degrades to
                // a fair coin rather than a stall.
                strFormula = Formula(PlanConstants.GRADED_PLAN_VALUE_OFFSET
                                   + PlanConstants.GRADED_PLAN_VALUE_SCALE * (1.0 / iCount));
            } else if (scores[i] > 0.0) {
                // offset lifts scored plans clear of unscored ones; scale sets the
                // spread among them, which is what reproduces the judge's distribution
                strFormula = Formula(PlanConstants.GRADED_PLAN_VALUE_OFFSET
                                   + PlanConstants.GRADED_PLAN_VALUE_SCALE * (scores[i] / dTotal));
            } else {
                // the judge declined to score this plan - keep it out of the running
                strFormula = PlanConstants.RANDOM_NON_SELECTED_PLAN;
            }

            if (bDebug) {
                System.out.println("PlanSelectionResolver: [" + strPlanName + "]  score ["
                    + (scores[i] == 0.0 ? "none" : Integer.toString((int) scores[i]))
                    + "]  PLAN_VALUE [" + strFormula + "]");
            }

            out.add(new SelectedPlan(strPlanName, strFormula));
        }

        return out;
    }

    private static Map<String, Integer> IndexRows(ArrayList<OpenAI.PlanResult> rows, boolean bDebug) {
        Map<String, Integer> percentByName = new HashMap<String, Integer>();

        if (rows == null) return percentByName;

        for (OpenAI.PlanResult row : rows) {
            String strKey = PlanUtils.NormaliseName(row.name());
            int iPct = PlanUtils.ParsePercentage(row.percentage());

            if (strKey.isEmpty() || iPct < 0) {
                if (bDebug) {
                    System.out.println("PlanSelectionResolver: discarding unusable row name ["
                        + row.name() + "] percentage [" + row.percentage() + "]");
                }
                continue;
            }

            Integer existing = percentByName.get(strKey);
            if (existing == null || iPct > existing.intValue()) {
                percentByName.put(strKey, Integer.valueOf(iPct));
            }
        }

        return percentByName;
    }

    /**
     * CoJACK formula text for a plan value. Locale-fixed: a comma decimal separator
     * would produce an expression CoJACK cannot parse.
     */
    private static String Formula(double dValue) {
        return String.format(Locale.US, "%.4f", Double.valueOf(dValue));
    }

    private static String Bare(String strQualifiedName) {
        return strQualifiedName.replace(Constants.NEON_NAMESPACE, "").trim();
    }

    private static Integer LookUp(Map<String, Integer> percentByName,
                                  String strQualifiedName,
                                  String strEmotionLower) {
        String strDisplay = PlanUtils.DisplayName(Bare(strQualifiedName), strEmotionLower);
        return percentByName.get(PlanUtils.NormaliseName(strDisplay));
    }
}
