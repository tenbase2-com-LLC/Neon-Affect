package NeonAffect;

import java.util.Objects;

public class AffectAppraisal {

    public float fSelfResponsibility;
    public float fOtherResponsibility;
    public float fCircumstancesResponsibility;
    public float fProblemFocusedCoping;
    public float fGoalRelevance;
    public float fAttentionalActivity;
    public float fEmotionFocusedCoping;
    public float fSelfControllable;
    public float fOtherControllable;
    public float fCircumstancesControllable;
    public float fPredictability;
    public float fThreat;
    public float fPleasantness;
    public float fCertainty;
    public float fGoalConduciveness;
    public float fFairness;
    public float fFutureExpectancy;
    public float fConsistencyWithSocialNorms;
    public float fLoss;
    public float fFamiliarity;
    public float fEffort;
    public float fChallenge;
    public float fConsistencyWithInternalValues;
    public float fExpectedness;

    public AffectAppraisal() {
        fSelfResponsibility = -1f;
        fOtherResponsibility = -1f;
        fCircumstancesResponsibility = -1f;
        fProblemFocusedCoping = -1f;
        fGoalRelevance = -1f;
        fAttentionalActivity = -1f;
        fEmotionFocusedCoping = -1f;
        fSelfControllable = -1f;
        fOtherControllable = -1f;
        fCircumstancesControllable = -1f;
        fPredictability = -1f;
        fThreat = -1f;
        fPleasantness = -1f;
        fCertainty = -1f;
        fGoalConduciveness = -1f;
        fFairness = -1f;
        fFutureExpectancy = -1f;
        fConsistencyWithSocialNorms = -1f;
        fLoss = -1f;
        fFamiliarity = -1f;
        fEffort = -1f;
        fChallenge = -1f;
        fConsistencyWithInternalValues = -1f;
        fExpectedness = -1f;
    }

    public AffectAppraisal(float fSelfResponsibility, float fOtherResponsibility,
                           float fCircumstancesResponsibility, float fProblemFocusedCoping,
                           float fGoalRelevance, float fAttentionalActivity,
                           float fEmotionFocusedCoping, float fSelfControllable,
                           float fOtherControllable, float fCircumstancesControllable,
                           float fPredictability, float fThreat, float fPleasantness,
                           float fCertainty, float fGoalConduciveness, float fFairness,
                           float fFutureExpectancy, float fConsistencyWithSocialNorms,
                           float fLoss, float fFamiliarity, float fEffort,
                           float fChallenge, float fConsistencyWithInternalValues,
                           float fExpectedness) {
        this.fSelfResponsibility = fSelfResponsibility;
        this.fOtherResponsibility = fOtherResponsibility;
        this.fCircumstancesResponsibility = fCircumstancesResponsibility;
        this.fProblemFocusedCoping = fProblemFocusedCoping;
        this.fGoalRelevance = fGoalRelevance;
        this.fAttentionalActivity = fAttentionalActivity;
        this.fEmotionFocusedCoping = fEmotionFocusedCoping;
        this.fSelfControllable = fSelfControllable;
        this.fOtherControllable = fOtherControllable;
        this.fCircumstancesControllable = fCircumstancesControllable;
        this.fPredictability = fPredictability;
        this.fThreat = fThreat;
        this.fPleasantness = fPleasantness;
        this.fCertainty = fCertainty;
        this.fGoalConduciveness = fGoalConduciveness;
        this.fFairness = fFairness;
        this.fFutureExpectancy = fFutureExpectancy;
        this.fConsistencyWithSocialNorms = fConsistencyWithSocialNorms;
        this.fLoss = fLoss;
        this.fFamiliarity = fFamiliarity;
        this.fEffort = fEffort;
        this.fChallenge = fChallenge;
        this.fConsistencyWithInternalValues = fConsistencyWithInternalValues;
        this.fExpectedness = fExpectedness;
    }

