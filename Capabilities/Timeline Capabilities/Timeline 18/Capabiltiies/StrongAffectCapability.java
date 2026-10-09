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
public capability StrongAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextStrongPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> EmotionalDeclarationsPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> EuphoricExclamationsPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> ExaggeratedStorytellingPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> GradioseProclamationsPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> LaughingStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> OfferingComplementStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> PositiveSelfTalkStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> RapidSpeakingStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> RepeatingWordsStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.VERBAL> SingingHummingStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> FistPumpStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> HeadHeldHighStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> HuggingStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> HyperventilatingStroingPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> MakeFistStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> RapidEyeMovementsStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> StandingFirmStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> TearingUpStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> TremblingBodyStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.NONVERBAL> WildGesticulationPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> BarrierOvercomingPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> CompetitivenessPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> ConfrontChallengesDirectlyStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> CreativityStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> FocusedStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> LeadershipInitiativePlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> MakingDecisionsStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> PhysicalEnduranceBoostPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> RememberDetailsStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> RiskTakingStrongPlan;
    #uses BehaviorPlan<AffectEnum.STRONG, AffectEnum.ACTION> SetRealisticDeadlinesStrongPlan;

}

