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
public capability DoubtAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDoubtPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> ArguingDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> AskingClarificationPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> ConversationFillersPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> DecliningSupportPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> DefensiveDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> ExpressingUncertaintyDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> FearmongeringDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> UseOfUncertainPhrasesDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> UsingQualifiersDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.VERBAL> WeighingProsConsDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> ArmsCrossedDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> CockHeadDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> ExcessiveSwallowingPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> FurrowedBrowDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> HesitatingNodPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> HoldingLongBreathPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> PurseLipsDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> ShruggingDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> TightSmilePlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.NONVERBAL> WorryingPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> DelayingTacticsPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> IndecisivenessDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> LookingAheadPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> OveranalyzingDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> RethinkingPastDecisionPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> SecondGuessingDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> SeekingAlternativePerspectivesDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> SeekingMoreInformationDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> SeekingReassuranceDoubtPlan;
    #uses BehaviorPlan<AffectEnum.DOUBT, AffectEnum.ACTION> TestingAssumptionsDoubtPlan;

}