    public AffectAppraisal(AffectAppraisal other) {
        this.fSelfResponsibility = other.fSelfResponsibility;
        this.fOtherResponsibility = other.fOtherResponsibility;
        this.fCircumstancesResponsibility = other.fCircumstancesResponsibility;
        this.fProblemFocusedCoping = other.fProblemFocusedCoping;
        this.fGoalRelevance = other.fGoalRelevance;
        this.fAttentionalActivity = other.fAttentionalActivity;
        this.fEmotionFocusedCoping = other.fEmotionFocusedCoping;
        this.fSelfControllable = other.fSelfControllable;
        this.fOtherControllable = other.fOtherControllable;
        this.fCircumstancesControllable = other.fCircumstancesControllable;
        this.fPredictability = other.fPredictability;
        this.fThreat = other.fThreat;
        this.fPleasantness = other.fPleasantness;
        this.fCertainty = other.fCertainty;
        this.fGoalConduciveness = other.fGoalConduciveness;
        this.fFairness = other.fFairness;
        this.fFutureExpectancy = other.fFutureExpectancy;
        this.fConsistencyWithSocialNorms = other.fConsistencyWithSocialNorms;
        this.fLoss = other.fLoss;
        this.fFamiliarity = other.fFamiliarity;
        this.fEffort = other.fEffort;
        this.fChallenge = other.fChallenge;
        this.fConsistencyWithInternalValues = other.fConsistencyWithInternalValues;
        this.fExpectedness = other.fExpectedness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof AffectAppraisal other)) return false;
        return Float.compare(fSelfResponsibility, other.fSelfResponsibility) == 0
            && Float.compare(fOtherResponsibility, other.fOtherResponsibility) == 0
            && Float.compare(fCircumstancesResponsibility, other.fCircumstancesResponsibility) == 0
            && Float.compare(fProblemFocusedCoping, other.fProblemFocusedCoping) == 0
            && Float.compare(fGoalRelevance, other.fGoalRelevance) == 0
            && Float.compare(fAttentionalActivity, other.fAttentionalActivity) == 0
            && Float.compare(fEmotionFocusedCoping, other.fEmotionFocusedCoping) == 0
            && Float.compare(fSelfControllable, other.fSelfControllable) == 0
            && Float.compare(fOtherControllable, other.fOtherControllable) == 0
            && Float.compare(fCircumstancesControllable, other.fCircumstancesControllable) == 0
            && Float.compare(fPredictability, other.fPredictability) == 0
            && Float.compare(fThreat, other.fThreat) == 0
            && Float.compare(fPleasantness, other.fPleasantness) == 0
            && Float.compare(fCertainty, other.fCertainty) == 0
            && Float.compare(fGoalConduciveness, other.fGoalConduciveness) == 0
            && Float.compare(fFairness, other.fFairness) == 0
            && Float.compare(fFutureExpectancy, other.fFutureExpectancy) == 0
            && Float.compare(fConsistencyWithSocialNorms, other.fConsistencyWithSocialNorms) == 0
            && Float.compare(fLoss, other.fLoss) == 0
            && Float.compare(fFamiliarity, other.fFamiliarity) == 0
            && Float.compare(fEffort, other.fEffort) == 0
            && Float.compare(fChallenge, other.fChallenge) == 0
            && Float.compare(fConsistencyWithInternalValues, other.fConsistencyWithInternalValues) == 0
            && Float.compare(fExpectedness, other.fExpectedness) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fSelfResponsibility, fOtherResponsibility,
            fCircumstancesResponsibility, fProblemFocusedCoping, fGoalRelevance,
            fAttentionalActivity, fEmotionFocusedCoping, fSelfControllable,
            fOtherControllable, fCircumstancesControllable, fPredictability,
            fThreat, fPleasantness, fCertainty, fGoalConduciveness, fFairness,
            fFutureExpectancy, fConsistencyWithSocialNorms, fLoss, fFamiliarity,
            fEffort, fChallenge, fConsistencyWithInternalValues, fExpectedness);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AffectAppraisal:\n");
        sb.append("fSelfResponsibility: [").append(fSelfResponsibility).append("]\n");
        sb.append("fOtherResponsibility: [").append(fOtherResponsibility).append("]\n");
        sb.append("fCircumstancesResponsibility: [").append(fCircumstancesResponsibility).append("]\n");
        sb.append("fProblemFocusedCoping: [").append(fProblemFocusedCoping).append("]\n");
        sb.append("fGoalRelevance: [").append(fGoalRelevance).append("]\n");
        sb.append("fAttentionalActivity: [").append(fAttentionalActivity).append("]\n");
        sb.append("fEmotionFocusedCoping: [").append(fEmotionFocusedCoping).append("]\n");
        sb.append("fSelfControllable: [").append(fSelfControllable).append("]\n");
        sb.append("fOtherControllable: [").append(fOtherControllable).append("]\n");
        sb.append("fCircumstancesControllable: [").append(fCircumstancesControllable).append("]\n");
        sb.append("fPredictability: [").append(fPredictability).append("]\n");
        sb.append("fThreat: [").append(fThreat).append("]\n");
        sb.append("fPleasantness: [").append(fPleasantness).append("]\n");
        sb.append("fCertainty: [").append(fCertainty).append("]\n");
        sb.append("fGoalConduciveness: [").append(fGoalConduciveness).append("]\n");
        sb.append("fFairness: [").append(fFairness).append("]\n");
        sb.append("fFutureExpectancy: [").append(fFutureExpectancy).append("]\n");
        sb.append("fConsistencyWithSocialNorms: [").append(fConsistencyWithSocialNorms).append("]\n");
        sb.append("fLoss: [").append(fLoss).append("]\n");
        sb.append("fFamiliarity: [").append(fFamiliarity).append("]\n");
        sb.append("fEffort: [").append(fEffort).append("]\n");
        sb.append("fChallenge: [").append(fChallenge).append("]\n");
        sb.append("fConsistencyWithInternalValues: [").append(fConsistencyWithInternalValues).append("]\n");
        sb.append("fExpectedness: [").append(fExpectedness).append("]\n");
        return sb.toString();
    }

    /** Legacy alias for toString() — called from .plan files as ToString(). */
    public String ToString() {
        return toString();
    }

    public float[] toArray() {
        return new float[] {
            fSelfResponsibility, fOtherResponsibility, fCircumstancesResponsibility,
            fProblemFocusedCoping, fGoalRelevance, fAttentionalActivity,
            fEmotionFocusedCoping, fSelfControllable, fOtherControllable,
            fCircumstancesControllable, fPredictability, fThreat, fPleasantness,
            fCertainty, fGoalConduciveness, fFairness, fFutureExpectancy,
            fConsistencyWithSocialNorms, fLoss, fFamiliarity, fEffort,
            fChallenge, fConsistencyWithInternalValues, fExpectedness
        };
    }

    /** @deprecated Use {@link #toArray()} (lowercase 't'). */
    @Deprecated
    public float[] ToArray() { return toArray(); }
}
