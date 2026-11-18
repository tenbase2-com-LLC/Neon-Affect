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
public capability BoldAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBoldPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> AskQuestionsBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> AssertiveStatementsPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> ConfidentVoiceBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> DebatingBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> DirectCommunicationPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> ImprovisedSpeechBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> OpinionatedBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> PersuasiveSpeechPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> SpeakToInspirePlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.VERBAL> ToThePointSpeechBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> AssertiveFacialExpressionPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> BoldGesturesPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> CalmExteriorBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> CommandingAttentionPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> HeadHeldHighBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> LeanInBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> OpenBodyLanguageBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> StandingFirmBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> StrongEyeContactBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.NONVERBAL> StrongPostureBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> ChallengeViewpointBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> ConfrontingChallengesDirectlyBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> DecisionMakingBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> DecisiveActionPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> EmbracingUncertaintyBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> InnovativeThinkingPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> LeadingByExamplePlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> PushingBoundariesBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> RiskTakingBoldPlan;
    #uses BehaviorPlan<AffectEnum.BOLD, AffectEnum.ACTION> StrategicPlanningBoldPlan;

}

