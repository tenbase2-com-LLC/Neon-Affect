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
public capability DiscontentedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDiscontentedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> AskQuestionsDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> ComplainDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> CriticizeDiscontentPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> MutteringDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> NegativeComparisonsPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> PassiveAggressiveCommentsDiscontentPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> PessimisticStatementsPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> SarcasmDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> SelfNegativeTalkDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.VERBAL> SighDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> ArmsCrossingDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> ExhaleThroughNoseDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> FrownDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> HeadShakingDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> LipsPursedDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> LookAwayDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> RollingEyesDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> SourLookDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> StiffPostureDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.NONVERBAL> TappingFootDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> ContemplatingImprovementsDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> DwellingOnNegativeDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> FaultFindingPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> NegativeThoughtsDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> ResistanceToCompromisePlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> RuminationOverGrievancesPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> SeekingAlternativeOptionsDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> SeekingApprovalDiscontentedPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> SelfPityPlan;
    #uses BehaviorPlan<AffectEnum.DISCONTENTED, AffectEnum.ACTION> WithdrawingFromSituationPlan;

}

