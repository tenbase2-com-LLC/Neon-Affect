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
public capability DevastationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDevastationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> AskToRepeatPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> CryingDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> DelayedReactionDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> ExpressingHopelessnessDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> InarticulateDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> MoaningDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> NotRespondingDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> RepeatingNegativesPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> VerballDenyingBadNewsDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.VERBAL> WeakVoicePlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> CoverFaceHandsDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> DeepBreathDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> FlatGazeDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> HeadShakingDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> MouthOpenDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> SitDevaatationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> SittingLimplyDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> StaringDownDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> StillnessDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.NONVERBAL> TearingDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> AskForHelpDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> ConfusionDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> DisbeliefDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> DizzinessDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> EmotionalNumbnessDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> LackOfMotivationDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> NumbToCommentsPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> SeekingComfortDevastationPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> StopMidTaskPlan;
    #uses BehaviorPlan<AffectEnum.DEVASTATION, AffectEnum.ACTION> WithdrawingFromOthersDevastationPlan;

}

