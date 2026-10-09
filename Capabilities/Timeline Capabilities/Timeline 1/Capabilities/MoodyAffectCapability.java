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
public capability MoodyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMoodyPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> AngryOutburstPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> BeginningArgumentPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> ClammingUpPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> HighlyNegativePlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> InterruptingOthersPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> MisreadingSomethingSaidPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> MutteringMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> RaisingVoicePlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> RefusalToEngageConversationPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.VERBAL> SayingHurtfulThingsPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> CrossingArmsMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> ExhaggeratedHuffPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> FrownMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> LookAwayMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> RollingEyesMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> SighingMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> SourLookMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> StaringDownPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> TakingBigBreathsPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.NONVERBAL> ThrowingHandsUpMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> DistractingOneselfPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> EasilyFrustratedPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> EasilyHurtByCommentsPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> EasilyStartledPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> InabilityToAdmitWrongdoingPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> InabilityToSeeSituationPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> LettingOthersBeInChargePlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> MoodSwingsMoodyPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> UpsetBySmallSetbacksPlan;
    #uses BehaviorPlan<AffectEnum.MOODY, AffectEnum.ACTION> WithdrawingFromOthersPlan;

}

