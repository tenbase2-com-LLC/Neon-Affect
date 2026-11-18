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
public capability DenialAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDenialPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> AngerTowardSituationPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> ArguingPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> BackUpPositionPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> BeggingToBeBelievedPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> BlamingOthersPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> ChoppySentencesPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> InterruptingDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> MakingDemandsDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> NegativeDialoguePlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> QuestioningPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> RefusingDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> RefusingToArguePlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> RefusingToListenPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> SayingNoPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> SearchingForExcusePlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> SpeakingSlowlyPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> SpeaklyQuicklyNoInterruptionsPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> SteadyTonePlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> VoicePitchRisingPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> VoicingCommentsPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.VERBAL> WantingToBeAlone;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> ArmsCrossedPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> EyeContactDroppingPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> FakeSmileDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> LookAwayDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> ShakingHeadDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> ShruggingPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> SteadyEyeContactDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> StiffPostureDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> TightSmileDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.NONVERBAL> WaveAwayDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> BecomingBusyDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> ConcentrateDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> DefensiveDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> DistractingOneselfDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> DoingRoutineDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> IgnoringEventsDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> IgnoringProblemsDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> RationalizingPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> RefusingToAdmitMistakesDenialPlan;
    #uses BehaviorPlan<AffectEnum.DENIAL, AffectEnum.ACTION> ReplayingPastEventsPlan;

}

