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
public capability AcceptanceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAcceptancePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> AskingForAdvicePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> ClarfiyDelayResponsePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> ExpressingAgreementAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> ForgivenessPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> LightLaughterPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> MeasuredResponsesAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> ShareMomentPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> SlowIndicisiveResponsePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> TeasingPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.VERBAL> TellingJokesAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> AdoptGesturePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> EyesFocusedPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> HeavySighPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> ListeningIntentlyPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> NoddingPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> PurseLipsAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> RelaxedPostureAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> SlowSmileAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> StrongEyeContactAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.NONVERBAL> TakeBreathPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> BeingFlexibleAcceptancePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> BeingHonestPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> BeingOptimisticPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> ConfidencePlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> ForgingStrongRelationshipsPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> LettingThingsGoPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> MakePlansPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> PeaceOfferingPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> PurposefulPlan;
    #uses BehaviorPlan<AffectEnum.ACCEPTANCE, AffectEnum.ACTION> SetMockConditionsPlan;

}

