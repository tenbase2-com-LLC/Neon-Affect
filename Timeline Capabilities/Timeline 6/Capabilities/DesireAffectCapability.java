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
public capability DesireAffectCapability extends Capability {
    #uses plan StrongEyeContactDesirePlan;
    #uses plan StrokingArmsPlan;
    #uses plan ImitationDesirePlan;
    #uses plan LowVoiceDesirePlan;
    #uses plan LeanInDesirePlan;
    #uses plan RelaxedPostureDesirePlan;
    #uses plan InarticulateDesirePlan;
    #uses plan ImmediateResponsePlan;
    #uses plan FlirtyGlancePlan;
    #uses plan SmileBuildiingPlan;
    #uses plan CarefulMovementsPlan;
    #uses plan ImpatienceDesirePlan;
    #uses plan TakingOnTasksPlan;
    #uses plan NeglectingOthersPlan;
    #uses plan SetPlanContextDesirePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
