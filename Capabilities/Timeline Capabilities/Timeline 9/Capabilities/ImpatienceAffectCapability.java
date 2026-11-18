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
public capability ImpatienceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextImpatiencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> AbnoxiousImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> GetThingsGoingPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> GettingToPointSpeechPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> InterruptingImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> MakeDemandsPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> SarcasmPatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> SetTimeLimitPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> SharpTonePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> TalkingOverOthersPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.VERBAL> YellingImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> ArmsCrosseImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> CheckWatchPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> ClenchedTeethPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> DeepExhalePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> FidgetingImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> FrownImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> InattentiveImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> LookingUpwardImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> MassagingTemplesPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> PurseLipsImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> ScowlingPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> SensitiveNoiseImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> ShakingHeadImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> SquintEyesImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> StiffPostureImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.NONVERBAL> TappingFootPlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> CalculatingTimeRemainingImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> DemandingImmediateActionImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> FrustratedAtInterruptionsImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> IrritabilityImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> MakingQuickDecisionsImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> NotEasilyDistractedImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> QuickToActionImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> RushedTasksImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> SnappingUnderPressureImpatiencePlan;
    #uses BehaviorPlan<AffectEnum.IMPATIENCE, AffectEnum.ACTION> StrayingAttentionImpatiencePlan;

}

