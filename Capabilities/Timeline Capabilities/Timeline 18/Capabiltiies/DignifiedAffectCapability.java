/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDignifiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> ArticulatedSpeechDiginifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> DecliningSuggestionsPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> GivingComplementsDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> GraciousDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> MaintainComposureInSpeechPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> MeasuredResponsesPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> SpeakingDeliberatelyDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> SpeakingWithAuthorityPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> UsingFormalAddressPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.VERBAL> UsingPreciseLanguageDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> ClaspedHandsDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> ControlledBreathingPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> FacialExpressionsDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> HeadHeldHighDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> RefinedGesturesPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> RelaxedSmileDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> SlowBodyMovementsDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> SlowNodDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> SteadyEyeContactDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.NONVERBAL> StiffPostureDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ActingWithIntegrityPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ConsideringConsequencesDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ConsideringOthersPerspectivesDignifiedPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> DemonstratingHumilityPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ExercisingDiscretionPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> HandlingCriticismPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> MaintainingEthicalStandardsPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ShowingPatiencePlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> ShowingRestraintInEmotionsPlan;
    #uses BehaviorPlan<AffectEnum.DIGNIFIED, AffectEnum.ACTION> UpholdingTraditionPlan;

}

