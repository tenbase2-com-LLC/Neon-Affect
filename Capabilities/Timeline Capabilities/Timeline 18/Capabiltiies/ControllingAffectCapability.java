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
public capability ControllingAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextControllingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> AskQuestionsControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> CorrectingOthersControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> CriticizingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> DismissiveRemarksPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> GivingOrdersControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> InterruptingControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> OverridingOthersPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> PassiveAggressiveCommentsPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> SpeakingOverOthersPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.VERBAL> UsingGuiltyPhrasesPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> ArmsCrossedControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> CheckWatchControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> ClenchedJawControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> FrowningControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> HeadShakingControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> LoomingOverOthersPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> PurseLipsControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> StaringControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> StiffPostureControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.NONVERBAL> TappingFootControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> DemandingUpdatesPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> ImposingRulesPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> MakingDecisionsForOthersControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> ManipulatingCircumstancesPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> MonitoringOthersPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> NeedControlControllingPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> OverplanningEventsPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> OverseeingDetailsPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> RestrictingChoicesPlan;
    #uses BehaviorPlan<AffectEnum.CONTROLLING, AffectEnum.ACTION> WithholdingInformationControllingPlan;

}

