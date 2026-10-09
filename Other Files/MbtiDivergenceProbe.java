package NeonAffect;

import OpenAIClassLibrary.OpenAI;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Measures whether the MBTI personality type actually changes plan selection.
 *
 * <h2>Why this exists</h2>
 * The personality type threads through the entire Neon-Affect architecture - it is a
 * CoJACK parameter, it selects one of sixteen affect-level tables, and it is spliced
 * into both judging prompts. But nothing has ever verified that it changes the
 * <em>output</em>. If the judge ranks plans near-identically for an INTP and an ESFJ,
 * then MBTI is decorative, and any later comparison between judges is measuring
 * agreement on a no-op.
 *
 * <h2>The noise floor matters more than the divergence</h2>
 * Asking "do INTP and ESFJ differ?" is meaningless on its own, because the judge is
 * stochastic: it does not give the same answer twice for the <em>same</em> type either.
 * So this runs each type several times and reports two numbers:
 *
 * <ul>
 *   <li><b>within-type</b> agreement - the same type against itself across repeats.
 *       This is the noise floor.</li>
 *   <li><b>between-type</b> agreement - different types against each other.</li>
 * </ul>
 *
 * If between-type agreement is no lower than within-type agreement, the personality
 * type is indistinguishable from sampling noise and is doing nothing.
 *
 * <h2>Fidelity</h2>
 * This reproduces PlanSelectorPlan's production prompt verbatim rather than using a
 * generic one, because the question is whether <em>that</em> prompt discriminates.
 *
 * <p>Usage: {@code java NeonAffect.MbtiDivergenceProbe [emotion] [modality] [repeats]}
 * <br>Default: rage / nonverbal / 3, which is 48 calls.
 *
 * <p>Note: this calls OpenAI through the existing wrapper, which uses the API key
 * compiled into OpenAIClassLibrary.jar. Externalising that key is separate work.
 */
public final class MbtiDivergenceProbe {

    private MbtiDivergenceProbe() {}

    public static final String[] MBTI_TYPES = {
        "INTP", "INTJ", "ENTP", "ENTJ",
        "INFP", "INFJ", "ENFP", "ENFJ",
        "ISTP", "ISTJ", "ESTP", "ESTJ",
        "ISFP", "ISFJ", "ESFP", "ESFJ"
    };

    /** The real RAGE candidate plans, from RageAffectCapability.cap. */
    public static final String[] RAGE_PLANS = {
        "NeonAffect.HoldingBackCriticismPlan",
        "NeonAffect.UpsetOverLittleThingPlan",
        "NeonAffect.PickFightPlan",
        "NeonAffect.CrackKnucklesIntimidatePlan",
        "NeonAffect.ScreamPlan",
        "NeonAffect.StaringDownRagePlan",
        "NeonAffect.ManipulatePlan",
        "NeonAffect.PainSuspensionPlan",
        "NeonAffect.IncreasedStrengthPlan",
        "NeonAffect.DominateControlPlan"
    };

    /** Directory holding the JACK sources, relative to the working directory. */
    public static final String CAP_DIR = "NeonAffect";

    /**
     * Reads an emotion's candidate plans from its capability file, the same way the
     * running agent does: every {@code #uses plan} declaration, filtered through
     * {@link PlanUtils#ContainsCorrectPlan} to drop the infrastructure plans.
     */
    static List<String> LoadPlansFromCapability(String strEmotion) throws Exception {
        String strCap = Character.toUpperCase(strEmotion.charAt(0))
                      + strEmotion.substring(1).toLowerCase()
                      + "AffectCapability.cap";

        File file = new File(CAP_DIR, strCap);
        if (!file.exists()) {
            throw new IllegalArgumentException("No capability file for '" + strEmotion + "': " + file.getPath());
        }

        List<String> out = new ArrayList<String>();
        for (String line : Files.readAllLines(file.toPath(), StandardCharsets.UTF_8)) {
            String t = line.trim();
            if (!t.startsWith("#uses plan")) continue;
            String name = t.substring("#uses plan".length()).replace(";", "").trim();
            if (name.isEmpty() || !PlanUtils.ContainsCorrectPlan(name)) continue;
            out.add(Constants.NEON_NAMESPACE + name);
        }
        return out;
    }

