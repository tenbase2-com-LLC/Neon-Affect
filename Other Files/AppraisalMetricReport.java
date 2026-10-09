package NeonAffect;

import java.util.List;

/**
 * Measures how well the cosine metric actually separates the affect prototypes.
 *
 * <p>Prints, per personality type: the range of similarity scores a query
 * produces across all prototypes, and the margin between the winner and the
 * runner-up. A classifier whose scores all sit in a narrow band is deciding on
 * noise, and the symptom is a plausible-looking answer that changes for reasons
 * nobody can trace.</p>
 *
 * <p>Also reports the same figures for MEAN-CENTRED cosine (Pearson
 * correlation), which is the standard remedy when every vector lives in the
 * positive orthant.</p>
 */
public final class AppraisalMetricReport {

    private AppraisalMetricReport() {}

    public static void main(String[] args) throws Exception {
        String[] types = { "INFJ", "ESTP", "INTJ", "ESFJ" };
        String situation = "I made a mistake that cost us the contract";

        IAppraisalSource source = new ScriptedAppraisalSource(false);
        PersonalityAppraisals prototypes = new PersonalityAppraisals();

        System.out.println("query: " + situation);
        System.out.println();
        System.out.printf("%-6s  %-34s  %-34s%n", "", "RAW COSINE", "MEAN-CENTRED (Pearson)");
        System.out.printf("%-6s  %-8s %-8s %-8s %-6s  %-8s %-8s %-8s %-6s%n",
            "type", "min", "max", "spread", "margin", "min", "max", "spread", "margin");

        for (String type : types) {
            float[] q = source.DetermineAppraisal(situation, type).toArray();
            List<AffectAppraisal> protos = prototypes.get(type);

            Stats raw = score(q, protos, false);
            Stats cen = score(q, protos, true);

            System.out.printf("%-6s  %-8.4f %-8.4f %-8.4f %-6.4f  %-8.4f %-8.4f %-8.4f %-6.4f%n",
                type, raw.min, raw.max, raw.max - raw.min, raw.margin,
                cen.min, cen.max, cen.max - cen.min, cen.margin);
        }

        System.out.println();
        System.out.println("spread = max - min across all prototypes");
        System.out.println("margin = winner - runner-up (how much the decision rests on)");
        System.out.println();
        System.out.println("Winners, raw vs centred:");
        for (String type : types) {
            float[] q = source.DetermineAppraisal(situation, type).toArray();
            List<AffectAppraisal> protos = prototypes.get(type);
            int rawWin = score(q, protos, false).argmax;
            int cenWin = score(q, protos, true).argmax;
            System.out.printf("    %-5s  raw [%3d] %-22s  centred [%3d] %s%n",
                type, rawWin, name(rawWin), cenWin, name(cenWin));
        }
    }

    private static String name(int i) {
        try { return AffectEnum.GetName(i); } catch (Exception e) { return "?"; }
    }

    private static final class Stats {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double margin;
        int argmax = -1;
    }

    private static Stats score(float[] query, List<AffectAppraisal> protos,
                               boolean centred) {
        Stats s = new Stats();
        double best = Double.NEGATIVE_INFINITY;
        double second = Double.NEGATIVE_INFINITY;

        float[] q = centred ? centre(query) : query;

        for (int i = 0; i < protos.size(); i++) {
            try { AffectEnum.GetName(i); } catch (Exception e) { continue; }
            AffectAppraisal p = protos.get(i);
            if (p == null) continue;

            float[] v = centred ? centre(p.toArray()) : p.toArray();
            double sim = cosine(q, v);
            if (Double.isNaN(sim)) continue;

            if (sim < s.min) s.min = sim;
            if (sim > s.max) s.max = sim;
            if (sim > best) { second = best; best = sim; s.argmax = i; }
            else if (sim > second) { second = sim; }
        }
        s.margin = (second == Double.NEGATIVE_INFINITY) ? 0.0 : best - second;
        return s;
    }

    /**
     * Subtracts the vector's own mean. Every appraisal dimension is in 0.0-1.0,
     * so all vectors sit in the positive orthant and raw cosine between any two
     * of them is large and positive before their shapes are even considered.
     * Centring removes that shared offset, so what remains is how the two
     * profiles DEVIATE from flat - which is the thing that actually
     * distinguishes one affect from another.
     */
    private static float[] centre(float[] v) {
        double mean = 0.0;
        for (float x : v) mean += x;
        mean /= v.length;
        float[] out = new float[v.length];
        for (int i = 0; i < v.length; i++) out[i] = (float) (v[i] - mean);
        return out;
    }

    private static double cosine(float[] a, float[] b) {
        if (a == null || b == null || a.length != b.length) return Double.NaN;
        double dot = 0, na = 0, nb = 0;
        for (int i = 0; i < a.length; i++) {
            dot += a[i] * b[i];
            na  += a[i] * a[i];
            nb  += b[i] * b[i];
        }
        if (na == 0 || nb == 0) return Double.NaN;
        return dot / (Math.sqrt(na) * Math.sqrt(nb));
    }
}
