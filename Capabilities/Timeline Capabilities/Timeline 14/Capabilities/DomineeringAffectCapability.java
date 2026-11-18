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
public capability DomineeringAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDomineeringPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> BraggingDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> CorrectingOthersPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> CriticizeDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> DismissingOpinionsPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> GivingOrdersPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> InterruptSpeakOverDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> MakingDemandsDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> MonopolizingConversationPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> RaisingVoiceDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.VERBAL> SpeakAggressiveTonePlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> CrossingArmsDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> HandsOnHipsDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> IntenseGazeDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> InvadingPersonalSpaceDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> LoomingOverOthersDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> PointingFingerAccusatoryDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> RollingEyesDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> SighDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> StaringDownDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.NONVERBAL> TappingFootDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> DelegatingTasksPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> DisregardingFeelingsPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> EnforcingRulesPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> EscalatingConflictsDomineeringPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> IgnoringConsensusPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> MakingDecisionsForOthersPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> PushingOwnAgendaPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> RefusingToCompromisePlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> TakingControlPlan;
    #uses BehaviorPlan<AffectEnum.DOMINEERING, AffectEnum.ACTION> WithholdingInformationPlan;

}

