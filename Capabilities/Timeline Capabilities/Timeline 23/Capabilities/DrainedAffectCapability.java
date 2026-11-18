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
public capability DrainedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDrainedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> ComplainFatiguedDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> DeclineSuggestionsDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> ExcuseToLeaveDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> ExpressingLackOfEnthusiasmDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> MonotoneVoiceDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> ShortResponsesDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> SighDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> SlowSpeechDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> SpeakingLessDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.VERBAL> WeakVoiceDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> DeepExhaleDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> DropShouldersDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> EyesHeavyDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> LoweredEyeContactDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> MassagingTemplesDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> RubBackOfNeckDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> SlowingBodyMovementsDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> SmilingPolitelyDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> WeakPostureDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.NONVERBAL> YawningDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> DecliningParticipationDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> InabilityConcentrateDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> LackOfMotivationDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> LettingOthersBeInChargeDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> LimitingEmotionalReactionsDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> LowerStandardsDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> ProcrastinationDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> TakingLongBreakDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> WishingForComfortDrainedPlan;
    #uses BehaviorPlan<AffectEnum.DRAINED, AffectEnum.ACTION> WithdrawalFromOthersDrainedPlan;

}

