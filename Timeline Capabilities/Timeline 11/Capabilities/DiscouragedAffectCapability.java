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
public capability DiscouragedAffectCapability extends Capability {
    #uses plan AvoidingChallengesPlan;
    #uses plan BadPostureDiuscouragedPLan;
    #uses plan ComplainFatiguedPlan;
    #uses plan ConfidingInadequecyPlan;
    #uses plan FidgetingDiscouragedPlan;
    #uses plan GiveUpGoalPlan;
    #uses plan IgnoringResponsbilitiesPlan;
    #uses plan LookDownDiscouragedPlan;
    #uses plan MakingMistakesPlan;
    #uses plan ProcrastinatePlan;
    #uses plan SeekingComfortPlan;
    #uses plan SelfDoubtDiscouragedPlan;
    #uses plan SighDiscouragedPlan;
    #uses plan SwearingDiscouragedPlan;
    #uses plan TearingUpDiscouragedPlan;
    #uses plan SetPlanContextDiscouragedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
