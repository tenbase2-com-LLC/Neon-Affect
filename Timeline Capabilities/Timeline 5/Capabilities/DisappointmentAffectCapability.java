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
public capability DisappointmentAffectCapability extends Capability {
    #uses plan LoweringHeadPlan;
    #uses plan LipsPursedDisappointmentPlan;
    #uses plan BadPostureDiappointmentPlan;
    #uses plan ShakingHeadDisappointmentPlan;
    #uses plan SighDisappointmentPlan;
    #uses plan BreakingEyeContactPlan;
    #uses plan SwallowingHardDisappointmentPlan;
    #uses plan FaceGoingSlackPlan;
    #uses plan TearingDisappointmentPlan;
    #uses plan WinceDisappointmentPlan;
    #uses plan MouthOpenSlighlyPlan;
    #uses plan LookAroundConfusionPlan;
    #uses plan RubbingPackOfNeckDisappointmentPlan;
    #uses plan GoingQuietPlan;
    #uses plan CursingPlan;
    #uses plan BitingLipDisappointmentPlan;
    #uses plan WantingToBeAloneDisappointmentPlan;
    #uses plan WorthlessnessPlan;
    #uses plan FlushedFaceDisappointmentPlan;
    #uses plan PutOneselfDownPlan;
    #uses plan InabilityMoveOnPlan;
    #uses plan SetPlanContextDisappointmentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
