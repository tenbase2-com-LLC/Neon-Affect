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
public capability MightyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMightyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> ArticulatingVisionClearlyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> AssertiveStatementsMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> ChallengingOthersVocallyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> ConfidentVoiceMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> EmpoweringEncouragementMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> GivingInspirationalSpeechesPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> IssuingCommandsPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> MakingBoldDeclarationsPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> SpeakingAuthoritativeTonePlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.VERBAL> UsingPowerfulLanguagePlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> CommandingPresenceMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> DemonstratingSteadfastComposurePlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> ExibitingControlledStrengthPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> EyesFocusedMightyPLan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> HeadHeldHighMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> RelaxedAlertnessMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> StandingFirmMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> StrongPostureMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> UsingBoldGesturesPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.NONVERBAL> WelcomingStanceMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> ConfrontingChallengesDirectlyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> DisplayingExceptionalSkillPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> ExhibitingStaminaMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> MakingQuickDecisionsPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> OvercomingObstaclesEasilyMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> ProtectingOthersMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> PushingBoundariesPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> ShowingResilienceMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> StrategicPlanningMightyPlan;
    #uses BehaviorPlan<AffectEnum.MIGHTY, AffectEnum.ACTION> TakingChargeOfSituationPlan;

}

