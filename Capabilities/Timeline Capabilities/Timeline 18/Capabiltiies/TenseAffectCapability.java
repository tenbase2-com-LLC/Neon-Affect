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
public capability TenseAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextTensePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> AskQuestionsTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> ClearThroatTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> LowerVoiceToWhisperTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> RepeatingWordsPlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> ShortResponsesTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> SighTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> SpeakingQuicklyTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> StutteringTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> TroubleFinishingSentencePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.VERBAL> VoiceStrainedPlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> AvoidingEyeContactTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> BlinkingRapidlyTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> CheckWatchTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> ClenchedJawTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> FidgetingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> LipsPursedTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> ShallowBreathingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> ShiftWeightTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> StiffPostureTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.NONVERBAL> TappingFootTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> DifficultyFocusingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> HeightenedSensesTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> JumpingToConclusionsTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> NegativeThinkingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> OverPreparingPlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> OveranalyzingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> ProcrastinationTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> RushedTasksPlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> SecondGuessingTensePlan;
    #uses BehaviorPlan<AffectEnum.TENSE, AffectEnum.ACTION> SeekingReassuranceTensePlan;

}

