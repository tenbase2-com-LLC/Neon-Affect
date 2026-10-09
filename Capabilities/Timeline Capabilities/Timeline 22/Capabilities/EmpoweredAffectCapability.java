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
public capability EmpoweredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEmpoweredPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> ArticulatingGoalsEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> AssertiveStatementsEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> ConfidentVoiceEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> ExpressingCommitmentEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> ExpressingReadinessEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> ImprovisedSpeechEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> PositiveSelfTalkEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> SharingIdeasEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> SpeakToInspireEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.VERBAL> SpeakingWithConvictionEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> DeepBreathsEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> EyesFocusedEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> FluidMovementEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> HeadHeldHighEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> MakeFistEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> OpenBodyLanguageEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> PushUpSleavesEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> StandingFirmEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> StrongEyeContactEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.NONVERBAL> StrongPostureEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> ConfrontChallengesDirectlyEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> DecisiveActionEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> GoalSettingEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> LeadByExampleEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> RiskTakingEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> SelfSufficentEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> ShowingResilienceEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> TakingInitiativeEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> TakingOnChallengesEmpoweredPlan;
    #uses BehaviorPlan<AffectEnum.EMPOWERED, AffectEnum.ACTION> TryNewThingsEmpoweredPlan;

}

