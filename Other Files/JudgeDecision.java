package NeonAffect;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The result of a decision-only judgment: which label won, how probability mass
 * was spread across the candidate labels, and how confident the judge was.
 *
 * <p>This is deliberately a <em>decision-only</em> contract - a typed verdict plus
 * label probabilities, with no generated rationale. Two things follow from that.
 * First, it makes the accept/escalate cascade in {@link CascadingJudge} possible,
 * because a confidence signal is part of the result rather than something we try to
 * infer from prose. Second, it removes a class of parsing faults by construction:
 * a typed result cannot come back reordered, truncated, or unparseable the way a
 * numbered list in free text can.
 *
 * <p>Shape follows the decision-only judging interface described in "JEV-as-a-Judge:
 * Accept When Confident, Escalate When Unsure" (Li, Miao, Krishnan and Padman,
 * arXiv:2609.26550).
 *
 * @param label         the winning label, or null when no decision could be reached
 * @param probabilities probability per candidate label; insertion-ordered, never null
 * @param confidence    confidence in {@code label}, in [0.0, 1.0]
 * @param source        which judge produced this, for tracing and cost accounting
 */
public record JudgeDecision(String label,
                            Map<String, Double> probabilities,
                            double confidence,
                            String source) implements java.io.Serializable {

    public JudgeDecision {
        probabilities = (probabilities == null)
            ? Collections.<String, Double>emptyMap()
            : Collections.unmodifiableMap(new LinkedHashMap<String, Double>(probabilities));
    }

    /** A "no usable decision" result, so callers never have to handle null. */
    public static JudgeDecision None(String strSource) {
        return new JudgeDecision(null, Collections.<String, Double>emptyMap(), 0.0, strSource);
    }

    public boolean HasDecision() {
        return label != null && !label.isEmpty();
    }

    /**
     * Whether this decision clears a confidence bar.
     *
     * <p>Thresholds do not transfer between tasks or judges - the JEV paper found
     * threshold transfer to be a specific failure mode and concluded that policy
     * needs local validation. Calibrate against your own data; do not port a number
     * from elsewhere.
     */
    public boolean IsConfident(double dThreshold) {
        return HasDecision() && confidence >= dThreshold;
    }

    /**
     * Gap between the top two label probabilities, or the top probability alone when
     * there is only one candidate.
     *
     * <p>Margin is often a better escalation trigger than raw confidence: a judge can
     * be 0.45 confident and still be unambiguous if the runner-up sits at 0.05. This
     * is the same shape as the expected-gain margin CoJACK already computes when it
     * picks between competing plans.
     */
    public double Margin() {
        double dTop = -1.0;
        double dSecond = -1.0;

        for (Double d : probabilities.values()) {
            double v = (d == null) ? 0.0 : d.doubleValue();
            if (v > dTop) {
                dSecond = dTop;
                dTop = v;
            } else if (v > dSecond) {
                dSecond = v;
            }
        }

        if (dTop < 0.0) return 0.0;
        if (dSecond < 0.0) return dTop;

        return dTop - dSecond;
    }
}
