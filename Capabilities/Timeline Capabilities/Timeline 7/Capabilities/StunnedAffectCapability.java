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
public capability StunnedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextStunnedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> ApathyFuturePlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> AskToRepeatStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> DelayedReactionPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> GaspStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> InabilityToSpeakStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> InarticulateStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> NotRespondingStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> RepeatAsQuestionStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> StammeringStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.VERBAL> VoicingConfusionPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> BlankStareStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> BlinkingSlowlyPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> DoubleTakeStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> FlatGazePlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> MouthOpenStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> RubbingEyesPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> SittingLimplyPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> StaringNotSeeingStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> StillnessStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.NONVERBAL> TakeStepBackStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> DifficultyFocusingStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> DisbeliefPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> DisorientatedStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> EmotionalNumbnessPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> ForgettingStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> NumbToCommentsStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> ReplayingExperienceStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> ShareExperienceStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> StopMidTaskStunnedPlan;
    #uses BehaviorPlan<AffectEnum.STUNNED, AffectEnum.ACTION> TakingSeatStunnedPlan;

}

