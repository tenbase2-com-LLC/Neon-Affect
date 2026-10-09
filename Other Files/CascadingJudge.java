package NeonAffect;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Accept when confident, escalate when unsure.
 *
 * <p>Runs a cheap primary judge first. If its decision clears the confidence bar, that
 * decision stands. Otherwise the request goes to a stronger, more expensive fallback.
 * This is the cascade evaluated in "JEV-as-a-Judge: Accept When Confident, Escalate
 * When Unsure" (Li, Miao, Krishnan and Padman, arXiv:2609.26550), where a frozen
 * cascade retained 99% of the strong comparator's accuracy at materially lower cost,
 * because the primary's errors concentrated in its low-confidence decisions.
 *
 * <p>For Neon-Affect the useful property is that it makes replacing the LLM
 * <em>incremental</em>. The primary can start as a hosted decision-only judge and
 * later become Neon-Affect's own appraisal and trajectory machinery, with the LLM
 * retained purely as the escalation path. Nothing at the call site changes, and there
 * is a safety net throughout.
 *
 * <h2>Calibrate the threshold</h2>
 * The paper found that confidence thresholds <em>do not transfer</em> between settings
 * and concluded policy needs local validation. There is deliberately no default
 * threshold here. Measure agreement between primary and fallback across your own
 * contexts, then pick the threshold that buys the agreement you need. Use
 * {@link #GetAcceptedCount()} and {@link #GetEscalatedCount()} to see what a candidate
 * threshold actually costs.
 */
public class CascadingJudge implements DecisionJudge {

    private final DecisionJudge primary;
    private final DecisionJudge fallback;
    private final double dConfidenceThreshold;
    private final double dMarginThreshold;
    private final boolean bDebug;

    private final AtomicLong lAccepted = new AtomicLong();
    private final AtomicLong lEscalated = new AtomicLong();
    private final AtomicLong lPrimaryFailed = new AtomicLong();

    /**
     * @param primary              cheap judge, tried first
     * @param fallback             stronger judge, used when the primary is unsure or fails
     * @param dConfidenceThreshold accept the primary at or above this confidence
     * @param dMarginThreshold     also require this gap to the runner-up; pass 0.0 to
     *                             ignore margin and key only on confidence
     */
    public CascadingJudge(DecisionJudge primary,
                          DecisionJudge fallback,
                          double dConfidenceThreshold,
                          double dMarginThreshold,
                          boolean bDebug) {
        if (primary == null || fallback == null) {
            throw new IllegalArgumentException("CascadingJudge needs both a primary and a fallback judge.");
        }
        this.primary = primary;
        this.fallback = fallback;
        this.dConfidenceThreshold = dConfidenceThreshold;
        this.dMarginThreshold = dMarginThreshold;
        this.bDebug = bDebug;
    }

    @Override
    public String GetName() {
        return "cascade(" + primary.GetName() + "->" + fallback.GetName() + ")";
    }

    @Override
    public JudgeDecision Decide(String strInstructions,
                                List<String> labels,
                                Map<String, String> context) throws Exception {

        JudgeDecision decision = null;

        try {
            decision = primary.Decide(strInstructions, labels, context);
        } catch (Exception e) {
            // A primary that throws is not a failure of the request, only of that judge.
            lPrimaryFailed.incrementAndGet();
            if (bDebug) {
                System.out.println("CascadingJudge: primary [" + primary.GetName()
                    + "] failed, escalating: " + e);
            }
        }

        if (decision != null && IsAcceptable(decision)) {
            lAccepted.incrementAndGet();
            if (bDebug) {
                System.out.println("CascadingJudge: accepted [" + decision.label()
                    + "] from [" + decision.source() + "] confidence ["
                    + decision.confidence() + "] margin [" + decision.Margin() + "]");
            }
            return decision;
        }

        lEscalated.incrementAndGet();

        if (bDebug) {
            String strWhy = (decision == null) ? "primary failed"
                : "confidence " + decision.confidence() + " / margin " + decision.Margin()
                  + " below threshold " + dConfidenceThreshold + " / " + dMarginThreshold;
            System.out.println("CascadingJudge: escalating to [" + fallback.GetName() + "] - " + strWhy);
        }

        return fallback.Decide(strInstructions, labels, context);
    }

    private boolean IsAcceptable(JudgeDecision decision) {
        if (!decision.IsConfident(dConfidenceThreshold)) return false;
        if (dMarginThreshold > 0.0 && decision.Margin() < dMarginThreshold) return false;
        return true;
    }

    public long GetAcceptedCount()      { return lAccepted.get(); }
    public long GetEscalatedCount()     { return lEscalated.get(); }
    public long GetPrimaryFailedCount() { return lPrimaryFailed.get(); }

    /** Fraction of requests the primary handled. The cost saving is proportional to this. */
    public double GetAcceptRate() {
        long lTotal = lAccepted.get() + lEscalated.get();
        return (lTotal == 0L) ? 0.0 : lAccepted.get() / (double) lTotal;
    }

    @Override
    public String toString() {
        return GetName() + " accepted=" + lAccepted.get()
            + " escalated=" + lEscalated.get()
            + " primaryFailed=" + lPrimaryFailed.get()
            + " acceptRate=" + GetAcceptRate();
    }
}
