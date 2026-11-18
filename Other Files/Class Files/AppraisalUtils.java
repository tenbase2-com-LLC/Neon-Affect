package NeonAffect;

import java.util.List;

public class AppraisalUtils {

    public boolean bDebug = true;

    /**
     * Below this confidence a classification is reported as a near-tie on
     * stderr. Set to 0.0 to silence, or 1.0 to see the figure for every call.
     *
     * <p>Not gated on {@link #bDebug} on purpose. Debug output is something you
     * switch on when already suspicious; a near-tie is something you need to
     * know about precisely when you are not.</p>
     */
    public double minConfidence = AppraisalMatch.DEFAULT_MIN_CONFIDENCE;

    // Was new AffectAppraisalCalculator(true) - hard-coded, so the calculator
    // printed a similarity line per candidate however bDebug was set. With 158
    // affects that is 158 lines per classification, which buries whatever the
    // caller was actually trying to read. The flag is read lazily instead of in
    // a field initialiser because bDebug is public and set after construction.
    private AffectAppraisalCalculator appraisalCalc;
    private final PersonalityAppraisals personalityAppraisals = new PersonalityAppraisals();

    private AffectAppraisalCalculator calculator() {
        if (appraisalCalc == null) {
            appraisalCalc = new AffectAppraisalCalculator(bDebug);
        }
        return appraisalCalc;
    }

    /**
     * Classifies an appraisal for a personality type.
     *
     * <p>Signature unchanged: {@code AffectAppraisalEvent.event} calls this
     * with 24 bound logical variables, in {@link AppraisalDimensions#JSON}
     * order. Prefer {@link #GetAppraisalMatch} in new code - it returns the
     * same answer plus the margin it was decided by.</p>
     */
    public int GetAppraisalType(float fSelfResponsibility, float fOtherResponsibility,
            float fCircumstancesResponsibility, float fProblemFocusedCoping,
            float fGoalRelevance, float fAttentionalActivity, float fEmotionFocusedCoping,
            float fSelfControllable, float fOtherControllable, float fCircumstancesControllable,
            float fPredictability, float fThreat, float fPleasantness, float fCertainty,
            float fGoalConduciveness, float fFairness, float fFutureExpectancy,
            float fConsistencyWithSocialNorms, float fLoss, float fFamiliarity,
            float fEffort, float fChallenge, float fConsistencyWithInternalValues,
            float fExpectedness, String strPersonalityType) throws Exception {

        var affectAppraisal = new AffectAppraisal(
            fSelfResponsibility, fOtherResponsibility, fCircumstancesResponsibility,
            fProblemFocusedCoping, fGoalRelevance, fAttentionalActivity,
            fEmotionFocusedCoping, fSelfControllable, fOtherControllable,
            fCircumstancesControllable, fPredictability, fThreat, fPleasantness,
            fCertainty, fGoalConduciveness, fFairness, fFutureExpectancy,
            fConsistencyWithSocialNorms, fLoss, fFamiliarity, fEffort,
            fChallenge, fConsistencyWithInternalValues, fExpectedness);

        return GetAppraisalMatch(affectAppraisal, strPersonalityType).getIndex();
    }

    /**
     * Classifies an appraisal and reports how close the decision was.
     *
     * @throws Exception if the personality type is unknown or nothing matched
     */
    public AppraisalMatch GetAppraisalMatch(AffectAppraisal affectAppraisal,
                                            String strPersonalityType)
        throws Exception {

        if (affectAppraisal == null) {
            throw new Exception("AppraisalView: appraisal is null.");
        }

        if (bDebug) {
            System.out.println("AppraisalView.GetAppraisalType: personality type ["
                + strPersonalityType + "]");
        }

        List<AffectAppraisal> appraisalList =
            personalityAppraisals.get(strPersonalityType);

        if (appraisalList == null) {
            throw new Exception("AppraisalView: no appraisal prototypes for "
                + "personality type [" + strPersonalityType + "]. Expected "
                + "one of the sixteen MBTI codes.");
        }

        // Exceptions from the match are no longer swallowed. The previous
        // version caught, printed a stack trace, and carried on to throw a
        // generic "appraisal type not found" - which reported a cause-less
        // failure for what was usually a specific one.
        AppraisalMatch match = calculator().GetBestMatch(affectAppraisal, appraisalList);

        if (match.getIndex() == -1) {
            throw new Exception("AppraisalView: appraisal type not found for "
                + "personality type [" + strPersonalityType + "] against "
                + appraisalList.size() + " prototypes.");
        }

        if (match.isNearTie(minConfidence)) {
            // The decision rested on almost nothing. Saying so is the whole
            // point: a bare index reports a coin-toss and a clear win
            // identically, and the coin-tosses are where the nonsense
            // classifications come from.
            System.err.println("AppraisalUtils: NEAR-TIE for ["
                + strPersonalityType + "] - " + match);
        }

        return match;
    }
}
