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
public capability SadAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSadPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> AskForHelpSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> DifficultyRespondingSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> ExpressingFeelingsSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> MonotoneVoicePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> MumblingSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> OneWordAnswerSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> QuietVoiceSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> SighSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> SpeakingLessPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.VERBAL> WeakVoiceSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> BadPostureSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> CrossingArmsPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> CryingPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> EmptyStarePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> LookDownSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> NotSittingUprightPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> SighingSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> SlowBodyMovementsSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> TearingUpSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.NONVERBAL> WincingPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> DesireToEscapePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> DifficultyParticipatingPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> InabilityToSeeFuturePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> LossOfAppetitePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> LossOfInterestSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> NeedToBeAlonePlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> PerformingRoutinesSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> SeekingComfortSadPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> StrugglingWithMotivationPlan;
    #uses BehaviorPlan<AffectEnum.SAD, AffectEnum.ACTION> WithdrawingFromOthersSadPlan;

}

