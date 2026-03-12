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
public capability AnxietyAffectCapability extends Capability {
    #uses plan RubBackOfNeckAnxietyPlan;
    #uses plan ArmsCrossedAnxietyPlan;
    #uses plan HeadShakingAnxietyPlan;
    #uses plan ShiftingPlan;
    #uses plan EasilyDistractedAnxietyPlan;
    #uses plan QuickGazeAnxietyPlan;
    #uses plan IncreasedAwarenessPlan;
    #uses plan ExcessiveSwallowingAnxietyPlan;
    #uses plan ImpatienceAnxietyPlan;
    #uses plan MutteringAnxietyPlan;
    #uses plan EngagingWorstCaseScenarioPlan;
    #uses plan SelfBlamePlan;
    #uses plan ReassuranceFromOthersPlan;
    #uses plan SlowedTimePlan;
    #uses plan SetPlanContextAnxietyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