    public static void main(String[] args) throws Exception {

        String strEmotion  = (args.length > 0) ? args[0] : "rage";
        String strModality = (args.length > 1) ? args[1] : "nonverbal";
        int iRepeats       = (args.length > 2) ? Integer.parseInt(args[2]) : 3;
        String strModel    = (args.length > 3) ? args[3] : NeonOpenAI.DEFAULT_MODEL;

        List<String> plans = LoadPlansFromCapability(strEmotion);
        List<String> display = new ArrayList<String>();
        for (String p : plans) {
            display.add(PlanUtils.DisplayName(p.replace(Constants.NEON_NAMESPACE, "").trim(),
                                              strEmotion.toLowerCase()));
        }

        int iCalls = MBTI_TYPES.length * iRepeats;
        System.out.println("MBTI divergence probe");
        System.out.println("  emotion   : " + strEmotion);
        System.out.println("  modality  : " + strModality);
        System.out.println("  plans     : " + display.size() + "  " + display);
        System.out.println("  types     : " + MBTI_TYPES.length);
        System.out.println("  repeats   : " + iRepeats);
        System.out.println("  model     : " + strModel);
        System.out.println("  API calls : " + iCalls);
        System.out.println();

        // type -> list of score vectors (one per repeat), indexed by plan position
        Map<String, List<double[]>> runs = new LinkedHashMap<String, List<double[]>>();
        int iEmpty = 0;

        for (String strType : MBTI_TYPES) {
            List<double[]> vectors = new ArrayList<double[]>();

            for (int r = 0; r < iRepeats; r++) {
                String strPrompt = BuildProductionPrompt(display, strEmotion, strModality, strType);

                double[] scores;
                try {
                    ArrayList<OpenAI.PlanResult> ret = new NeonOpenAI(strModel, false).determineSelectedPlans(strPrompt);
                    scores = ToScoreVector(ret, display);
                } catch (Exception e) {
                    System.out.println("  " + strType + " repeat " + (r + 1) + ": CALL FAILED - " + e);
                    continue;
                }

                // An all-zero vector means the judge returned nothing usable. It is not a
                // ranking, and its correlation with anything is undefined - including it
                // would drag the noise floor down and understate the personality effect.
                // Count it as a failed call, which is also what production does with it.
                if (Sum(scores) == 0.0) {
                    iEmpty++;
                    System.out.println("  " + strType + " repeat " + (r + 1)
                        + "  EMPTY RESPONSE - excluded");
                    continue;
                }

                vectors.add(scores);
                System.out.println("  " + strType + " repeat " + (r + 1)
                    + "  top=" + display.get(ArgMax(scores))
                    + "  " + Format(scores));
            }

            if (!vectors.isEmpty()) runs.put(strType, vectors);
        }

        System.out.println();
        System.out.println("empty responses excluded: " + iEmpty + " of " + iCalls
            + String.format("  (%.1f%%)", 100.0 * iEmpty / iCalls));

        if (runs.size() < 2) {
            System.out.println("\nNot enough successful runs to compare. Check the API key.");
            return;
        }

        Report(runs, display, strEmotion, strModality + "_" + strModel);
    }

    /** Verbatim reproduction of PlanSelectorPlan.CreateOpenAIPrompt. */
    static String BuildProductionPrompt(List<String> display, String strEmotion,
                                        String strModality, String strType) {
        StringBuilder sb = new StringBuilder();
        sb.append("An ").append(strType)
          .append(" Myers-Briggs personality type is experiencing ").append(strEmotion.toLowerCase())
          .append(". Distribute 100 points across the ").append(strModality.toLowerCase())
          .append(" behaviors below according to how characteristic each is of that type in that state."
                + " This is a subjective weighting, not an empirical frequency;"
                + " approximate judgement is expected.\n");

        int iCount = 1;
        for (String d : display) {
            sb.append(Integer.toString(iCount++)).append(".  ").append(d).append("\n");
        }

        sb.append("Do not add to this list.\n");
        sb.append("Respond only as: 1. Behavior Name - 15%\n");
        return sb.toString();
    }

    static double[] ToScoreVector(ArrayList<OpenAI.PlanResult> ret, List<String> display) {
        Map<String, Integer> byName = new HashMap<String, Integer>();
        if (ret != null) {
            for (OpenAI.PlanResult row : ret) {
                String key = PlanUtils.NormaliseName(row.name());
                int pct = PlanUtils.ParsePercentage(row.percentage());
                if (key.isEmpty() || pct < 0) continue;
                Integer prev = byName.get(key);
                if (prev == null || pct > prev.intValue()) byName.put(key, Integer.valueOf(pct));
            }
        }
        double[] out = new double[display.size()];
        for (int i = 0; i < display.size(); i++) {
            Integer v = byName.get(PlanUtils.NormaliseName(display.get(i)));
            out[i] = (v == null) ? 0.0 : v.doubleValue();
        }
        return out;
    }

    // ---------------- analysis ----------------

