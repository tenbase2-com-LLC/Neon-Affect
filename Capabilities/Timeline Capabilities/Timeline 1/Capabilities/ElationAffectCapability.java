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
public capability ElationAffectCapability extends Capability {
    #uses plan FlushedFaceElationPlan;
    #uses plan SmileGrinCannotBeContainedPlan;
    #uses plan LaughingPlan;
    #uses plan ScreamingShoutingPlan;
    #uses plan TalkingOverOneAnotherPlan;
    #uses plan NotCaringWhatOthersThinkPlan;
    #uses plan EyesWideAndGlowingPlan;
    #uses plan DeepBreathsPlan;
    #uses plan HighlyTalkativeAndExpressivePlan;
    #uses plan TooExcitedToThinkStraightPlan;
    #uses plan SpeechlessnessPlan;
    #uses plan SetPlanContextElationPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
