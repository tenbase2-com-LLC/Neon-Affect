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
public capability RegretAffectCapability extends Capability {
    #uses plan SighRegretPlan;
    #uses plan DownturnedMouthRegretPlan;
    #uses plan BadPostureRegretPlan;
    #uses plan ArmsCrossedRegretPlan;
    #uses plan ApologizingPlan;
    #uses plan AttemptToReasonPlan;
    #uses plan CoverFaceHandsRegretPlan;
    #uses plan EyesClosedPlan;
    #uses plan WinceRegretPlan;
    #uses plan SetThingsRightPlan;
    #uses plan PutOneselfDownRegretPlan;
    #uses plan ConfusionRegretPlan;
    #uses plan ShakingHeadRegretPlan;
    #uses plan MakeTskNoiseRegretPlan;
    #uses plan AskingQuestionsRegretPlan;
    #uses plan ShockAwePlan;
    #uses plan RelivingPastEventsPlan;
    #uses plan ForgetEventPlan;
    #uses plan WishingEventNeverHappenedPlan;
    #uses plan CryingRegretPlan;
    #uses plan LackOfIntimacyPlan;
    #uses plan InabilityFogiveOneselfPlan;
    #uses plan SetPlanContextRegretPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
