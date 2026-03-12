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
public capability DespairAffectCapability extends Capability {
    #uses plan ArmsAtSideDespairPlan;
    #uses plan SighDespairPlan;
    #uses plan MouthOpenDespairPlan;
    #uses plan ShortBreathsPlan;
    #uses plan RedEyesDespairPlan;
    #uses plan NotWipingTearsPlan;
    #uses plan CryingDespairPlan;
    #uses plan ShakingHeadDespairPlan;
    #uses plan GrimaceDespairPlan;
    #uses plan LosingTrackOfTimeDespairPlan;
    #uses plan NotKeepingUpPlan;
    #uses plan SetPlanContextDespairPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
