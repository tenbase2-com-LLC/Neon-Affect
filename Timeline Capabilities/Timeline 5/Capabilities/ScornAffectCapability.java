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
public capability ScornAffectCapability extends Capability {
    #uses plan InsultScornPlan;
    #uses plan SmirkScornPlan;
    #uses plan ExhaleThroughNosePlan;
    #uses plan ArmsCrossedScornPlan;
    #uses plan SarcasmScornPlan;
    #uses plan SquintPlan;
    #uses plan BullyingPlan;
    #uses plan RollingEyesScornPlan;
    #uses plan InterruptingScornPlan;
    #uses plan HarshLaughterPlan;
    #uses plan StaringScornPlan;
    #uses plan RidiculePlan;
    #uses plan AngerAddressedPlan;
    #uses plan IgnoringPlan;
    #uses plan SpeakingSlowlyScornPlan;
    #uses plan PleaseBehaviorPlan;
    #uses plan PutInPlacePlan;
    #uses plan ArroganceScornPlan;
    #uses plan PickFightScornPlan;
    #uses plan SetPlanContextScornPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
