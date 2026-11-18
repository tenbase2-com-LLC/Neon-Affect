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
public capability FearAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFearPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> AskForHelpFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> AskQuestionsFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> CryingFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> InabilityToSpeakPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> LowerVoiceToWhisperPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> SpeakingCarefulWordsFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> StutteringPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> TalkToSelfPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> UncontrollableVoicePlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.VERBAL> VoiceTremorPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> DizzinessFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> FlinchingFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> GaspFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> HandOverMouthFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> HeavyBreathingPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> LickingLipsPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> LookAroundPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> RapidBlinkingPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> SelfHuggingPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> StaringNotSeeingPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.NONVERBAL> WipeBrowPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> ClumsinessFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> ConfusionFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> DefensiveFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> DoubtingSelfPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> FlawedReasoningPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> HypotheticalThinkingPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> JumpingToConclusionsFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> LackingSenseOfTimePlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> NeedToEscapeFearPlan;
    #uses BehaviorPlan<AffectEnum.FEAR, AffectEnum.ACTION> SeekingReassuranceFearPlan;

}

