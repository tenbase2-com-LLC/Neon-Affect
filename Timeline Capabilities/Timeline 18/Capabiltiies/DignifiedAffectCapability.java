/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public capability DignifiedAffectCapability extends Capability {
    #uses plan ActingWithIntegrityPlan;
    #uses plan ArticulatedSpeechDiginifiedPlan;
    #uses plan ClaspedHandsDignifiedPlan;
    #uses plan ConsideringConsequencesDignifiedPlan;
    #uses plan ControlledBreathingPlan;
    #uses plan DecliningSuggestionsPlan;
    #uses plan DemonstratingHumilityPlan;
    #uses plan ExercisingDiscretionPlan;
    #uses plan FacialExpressionsDignifiedPlan;
    #uses plan GivingComplementsDignifiedPlan;
    #uses plan HandlingCriticismPlan;
    #uses plan MaintainComposureInSpeechPlan;
    #uses plan MaintainingEthicalStandardsPlan;
    #uses plan MeasuredResponsesPlan;
    #uses plan RefinedGesturesPlan;
    #uses plan ShowingPatiencePlan;
    #uses plan ShowingRestraintInEmotionsPlan;
    #uses plan SlowBodyMovementsDignifiedPlan;
    #uses plan SlowNodDignifiedPlan;
    #uses plan SpeakingDeliberatelyDignifiedPlan;
    #uses plan SpeakingWithAuthorityPlan;
    #uses plan SteadyEyeContactDignifiedPlan;
    #uses plan StiffPostureDignifiedPlan;
    #uses plan UpholdingTraditionPlan;
    #uses plan UsingFormalAddressPlan;
    #uses plan UsingPreciseLanguageDignifiedPlan;
    #uses plan SetPlanContextDignifiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
