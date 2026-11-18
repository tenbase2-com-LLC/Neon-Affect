/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPowerfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> AskQuestionsPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> AssertiveStatementsPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> CommandingTonePlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> ConfidentDeclarationsPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> EmphasisOnKeyWordsPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> GivingOrdersPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> InterruptingOthersPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> OpinionatedPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> SpeakingSlowlyDeliberatelyPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.VERBAL> UsingAuthoritativeLanguagePlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> CharmingDemeanorPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> CommandingPresencePowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> FrownPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> HeadHeldHighPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> IntenseGazePowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> RelaxedAlertnessPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> SlowBodyMovementsPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> StandingFirmPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> StiffPosturePowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.NONVERBAL> UsingBoldGesturesPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> DecisionMakingPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> DecisiveActionPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> DelegatingTasksPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> ExertingInfluenceOnOthersPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> GoalSettingPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> OvercomingObstaclesEasilyPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> PrioritizingResponsibilitiesPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> RiskTakingPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> StrategicPlanningPowerfulPlan;
    #uses BehaviorPlan<AffectEnum.POWERFUL, AffectEnum.ACTION> TakingChargeOfSituationPowerfulPlan;

}

