package NeonAffect;

/**
 * The outcome of matching an appraisal against a set of affect prototypes,
 * including how much the decision actually rested on.
 *
 * <p>The classifier previously returned only the winning index. That hides the
 * thing most worth knowing: with 158 prototypes in 24 dimensions the top few
 * candidates are routinely near-tied, and a bare index reports a coin-toss and
 * a clear win identically. Measured on the four scripted situations, the winner
 * beat the runner-up by between 0.0024 and 0.0199 while the whole range of
 * scores spanned about 0.20 - so the decision rested on 1% to 10% of the
 * available range, and nothing said so.</p>
 *
 * <p>Hence {@link #getConfidence()}: the margin as a fraction of the observed
 * spread. Absolute margin is not usable as a threshold because it depends on
 * how compressed the metric happens to be; the normalised figure is
 * comparable across metrics and prototype sets.</p>
 *
 * <p>Plain class rather than a record, to match the rest of the code base.</p>
 */
public final class AppraisalMatch {

    /**
     * Default below which a match is reported as near-tied.
     *
     * <p>0.05 is not arbitrary. On the four scripted situations it separates
     * the two classifications that were defensible (INFJ 6.0%, ESFJ 9.2% -
     * both chose Injustice) from the two that were not (ESTP 1.2%, INTJ 1.5% -
     * the latter returning "Useful" for losing a contract). A threshold that
     * fired on all four, or none, would carry no information.</p>
     */
    public static final double DEFAULT_MIN_CONFIDENCE = 0.05;

    private final int index;
    private final double score;
    private final int runnerUpIndex;
    private final double runnerUpScore;
    private final double min;
    private final double max;
    private final int candidates;

    public AppraisalMatch(int index, double score,
                          int runnerUpIndex, double runnerUpScore,
                          double min, double max, int candidates) {
        this.index = index;
        this.score = score;
        this.runnerUpIndex = runnerUpIndex;
        this.runnerUpScore = runnerUpScore;
        this.min = min;
        this.max = max;
        this.candidates = candidates;
    }

    /** No usable candidate. */
    public static AppraisalMatch none() {
        return new AppraisalMatch(-1, Double.NaN, -1, Double.NaN,
                                  Double.NaN, Double.NaN, 0);
    }

    /** Winning AffectEnum index, or -1 if nothing matched. */
    public int getIndex() { return index; }

    /** Winning similarity score. */
    public double getScore() { return score; }

    /** Second-placed AffectEnum index, or -1 if there was only one candidate. */
    public int getRunnerUpIndex() { return runnerUpIndex; }

    /** Second-placed similarity score. */
    public double getRunnerUpScore() { return runnerUpScore; }

    /** Number of prototypes actually scored. */
    public int getCandidates() { return candidates; }

    /** Lowest and highest scores seen, i.e. the metric's realised range. */
    public double getMin() { return min; }
    public double getMax() { return max; }

    /** How far the winner beat the runner-up, in raw score units. */
    public double getMargin() {
        if (runnerUpIndex < 0 || Double.isNaN(runnerUpScore)) {
            return Double.NaN;
        }
        return score - runnerUpScore;
    }

    /** Full range of scores observed across the prototypes. */
    public double getSpread() {
        if (Double.isNaN(min) || Double.isNaN(max)) {
            return Double.NaN;
        }
        return max - min;
    }

    /**
     * Margin as a fraction of spread, in 0.0-1.0.
     *
     * <p>1.0 means the winner was ahead by the entire range of scores; 0.0
     * means it was tied with the runner-up. Returns 1.0 when there was only one
     * candidate, since an unopposed match is not ambiguous.</p>
     */
    public double getConfidence() {
        if (index < 0) {
            return 0.0;
        }
        if (runnerUpIndex < 0) {
            return 1.0;
        }
        double spread = getSpread();
        if (Double.isNaN(spread) || spread <= 0.0) {
            // Every prototype scored identically: the winner is whichever was
            // examined first, which is no confidence at all.
            return 0.0;
        }
        return Math.max(0.0, Math.min(1.0, getMargin() / spread));
    }

    /** Whether the decision is too close to rely on, at the default threshold. */
    public boolean isNearTie() {
        return isNearTie(DEFAULT_MIN_CONFIDENCE);
    }

    public boolean isNearTie(double minConfidence) {
        return index >= 0 && getConfidence() < minConfidence;
    }

    private static String nameOf(int i) {
        if (i < 0) {
            return "none";
        }
        try {
            return AffectEnum.GetName(i);
        } catch (Exception e) {
            return "?";
        }
    }

    @Override
    public String toString() {
        if (index < 0) {
            return "AppraisalMatch[no match]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AppraisalMatch[").append(nameOf(index))
          .append(" (").append(index).append(')')
          .append(" score=").append(fmt(score))
          .append(" runnerUp=").append(nameOf(runnerUpIndex))
          .append(' ').append(fmt(runnerUpScore))
          .append(" margin=").append(fmt(getMargin()))
          .append(" spread=").append(fmt(getSpread()))
          .append(" confidence=").append(pct(getConfidence()))
          .append(" of ").append(candidates).append(" candidates");
        if (isNearTie()) {
            sb.append(" NEAR-TIE");
        }
        return sb.append(']').toString();
    }

    private static String fmt(double d) {
        return Double.isNaN(d) ? "n/a" : String.format("%.4f", d);
    }

    private static String pct(double d) {
        return String.format("%.1f%%", d * 100.0);
    }
}
