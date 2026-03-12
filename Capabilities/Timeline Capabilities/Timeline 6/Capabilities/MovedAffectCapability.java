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
public capability MovedAffectCapability extends Capability {
    #uses plan EyesGlisteningPlan;
    #uses plan SmilingMovedPlan;
    #uses plan CoverFaceHandsMovedPlan;
    #uses plan TremblingVoiceMovedPlan;
    #uses plan MoaningMovedPlan;
    #uses plan GratitudeMovedPlan;
    #uses plan WipingTearsPlan;
    #uses plan MeaningfulEyeContactPlan;
    #uses plan ShakingHeadMovedPlan;
    #uses plan SniffingPlan;
    #uses plan InarticulateMovedPlan;
    #uses plan LipsPursedMovedPlan;
    #uses plan BlushedFaceMovedPlan;
    #uses plan SenseOfReliefPlan;
    #uses plan HyperFocusedPlan;
    #uses plan InsensitivePlan;
    #uses plan HiccupsPlan;
    #uses plan SetPlanContextMovedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