    static void Report(Map<String, List<double[]>> runs, List<String> display,
                       String strEmotion, String strModality) throws Exception {

        List<String> types = new ArrayList<String>(runs.keySet());

        // within-type: every pair of repeats for the same type
        List<Double> within = new ArrayList<Double>();
        for (String t : types) {
            List<double[]> v = runs.get(t);
            for (int i = 0; i < v.size(); i++)
                for (int j = i + 1; j < v.size(); j++)
                    within.add(Double.valueOf(Spearman(v.get(i), v.get(j))));
        }

        // between-type: mean vector per type, every pair of types
        Map<String, double[]> means = new LinkedHashMap<String, double[]>();
        for (String t : types) means.put(t, Mean(runs.get(t)));

        List<Double> between = new ArrayList<Double>();
        for (int i = 0; i < types.size(); i++)
            for (int j = i + 1; j < types.size(); j++)
                between.add(Double.valueOf(Spearman(means.get(types.get(i)), means.get(types.get(j)))));

        double dWithin  = Average(within);
        double dBetween = Average(between);

        System.out.println();
        System.out.println("================ RESULT ================");
        System.out.printf("within-type  agreement (noise floor) : %.3f   (n=%d pairs)%n", dWithin, within.size());
        System.out.printf("between-type agreement               : %.3f   (n=%d pairs)%n", dBetween, between.size());
        System.out.printf("separation (within - between)        : %.3f%n", dWithin - dBetween);
        System.out.println();

        // distinct winners
        Map<String, Integer> winners = new LinkedHashMap<String, Integer>();
        for (String t : types) {
            String w = display.get(ArgMax(means.get(t)));
            Integer c = winners.get(w);
            winners.put(w, Integer.valueOf(c == null ? 1 : c.intValue() + 1));
        }
        System.out.println("top-1 plan per type (" + winners.size() + " distinct across " + types.size() + " types):");
        for (Map.Entry<String, Integer> e : winners.entrySet()) {
            System.out.println("   " + e.getValue() + " type(s) -> " + e.getKey());
        }

        System.out.println();
        System.out.println("Reading: if separation is near zero, the personality type is");
        System.out.println("indistinguishable from sampling noise and MBTI is doing nothing.");
        System.out.println("A clearly positive separation means the type genuinely shifts selection.");

        WriteCsv(runs, display, strEmotion, strModality);
    }

    static void WriteCsv(Map<String, List<double[]>> runs, List<String> display,
                         String strEmotion, String strModality) throws Exception {
        String strFile = "mbti_divergence_" + strEmotion + "_" + strModality + ".csv";
        PrintWriter pw = new PrintWriter(strFile, "UTF-8");
        try {
            pw.print("type,repeat");
            for (String d : display) pw.print("," + d.replace(",", " "));
            pw.println();
            for (Map.Entry<String, List<double[]>> e : runs.entrySet()) {
                List<double[]> v = e.getValue();
                for (int r = 0; r < v.size(); r++) {
                    pw.print(e.getKey() + "," + (r + 1));
                    for (double d : v.get(r)) pw.print("," + d);
                    pw.println();
                }
            }
        } finally {
            pw.close();
        }
        System.out.println("\nraw scores written to " + strFile);
    }

    // ---------------- maths ----------------

    /** Spearman rank correlation. Ties share their average rank. */
    static double Spearman(double[] a, double[] b) {
        double[] ra = Ranks(a);
        double[] rb = Ranks(b);
        return Pearson(ra, rb);
    }

    static double[] Ranks(double[] v) {
        int n = v.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = Integer.valueOf(i);
        final double[] vv = v;
        Arrays.sort(idx, (x, y) -> Double.compare(vv[x.intValue()], vv[y.intValue()]));

        double[] r = new double[n];
        int i = 0;
        while (i < n) {
            int j = i;
            while (j + 1 < n && vv[idx[j + 1].intValue()] == vv[idx[i].intValue()]) j++;
            double avg = (i + j) / 2.0 + 1.0;
            for (int k = i; k <= j; k++) r[idx[k].intValue()] = avg;
            i = j + 1;
        }
        return r;
    }

    static double Pearson(double[] a, double[] b) {
        int n = a.length;
        double ma = 0.0, mb = 0.0;
        for (int i = 0; i < n; i++) { ma += a[i]; mb += b[i]; }
        ma /= n; mb /= n;
        double num = 0.0, da = 0.0, db = 0.0;
        for (int i = 0; i < n; i++) {
            double x = a[i] - ma, y = b[i] - mb;
            num += x * y; da += x * x; db += y * y;
        }
        if (da == 0.0 || db == 0.0) return 0.0;   // constant vector: undefined, report 0
        return num / Math.sqrt(da * db);
    }

    static double[] Mean(List<double[]> vs) {
        int n = vs.get(0).length;
        double[] out = new double[n];
        for (double[] v : vs) for (int i = 0; i < n; i++) out[i] += v[i];
        for (int i = 0; i < n; i++) out[i] /= vs.size();
        return out;
    }

    static double Average(List<Double> xs) {
        if (xs.isEmpty()) return 0.0;
        double s = 0.0;
        for (Double d : xs) s += d.doubleValue();
        return s / xs.size();
    }

    static double Sum(double[] v) {
        double s = 0.0;
        for (double d : v) s += d;
        return s;
    }

    static int ArgMax(double[] v) {
        int best = 0;
        for (int i = 1; i < v.length; i++) if (v[i] > v[best]) best = i;
        return best;
    }

    static String Format(double[] v) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < v.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(String.format("%.0f", v[i]));
        }
        return sb.append("]").toString();
    }
}
