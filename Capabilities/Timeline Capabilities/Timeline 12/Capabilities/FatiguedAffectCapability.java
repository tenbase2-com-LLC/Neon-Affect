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
public capability FatiguedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFatiguedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> ComplainFatiguedPlan2;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> LosingTrackConverstaionFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> QuietVoiceFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> RepeatingFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> RespondingToQuestionsSlowlyPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> ShortResponsedFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> SlowSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> SlurringWordsFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> SpeakingExcessivePausingPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.VERBAL> SpeakingNonsensicalPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> EyesBloodshotPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> EyesHeavyPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> HeadBobbingPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> LickingLipsFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> MovingSlowlyFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> PaleComplexionPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> SlackExpressionFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> StaringFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> WeakPostureFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.NONVERBAL> YawningFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> AttemptToWakeUpPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> ClumsinessFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> DecliningParticipationFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> ForgettingFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> InabilityConcentrateFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> LowerStandardsPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> ProcrastinationFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> SeekingMedicalAssistanceFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> SitFatiguedPlan;
    #uses BehaviorPlan<AffectEnum.FATIGUED, AffectEnum.ACTION> TakingLongBreakPlan;

}

