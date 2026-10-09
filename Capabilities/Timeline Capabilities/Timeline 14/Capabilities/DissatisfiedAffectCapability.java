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
public capability DissatisfiedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDissatisfiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> ComplainDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> ExpressingDisappointmentDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> MutteringDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> NegativeComparisonsDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> NegativeLanguageDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> PassiveAggressiveCommentsDiscontentDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> PointingOutShortComingsPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> ShortResponsesDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> VerbalizingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.VERBAL> VoicingCriticismPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> ArmsCrossedDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> ClosedBodyPosturePlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> DownturnedMouthDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> ExhaleThroughNoseDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> FrownDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> LipsPursedDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> LookAwayDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> RollingEyesDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> ShakingHeadDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.NONVERBAL> SighDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> AnalyzingShortComingsPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> ContemplatingImprovementsPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> DisengageFromInteractionPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> DwellingOnNegativePlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> FaultFindingDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> ReplayingPastLetDownsPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> ResistanceToCompromiseDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> RuminationOverGrievancesDissatisfiedPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> SeekingAlternativeOptionsPlan;
    #uses BehaviorPlan<AffectEnum.DISSATISFIED, AffectEnum.ACTION> StrayingAttentionDissatisfiedPlan;

}

