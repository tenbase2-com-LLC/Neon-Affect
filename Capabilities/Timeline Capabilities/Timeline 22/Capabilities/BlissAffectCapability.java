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
public capability BlissAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBlissPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> DescribingSensationsBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> ExpressingGratitudeBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> HummingWhistlingSingingBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> LaughingBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> PositiveAffirmationBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> SharingFeelingsBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> SoftGentleVoiceBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> SpeechlessnessBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> UnhurriedSpeechBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.VERBAL> VerbaliszingJoyBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> CloseEyesDeepBreathBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> EyesWideAndGlowingBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> FluidMovementBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> HalfClosedEyesBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> HuggingBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> RelaxedPostureBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> SlowEvenBreathsBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> SmileGrinCannotBeContainedBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> SparklingEyesBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.NONVERBAL> UnrestrainedSmilingLaughterBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> CaptureMemoryBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> EnjoyingMomentBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> IncreasedGenerosityBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> LettingGoConcernsBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> LivingForTheMomentBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> MoreLikelyToNoticeBeautyBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> NoticingLittleThingsBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> SenseOfContentmentBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> SpreadJoyBlissPlan;
    #uses BehaviorPlan<AffectEnum.BLISS, AffectEnum.ACTION> WantingFeelingToLastBlissPlan;

}

