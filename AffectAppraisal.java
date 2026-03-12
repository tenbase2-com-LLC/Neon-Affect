package NeonAffect;

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
    
    public AffectAppraisal()
    {
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
        
    public AffectAppraisal(float fSelfResponsibility, float fOtherResponsibility, float fCircumstancesResponsibility,
                           float fProblemFocusedCoping, float fGoalRelevance, float fAttentionalActivity,
                           float fEmotionFocusedCoping, float fSelfControllable, float fOtherControllable,
                           float fCircumstancesControllable, float fPredictability, float fThreat, float fPleasantness,
                           float fCertainty, float fGoalConduciveness, float fFairness, float fFutureExpectancy,
                           float fConsistencyWithSocialNorms, float fLoss, float fFamiliarity, float fEffort,
                           float fChallenge, float fConsistencyWithInternalValues, float fExpectedness)
    {
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
    
    public AffectAppraisal(AffectAppraisal appraisal1)
    {
        this.fSelfResponsibility = appraisal1.fSelfResponsibility;
        this.fOtherResponsibility = appraisal1.fOtherResponsibility;
        this.fCircumstancesResponsibility = appraisal1.fCircumstancesResponsibility;
        this.fProblemFocusedCoping = appraisal1.fProblemFocusedCoping;
        this.fGoalRelevance = appraisal1.fGoalRelevance;
        this.fAttentionalActivity = appraisal1.fAttentionalActivity;
        this.fEmotionFocusedCoping = appraisal1.fEmotionFocusedCoping;
        this.fSelfControllable = appraisal1.fSelfControllable;
        this.fOtherControllable = appraisal1.fOtherControllable;
        this.fCircumstancesControllable = appraisal1.fCircumstancesControllable;
        this.fPredictability = appraisal1.fPredictability;
        this.fThreat = appraisal1.fThreat;
        this.fPleasantness = appraisal1.fPleasantness;
        this.fCertainty = appraisal1.fCertainty;
        this.fGoalConduciveness = appraisal1.fGoalConduciveness;
        this.fFairness = appraisal1.fFairness;
        this.fFutureExpectancy = appraisal1.fFutureExpectancy;
        this.fConsistencyWithSocialNorms = appraisal1.fConsistencyWithSocialNorms;
        this.fLoss = appraisal1.fLoss;
        this.fFamiliarity = appraisal1.fFamiliarity;
        this.fEffort = appraisal1.fEffort;
        this.fChallenge = appraisal1.fChallenge;
        this.fConsistencyWithInternalValues = appraisal1.fConsistencyWithInternalValues;
        this.fExpectedness = appraisal1.fExpectedness;
    }
    
    public boolean equals(Object obj)
    {
        if (obj == this) { 
            return true;
        }
        if (!(obj instanceof AffectAppraisal)) {
            return false; 
        }
        AffectAppraisal other = (AffectAppraisal) obj;
        return (Float.compare(this.fSelfResponsibility, other.fSelfResponsibility) == 0
                && Float.compare(this.fOtherResponsibility, other.fOtherResponsibility) == 0
                && Float.compare(this.fCircumstancesResponsibility, other.fCircumstancesResponsibility) == 0
                && Float.compare(this.fProblemFocusedCoping, other.fProblemFocusedCoping) == 0
                && Float.compare(this.fGoalRelevance, other.fGoalRelevance) == 0
                && Float.compare(this.fAttentionalActivity, other.fAttentionalActivity) == 0
                && Float.compare(this.fEmotionFocusedCoping, other.fEmotionFocusedCoping) == 0
                && Float.compare(this.fSelfControllable, other.fSelfControllable) == 0
                && Float.compare(this.fOtherControllable, other.fOtherControllable) == 0
                && Float.compare(this.fCircumstancesControllable, other.fCircumstancesControllable) == 0
                && Float.compare(this.fPredictability, other.fPredictability) == 0
                && Float.compare(this.fThreat, other.fThreat) == 0
                && Float.compare(this.fPleasantness, other.fPleasantness) == 0
                && Float.compare(this.fCertainty, other.fCertainty) == 0
                && Float.compare(this.fGoalConduciveness, other.fGoalConduciveness) == 0
                && Float.compare(this.fFairness, other.fFairness) == 0
                && Float.compare(this.fFutureExpectancy, other.fFutureExpectancy) == 0
                && Float.compare(this.fConsistencyWithSocialNorms, other.fConsistencyWithSocialNorms) == 0
                && Float.compare(this.fLoss, other.fLoss) == 0
                && Float.compare(this.fFamiliarity, other.fFamiliarity) == 0
                && Float.compare(this.fEffort, other.fEffort) == 0
                && Float.compare(this.fChallenge, other.fChallenge) == 0
                && Float.compare(this.fConsistencyWithInternalValues, other.fConsistencyWithInternalValues) == 0
                && Float.compare(this.fExpectedness, other.fExpectedness) == 0); 
    }
    
    public String ToString()
    {
        String str = "";
        
        str += "AffectAppraisal:\n";
        str += "fSelfResponsibility: [" + Float.toString(fSelfResponsibility) + "]\n";
        str +="fOtherResponsibility: [" + Float.toString(fOtherResponsibility) + "]\n";
        str += "fCircumstancesResponsibility: [" + Float.toString(fCircumstancesResponsibility) + "]\n";
        str += "fProblemFocusedCoping: [" + Float.toString(fProblemFocusedCoping) + "]\n";
        str += "fGoalRelevance: [" + Float.toString(fGoalRelevance) + "]\n";
        str += "fAttentionalActivity: [" + Float.toString(fAttentionalActivity) + "]\n";
        str += "fEmotionFocusedCoping: [" + Float.toString(fEmotionFocusedCoping) + "]\n";
        str += "fSelfControllable: [" + Float.toString(fSelfControllable) + "]\n";
        str += "fOtherControllable: [" + Float.toString(fOtherControllable) + "]\n";
        str += "fCircumstancesControllable: [" + Float.toString(fCircumstancesControllable) + "]\n";
        str += "fPredictability: [" + Float.toString(fPredictability) + "]\n";
        str += "fThreat: [" + Float.toString(fThreat) + "]\n";
        str += "fPleasantness: [" + Float.toString(fPleasantness) + "]\n";
        str += "fCertainty: [" + Float.toString(fCertainty) + "]\n";
        str += "fGoalConduciveness: [" + Float.toString(fGoalConduciveness) + "]\n";
        str += "fFairness: [" + Float.toString(fFairness) + "]\n";
        str += "fFutureExpectancy: [" + Float.toString(fFutureExpectancy) + "]\n";
        str += "fConsistencyWithSocialNorms: [" + Float.toString(fConsistencyWithSocialNorms) + "]\n";
        str += "fLoss: [" + Float.toString(fLoss) + "]\n";
        str += "fFamiliarity: [" + Float.toString(fFamiliarity) + "]\n";
        str += "fEffort: [" + Float.toString(fEffort) + "]\n";
        str += "fChallenge: [" + Float.toString(fChallenge) + "]\n";
        str += "fConsistencyWithInternalValues: [" + Float.toString(fConsistencyWithInternalValues) + "]\n";
        str += "fExpectedness: [" + Float.toString(fExpectedness) + "]\n\n";
        
        return str;
    }
    
    public float[] ToArray()
    {
        float[] values = new float[24];
        
        values[0] = fSelfResponsibility;
        values[1] = fOtherResponsibility;
        values[2] = fCircumstancesResponsibility;
        values[3] = fProblemFocusedCoping;
        values[4] = fGoalRelevance;
        values[5] = fAttentionalActivity;
        values[6] = fEmotionFocusedCoping;
        values[7] = fSelfControllable;
        values[8] = fOtherControllable;
        values[9] = fCircumstancesControllable;
        values[10] = fPredictability;
        values[11] = fThreat;
        values[12] = fPleasantness;
        values[13] = fCertainty;
        values[14] = fGoalConduciveness;
        values[15] = fFairness;
        values[16] = fFutureExpectancy;
        values[17] = fConsistencyWithSocialNorms;
        values[18] = fLoss;
        values[19] = fFamiliarity;
        values[20] = fEffort;
        values[21] = fChallenge;
        values[22] = fConsistencyWithInternalValues;
        values[23] = fExpectedness;
       
        return values;        
    }
}

