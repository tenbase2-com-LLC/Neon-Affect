
package NeonAffect;

import java.util.*;

public class AppraisalUtils {
    public boolean bDebug = true;
    private AffectAppraisalCalculator appraisalCalc = new AffectAppraisalCalculator(true);
    private PersonalityAppraisals personalityAppraisals = new PersonalityAppraisals();
    
    public AppraisalUtils()
    {
        
    }

    public int GetAppraisalType(float fSelfResponsibility, float fOtherResponsibility, float fCircumstancesResponsibility, float fProblemFocusedCoping, float fGoalRelevance, float fAttentionalActivity, float fEmotionFocusedCoping, float fSelfControllable, float fOtherControllable, float fCircumstancesControllable, float fPredictability, float fThreat, float fPleasantness, float fCertainty, float fGoalConduciveness, float fFairness, float fFutureExpectancy, float fConsistencyWithSocialNorms, float fLoss, float fFamiliarity, float fEffort, float fChallenge, float fConsistencyWithInternalValues, float fExpectedness, String strPersonalityType) throws Exception
    {   
        int iAppraisalType = -1;
        
        try
        {        
            if (bDebug)
            {
                System.out.println("AppraisalView.GetAppraisalType: personality type [" + strPersonalityType + "]");
            }
            
            AffectAppraisal affectAppraisal = new AffectAppraisal(fSelfResponsibility, fOtherResponsibility, fCircumstancesResponsibility, fProblemFocusedCoping, fGoalRelevance, fAttentionalActivity, fEmotionFocusedCoping, fSelfControllable, fOtherControllable, fCircumstancesControllable, fPredictability, fThreat, fPleasantness, fCertainty, fGoalConduciveness, fFairness, fFutureExpectancy, fConsistencyWithSocialNorms, fLoss, fFamiliarity, fEffort, fChallenge, fConsistencyWithInternalValues, fExpectedness);
      
            ArrayList appraisalList = (ArrayList)personalityAppraisals.get(strPersonalityType);
      
            iAppraisalType = appraisalCalc.GetMaxSimilarity(affectAppraisal, appraisalList);
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
        
        if (iAppraisalType == -1)
        {
            throw new Exception("AppraisalView: appraisal type not found.");                
        }
    
        return iAppraisalType;
    }

}
