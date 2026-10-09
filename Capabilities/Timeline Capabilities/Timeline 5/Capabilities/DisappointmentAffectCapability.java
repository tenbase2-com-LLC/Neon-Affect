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
public capability DisappointmentAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDisappointmentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> ComplainDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> CursingPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> ExpressingDisappointmentDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> LossForWordsDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> MonotoneVoiceDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> PointingOutShortComingsDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> PutOneselfDownPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> QuietVoiceDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> SpeakingLessDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.VERBAL> VoicingCriticismDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> BadPostureDiappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> BitingLipDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> BreakingEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> FaceGoingSlackPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> FlushedFaceDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> LipsPursedDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> LookAroundConfusionPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> LoweringHeadPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> MouthOpenSlighlyPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> RubbingPackOfNeckDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> ShakingHeadDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> SighDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> SwallowingHardDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> TearingDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.NONVERBAL> WinceDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> ContemplatingImprovementsDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> GiveUpGoalDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> GoingQuietPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> InabilityMoveOnPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> LossOfMotivationDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> ReplayingPastLetDownsDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> SeekingAlternativeOptionsDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> SeekingComfortDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> WantingToBeAloneDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.DISAPPOINTMENT, AffectEnum.ACTION> WorthlessnessPlan;

}

