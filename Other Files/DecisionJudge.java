package NeonAffect;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A judge that picks one label from a candidate set and reports how confident it is.
 *
 * <p>Deliberately vendor-neutral. Neon-Affect makes two judging calls per behaviour
 * cycle - "verbal / nonverbal / action" and "which of these plans" - and both are
 * this same shape: instructions, a candidate label set, some context, one winner.
 * Implementations can be a hosted decision-only judge ({@link JevDecisionJudge}),
 * a generative LLM adapted to the contract ({@link OpenAIDecisionJudge}), a local
 * model, or eventually Neon-Affect's own appraisal and trajectory machinery, with
 * no change at the call sites.
 *
 * <p>{@link CascadingJudge} composes two of these into the accept-when-confident,
 * escalate-when-unsure pattern.
 */
public interface DecisionJudge {

    /**
     * @param strInstructions what to decide, in natural language
     * @param labels          the candidate labels; the winner must be one of these
     * @param context         structured inputs (emotion, personality type, modality, ...);
     *                        may be empty but not null
     * @return a decision, or {@link JudgeDecision#None} when no usable answer came back
     */
    JudgeDecision Decide(String strInstructions,
                         List<String> labels,
                         Map<String, String> context) throws Exception;

    /** Short identifier used for tracing and cost accounting. */
    String GetName();

    /**
     * Turns raw per-label scores into a probability distribution.
     *
     * <p>Labels absent from {@code scores} are included with probability 0, so the
     * returned map always covers every candidate. That matters downstream: every
     * plan needs a PLAN_VALUE written each cycle, otherwise it silently keeps the
     * value some earlier cycle gave it.
     */
    static Map<String, Double> Normalise(List<String> labels, Map<String, Integer> scores) {
        Map<String, Double> out = new LinkedHashMap<String, Double>();

        long lTotal = 0L;
        for (String strLabel : labels) {
            Integer score = scores.get(PlanUtils.NormaliseName(strLabel));
            if (score != null && score.intValue() > 0) lTotal += score.intValue();
        }

        for (String strLabel : labels) {
            Integer score = scores.get(PlanUtils.NormaliseName(strLabel));
            double dValue = 0.0;

            if (lTotal > 0L && score != null && score.intValue() > 0) {
                dValue = score.intValue() / (double) lTotal;
            }

            out.put(strLabel, Double.valueOf(dValue));
        }

        return out;
    }
}
