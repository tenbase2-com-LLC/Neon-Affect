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
public capability DesperationAffectCapability extends Capability {
    #uses plan StrongGazeDesperationPlan;
    #uses plan QuickMovementsDesperationPlan;
    #uses plan MoaningDesperationPlan;
    #uses plan ShakyVoicePlan;
    #uses plan BargainingPlan;
    #uses plan ShakingHeadDesperationPlan;
    #uses plan SwearingDesperationPlan;
    #uses plan ThinkingIrrationallyDesperationPlan;
    #uses plan WillingToDoAnythingPlan;
    #uses plan RebelliousPlan;
    #uses plan CryingDesperationPlan;
    #uses plan RiskTakingDesperationPlan;
    #uses plan SteadfastnessDesperationPlan;
    #uses plan SetPlanContextDesperationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
