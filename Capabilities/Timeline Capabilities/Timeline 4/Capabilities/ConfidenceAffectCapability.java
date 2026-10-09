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
public capability ConfidenceAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextConfidencePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> AssertiveStatementsConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> ConfidentVoiceConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> FlirtingPlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> ImprovisedSpeechConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> InitiatingConversationPlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> OfferingComplementConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> PositiveSelfTalkConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> SharingIdeasConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> TellingJokesConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.VERBAL> ThoughtfulResponsesConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> CalmExteriorConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> FluidMovementConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> GoodPostureConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> HeadHeldHighConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> LookingIntoEyesPlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> OpenBodyLanguageConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> RelaxedPostureConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> SlowEvenBreathsConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> SmilingConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.NONVERBAL> WinkConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> BeingFlexibleConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> DecisionMakingConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> EasyGoingMannerPlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> PositiveOutlookPlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> RiskTakingConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> SelfSufficentConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> ShowingOffConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> TakingInitiativeConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> TakingOnChallengesConfidencePlan;
    #uses BehaviorPlan<AffectEnum.CONFIDENCE, AffectEnum.ACTION> TryNewThingsPlan;

}

