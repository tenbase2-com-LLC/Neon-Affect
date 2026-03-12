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
public capability SadAffectCapability extends Capability {
    #uses plan WincingPlan;
    #uses plan SighingSadPlan;
    #uses plan SpeakingLessPlan;
    #uses plan EmptyStarePlan;
    #uses plan MonotoneVoicePlan;
    #uses plan DifficultyParticipatingPlan;
    #uses plan CrossingArmsPlan;
    #uses plan NotSittingUprightPlan;
    #uses plan DifficultyRespondingSadPlan;
    #uses plan InabilityToSeeFuturePlan;
    #uses plan DesireToEscapePlan;
    #uses plan NeedToBeAlonePlan;
    #uses plan CryingPlan;
    #uses plan LossOfAppetitePlan;
    #uses plan StrugglingWithMotivationPlan;
    #uses plan SetPlanContextSadPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
