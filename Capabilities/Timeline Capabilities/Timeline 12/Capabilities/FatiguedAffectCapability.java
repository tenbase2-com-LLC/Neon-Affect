/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
    #uses plan AttemptToWakeUpPlan;
    #uses plan ClumsinessFatiguedPlan;
    #uses plan ComplainFatiguedPlan2;
    #uses plan EyesBloodshotPlan;
    #uses plan EyesHeavyPlan;
    #uses plan HeadBobbingPlan;
    #uses plan LickingLipsFatiguedPlan;
    #uses plan LosingTrackConverstaionFatiguedPlan;
    #uses plan LowerStandardsPlan;
    #uses plan MovingSlowlyFatiguedPlan;
    #uses plan PaleComplexionPlan;
    #uses plan QuietVoiceFatiguedPlan;
    #uses plan RepeatingFatiguedPlan;
    #uses plan RespondingToQuestionsSlowlyPlan;
    #uses plan SeekingMedicalAssistanceFatiguedPlan;
    #uses plan ShortResponsedFatiguedPlan;
    #uses plan SitFatiguedPlan;
    #uses plan SlackExpressionFatiguedPlan;
    #uses plan SlowSpeechPlan;
    #uses plan SlurringWordsFatiguedPlan;
    #uses plan SpeakingExcessivePausingPlan;
    #uses plan SpeakingNonsensicalPlan;
    #uses plan StaringFatiguedPlan;
    #uses plan TakingLongBreakPlan;
    #uses plan WeakPostureFatiguedPlan;
    #uses plan YawningFatiguedPlan;
    #uses plan SetPlanContextFatiguedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
