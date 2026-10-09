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
public capability GuiltAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextGuiltPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> ApologizingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> AvoidingQuestionsGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> ChangingSubjectGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> DefensivePlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> ExcessiveTalkingPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> LyingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> MakingExcusesGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> MentallyBeratingOneselfGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> QuietVoiceGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.VERBAL> TellingTruthGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> AvoidingEyeContactGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> ClearThroatGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> FidgetingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> FlusteredPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> LookingPalePlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> LoweringHeadGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> MaintainNeutralExpressionGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> NervousSmileGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> StillGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.NONVERBAL> SweatingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> AvoidingPersonPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> DesireToFaceConsequencesGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> DistractedGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> OverlyCriticalSelfGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> ParanoidPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> PeaceOfferingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> RationalizingGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> SelfBlameGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> SetThingsRightGuiltPlan;
    #uses BehaviorPlan<AffectEnum.GUILT, AffectEnum.ACTION> WithdrawingFromOthersGuiltPlan;

}

