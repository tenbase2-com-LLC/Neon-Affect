package NeonAffect;

import java.util.List;
import java.util.stream.IntStream;

public class AffectAppraisalCalculator {

    private final boolean bDebug;

    public AffectAppraisalCalculator(boolean bDebug) {
        this.bDebug = bDebug;
    }

    /**
     * Finds the affect index with the highest cosine similarity to the given appraisal.
     * Uses Java streams for the similarity scan.
     */
    public int GetMaxSimilarity(AffectAppraisal appraisal, List<AffectAppraisal> appraisalList) {
        float[] vector1 = appraisal.toArray();

        record ScoredAffect(int index, double similarity) {}

        var best = IntStream.range(0, appraisalList.size())
            .filter(i -> {
                try { AffectEnum.GetName(i); return true; }
                catch (Exception e) { return false; }
            })
            .mapToObj(i -> new ScoredAffect(i,
                cosineSimilarity(vector1, appraisalList.get(i).toArray())))
            .peek(sa -> {
                if (bDebug) System.out.println("Cosine Similarity score: [" + sa.similarity() + "]");
            })
            .max((a, b) -> Double.compare(a.similarity(), b.similarity()))
            .orElse(null);

        if (bDebug && best != null) {
            try {
                System.out.println("Max enum: [" + AffectEnum.GetName(best.index()) + "]");
            } catch (Exception e) { /* ignore */ }
            System.out.println("Max Cosine Similarity score: [" + best.similarity() + "]");
        }

        return best != null ? best.index() : -1;
    }

    /** Cosine similarity between two float vectors. */
    private static double cosineSimilarity(float[] a, float[] b) {
        double dot = 0.0, normA = 0.0, normB = 0.0;
        for (int i = 0; i < a.length; i++) {
            dot   += a[i] * b[i];
            normA += a[i] * a[i];
            normB += b[i] * b[i];
        }
        return dot / (Math.sqrt(normA) * Math.sqrt(normB));
    }
}
