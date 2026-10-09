package NeonAffect;

import java.util.List;

public class AffectAppraisalCalculator {

    private final boolean bDebug;

    public AffectAppraisalCalculator(boolean bDebug) {
        this.bDebug = bDebug;
    }

    /**
     * Finds the affect index with the highest cosine similarity to the given
     * appraisal.
     *
     * <p>Unchanged signature and unchanged result - the JAL layer reaches this
     * through {@link AppraisalUtils#GetAppraisalType}, which
     * {@code AffectAppraisalEvent.event} calls with 24 bound variables. Use
     * {@link #GetBestMatch} instead where the caller can act on how close the
     * decision was.</p>
     */
    public int GetMaxSimilarity(AffectAppraisal appraisal,
                                List<AffectAppraisal> appraisalList) {
        return GetBestMatch(appraisal, appraisalList).getIndex();
    }

    /**
     * As {@link #GetMaxSimilarity}, but reports the runner-up and the margin.
     *
     * <p>Written as a plain loop. The previous version used a stream with a
     * local {@code record ScoredAffect} and an exception-throwing
     * {@code filter} to test index validity; a loop does the same work,
     * allocates nothing per candidate, tracks second place for free, and keeps
     * records out of the code base.</p>
     *
     * <p>Note what this metric does and does not see. Cosine compares the
     * DIRECTION of two appraisal vectors and is blind to their magnitude, so a
     * uniformly mild appraisal and a uniformly extreme one score identically
     * against the same prototype. Every dimension is also non-negative, so all
     * vectors sit in the positive orthant and no pair scores below about 0.70
     * before their shapes are considered at all - the realised spread is
     * roughly a fifth of the nominal range. Both are left as they are, because
     * changing the metric would move every existing classification; the
     * {@link AppraisalMatch#getConfidence()} figure exists so the consequences
     * are at least visible at each call.</p>
     *
     * @return the match, or {@link AppraisalMatch#none()} if there was nothing
     *         to match against
     */
    public AppraisalMatch GetBestMatch(AffectAppraisal appraisal,
                                       List<AffectAppraisal> appraisalList) {

        if (appraisal == null || appraisalList == null || appraisalList.isEmpty()) {
            return AppraisalMatch.none();
        }

        float[] vector1 = appraisal.toArray();

        int bestIndex = -1;
        int secondIndex = -1;
        double bestScore = Double.NEGATIVE_INFINITY;
        double secondScore = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        int scored = 0;

        for (int i = 0; i < appraisalList.size(); i++) {

            // The index is positional into appraisalList AND has to name a real
            // affect, because that same int is what callers hand to
            // AffectEnum.GetName. An index the enum does not know is skipped.
            try {
                AffectEnum.GetName(i);
            } catch (Exception e) {
                continue;
            }

            AffectAppraisal candidate = appraisalList.get(i);
            if (candidate == null) {
                continue;
            }

            double similarity = cosineSimilarity(vector1, candidate.toArray());

            // NaN when either vector has zero length - an all-zero appraisal,
            // or a prototype that was never filled in. NaN loses every
            // comparison silently, so it is dropped explicitly instead.
            if (Double.isNaN(similarity)) {
                if (bDebug) {
                    System.out.println("Cosine Similarity undefined (zero-length "
                        + "vector) at index [" + i + "] - skipped");
                }
                continue;
            }

            scored++;
            if (similarity < min) min = similarity;
            if (similarity > max) max = similarity;

            if (bDebug) {
                System.out.println("Cosine Similarity score: [" + similarity + "]");
            }

            if (similarity > bestScore) {
                secondScore = bestScore;
                secondIndex = bestIndex;
                bestScore = similarity;
                bestIndex = i;
            } else if (similarity > secondScore) {
                secondScore = similarity;
                secondIndex = i;
            }
        }

        if (bestIndex == -1) {
            return AppraisalMatch.none();
        }

        AppraisalMatch match = new AppraisalMatch(
            bestIndex, bestScore,
            secondIndex,
            secondIndex < 0 ? Double.NaN : secondScore,
            min, max, scored);

        if (bDebug) {
            System.out.println("Max: " + match);
        }

        return match;
    }

    /**
     * Cosine similarity between two float vectors.
     *
     * @return the similarity, or {@code NaN} if either vector has zero length
     *         or the lengths do not match
     */
    private static double cosineSimilarity(float[] a, float[] b) {
        if (a == null || b == null || a.length != b.length) {
            return Double.NaN;
        }
        double dot = 0.0, normA = 0.0, normB = 0.0;
        for (int i = 0; i < a.length; i++) {
            dot   += a[i] * b[i];
            normA += a[i] * a[i];
            normB += b[i] * b[i];
        }
        if (normA == 0.0 || normB == 0.0) {
            return Double.NaN;
        }
        return dot / (Math.sqrt(normA) * Math.sqrt(normB));
    }
}
