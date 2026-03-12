/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;


/**
 * 
 */
public beliefset Appraisals extends OpenWorld {
    #key field int id;
    #value field float $self_responsibility;
    #value field float $other_responsibility;
    #value field float $circumstances_responsibility;
    #value field float $problem_focused_coping;
    #value field float $goal_relevance;
    #value field float $attentional_activity;
    #value field float $emotion_focused_coping;
    #value field float $self_controllable;
    #value field float $other_controllable;
    #value field float $circumstances_controllable;
    #value field float $predictability;
    #value field float $threat;
    #value field float $pleasantness;
    #value field float $certainty;
    #value field float $goal_conduciveness;
    #value field float $fairness;
    #value field float $future_expectancy;
    #value field float $consistency_with_social_norms;
    #value field float $loss;
    #value field float $familiarity;
    #value field float $effort;
    #value field float $challenge;
    #value field float $consistency_with_internal_values;
    #value field float $expectedness;
    #indexed query get(logical int id, logical float $self_responsibility, logical float $other_responsibility, logical float $circumstances_responsibility, logical float $problem_focused_coping, logical float $goal_relevance, logical float $attentional_activity, logical float $emotion_focused_coping, logical float $self_controllable, logical float $other_controllable, logical float $circumstances_controllable, logical float $predictability, logical float $threat, logical float $pleasantness, logical float $certainty, logical float $goal_conduciveness, logical float $fairness, logical float $future_expectancy, logical float $consistency_with_social_norms, logical float $loss, logical float $familiarity, logical float $effort, logical float $challenge, logical float $consistency_with_internal_values, logical float $expectedness);


    public void add(AffectAppraisal affectAppraisal)
    {
        try
        {              
            add(nFacts(), 
                affectAppraisal.fSelfResponsibility,
                affectAppraisal.fOtherResponsibility,
                affectAppraisal.fCircumstancesResponsibility,
                affectAppraisal.fProblemFocusedCoping,
                affectAppraisal.fGoalRelevance,
                affectAppraisal.fAttentionalActivity,
                affectAppraisal.fEmotionFocusedCoping,
                affectAppraisal.fSelfControllable,
                affectAppraisal.fOtherControllable,
                affectAppraisal.fCircumstancesControllable,
                affectAppraisal.fPredictability,
                affectAppraisal.fThreat,
                affectAppraisal.fPleasantness,
                affectAppraisal.fCertainty,
                affectAppraisal.fGoalConduciveness,
                affectAppraisal.fFairness,
                affectAppraisal.fFutureExpectancy,
                affectAppraisal.fConsistencyWithSocialNorms,
                affectAppraisal.fLoss,
                affectAppraisal.fFamiliarity,
                affectAppraisal.fEffort,
                affectAppraisal.fChallenge,
                affectAppraisal.fConsistencyWithInternalValues,
                affectAppraisal.fExpectedness);
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

}
