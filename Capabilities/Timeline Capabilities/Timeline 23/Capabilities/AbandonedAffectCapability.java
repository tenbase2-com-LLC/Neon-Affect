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
public capability AbandonedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAbandonedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> AskForHelpAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> CryingAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> DemandExplanationAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> ExpressingHopelessnessAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> OneWordAnswerAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> SeekingReassuranceAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> SharingFeelingsIsolationAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> VoicingInsecuritiesAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> WeakVoiceAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.VERBAL> WithdrawFromConversationAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> CrossingArmsAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> EmptyStareAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> LookAroundAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> LoweringHeadAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> MaintainNeutralExpressionAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> RockingSlightlyAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> SelfHuggingAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> TearingUpAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> TremblingLipsAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.NONVERBAL> WringingHandsAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> AssumingWorstScenarioAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> DesireAffectionAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> InabilityToSeeFutureAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> IsolationAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> NeedControlAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> ReachingOutTentativelyAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> ReassuranceFromOthersAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> RuminatingPastFailuresAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> SeekingComfortAbandonedPlan;
    #uses BehaviorPlan<AffectEnum.ABANDONED, AffectEnum.ACTION> WithdrawingFromOthersAbandonedPlan;

}

