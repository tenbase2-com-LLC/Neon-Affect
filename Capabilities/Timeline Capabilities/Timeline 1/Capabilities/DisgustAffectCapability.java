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
public capability DisgustAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDisgustPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> ChangeSubjectDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> DemandStopSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> HardToneDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> LosingTrackOnesWordsPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> MakingTskNoiseDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> MutteringDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> OfferingEvasiveAnswersPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> RepeatSaidNoEmotionPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> SpeakingUnsteadyVoicePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.VERBAL> SwearingDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> CringePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> CurledLipPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> EyesColdPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> FlinchingPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> JerkingAwayFromContactPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> RefusingToLookPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> RubbingNosePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> ShakingHeadPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> SwallowingHardPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> TroubleSwallowingPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.NONVERBAL> WrinklingNosePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> AvoidingPersonDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> BecomingUnresponsivePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> DisengageFromInteractionDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> JudgementalDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> LossOfAppetiteDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> MindReplayingAgonizingPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> NeedToEscapeDisgustPlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> UnableToConcentratePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> WishingSomewhereElsePlan;
    #uses BehaviorPlan<AffectEnum.DISGUST, AffectEnum.ACTION> WithdrawingFromOthersDisgustPlan;

}

