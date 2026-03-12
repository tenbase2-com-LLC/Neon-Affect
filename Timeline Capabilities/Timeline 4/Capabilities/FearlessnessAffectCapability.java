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
public capability FearlessnessAffectCapability extends Capability {
    #uses plan CalmExteriorPlan;
    #uses plan GoodPostureFearlessnessPlan;
    #uses plan LeanInFearlessnessPlan;
    #uses plan AskQuestionsFearlessnessPlan;
    #uses plan PositiveSelfTalkPlan;
    #uses plan NoddingFearlessPlan;
    #uses plan BeingDirectPlan;
    #uses plan DeepBreathFearlessPlan;
    #uses plan ToThePointSpeechPlan;
    #uses plan EvenSeriousTonePlan;
    #uses plan CalmingSpeechPlan;
    #uses plan ImpatienceFromSpeechPlan;
    #uses plan SelfSufficentPlan;
    #uses plan ObservingBeforeReactingPlan;
    #uses plan ImaginingWorstCaseScenarioPlan;
    #uses plan TryNewThingsFearlessnessPlan;
    #uses plan TakingOnChallengesPlan;
    #uses plan NoProcrastinationFearlessnessPlan;
    #uses plan NoiseSensitivityFearlessnessPlan;
    #uses plan AvoidingDistractionsPlan;
    #uses plan ThinkingLogicallyPlan;
    #uses plan HesitationFearlessnessPlan;
    #uses plan AskPermissionPlan;
    #uses plan AvoidingEyeContactFearlessnessPlan;
    #uses plan SetPlanContextFearlessnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
