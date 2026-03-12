/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
    #uses plan AskQuestionsTensePlan;
    #uses plan AvoidingEyeContactTensePlan;
    #uses plan BlinkingRapidlyTensePlan;
    #uses plan ClearThroatTensePlan;
    #uses plan ClenchedJawTensePlan;
    #uses plan DifficultyFocusingTensePlan;
    #uses plan FidgetingTensePlan;
    #uses plan HeightenedSensesTensePlan;
    #uses plan JumpingToConclusionsTensePlan;
    #uses plan LipsPursedTensePlan;
    #uses plan LowerVoiceToWhisperTensePlan;
    #uses plan NegativeThinkingTensePlan;
    #uses plan OveranalyzingTensePlan;
    #uses plan OverPreparingPlan;
    #uses plan ProcrastinationTensePlan;
    #uses plan RepeatingWordsPlan;
    #uses plan RushedTasksPlan;
    #uses plan SecondGuessingTensePlan;
    #uses plan SeekingReassuranceTensePlan;
    #uses plan ShallowBreathingTensePlan;
    #uses plan ShiftWeightTensePlan;
    #uses plan ShortResponsesTensePlan;
    #uses plan SighTensePlan;
    #uses plan SpeakingQuicklyTensePlan;
    #uses plan StiffPostureTensePlan;
    #uses plan StutteringTensePlan;
    #uses plan TroubleFinishingSentencePlan;
    #uses plan VoiceStrainedPlan;
    #uses plan SetPlanContextTensePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
