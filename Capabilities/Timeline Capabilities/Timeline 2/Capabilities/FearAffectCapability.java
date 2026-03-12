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
public capability FearAffectCapability extends Capability {
    #uses plan InabilityToSpeakPlan;
    #uses plan RapidBlinkingPlan;
    #uses plan StaringNotSeeingPlan;
    #uses plan CryingFearPlan;
    #uses plan SelfHuggingPlan;
    #uses plan HeavyBreathingPlan;
    #uses plan LookAroundPlan;
    #uses plan UncontrollableVoicePlan;
    #uses plan LowerVoiceToWhisperPlan;
    #uses plan FlinchingFearPlan;
    #uses plan StutteringPlan;
    #uses plan VoiceTremorPlan;
    #uses plan ClumsinessFearPlan;
    #uses plan LickingLipsPlan;
    #uses plan WipeBrowPlan;
    #uses plan GaspFearPlan;
    #uses plan HandOverMouthFearPlan;
    #uses plan TalkToSelfPlan;
    #uses plan DizzinessFearPlan;
    #uses plan ConfusionFearPlan;
    #uses plan HypotheticalThinkingPlan;
    #uses plan FlawedReasoningPlan;
    #uses plan JumpingToConclusionsFearPlan;
    #uses plan LackingSenseOfTimePlan;
    #uses plan DoubtingSelfPlan;
    #uses plan SetPlanContextFearPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
