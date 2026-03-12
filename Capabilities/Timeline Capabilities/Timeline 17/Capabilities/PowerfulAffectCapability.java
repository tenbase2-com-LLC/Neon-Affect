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
public capability PowerfulAffectCapability extends Capability {
    #uses plan AskQuestionsPowerfulPlan;
    #uses plan AssertiveStatementsPowerfulPlan;
    #uses plan CommandingTonePlan;
    #uses plan ConfidentDeclarationsPlan;
    #uses plan DecisionMakingPowerfulPlan;
    #uses plan DelegatingTasksPowerfulPlan;
    #uses plan EmphasisOnKeyWordsPlan;
    #uses plan ExertingInfluenceOnOthersPlan;
    #uses plan FrownPowerfulPlan;
    #uses plan GivingOrdersPowerfulPlan;
    #uses plan GoalSettingPlan;
    #uses plan HeadHeldHighPowerfulPlan;
    #uses plan IntenseGazePowerfulPlan;
    #uses plan InterruptingOthersPowerfulPlan;
    #uses plan OpinionatedPowerfulPlan;
    #uses plan OvercomingObstaclesEasilyPlan;
    #uses plan PrioritizingResponsibilitiesPowerfulPlan;
    #uses plan RiskTakingPowerfulPlan;
    #uses plan SlowBodyMovementsPowerfulPlan;
    #uses plan SpeakingSlowlyDeliberatelyPlan;
    #uses plan StiffPosturePowerfulPlan;
    #uses plan TakingChargeOfSituationPowerfulPlan;
    #uses plan UsingAuthoritativeLanguagePlan;
    #uses plan SetPlanContextPowerfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
