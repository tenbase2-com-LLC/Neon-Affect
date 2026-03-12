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
public capability DeterminationAffectCapability extends Capability {
    #uses plan FirstToSpeakPlan;
    #uses plan ArticulatedSpeechPlan;
    #uses plan LowVoicePlan;
    #uses plan StrongEyeContactDeterminationPlan;
    #uses plan QuickNodDeterminationPlan;
    #uses plan AffirmativeWordsPlan;
    #uses plan LipsTogetherDeterminationPlan;
    #uses plan StandingFirmPlan;
    #uses plan LeanInDeterminationPlan;
    #uses plan PushUpSleavesPlan;
    #uses plan AskingQuestionsDeterminationPlan;
    #uses plan ListeningDeterminationPlan;
    #uses plan PurposefulDeterminationPlan;
    #uses plan IgnoringDistractionsPlan;
    #uses plan RehearsingPlan;
    #uses plan SacrificingPlan;
    #uses plan SetPlanContextDeterminationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
