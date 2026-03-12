/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
    #uses plan AskQuestionsBoldPlan;
    #uses plan AssertiveFacialExpressionPlan;
    #uses plan AssertiveStatementsPlan;
    #uses plan BoldGesturesPlan;
    #uses plan ChallengeViewpointBoldPlan;
    #uses plan CommandingAttentionPlan;
    #uses plan ConfidentVoiceBoldPlan;
    #uses plan ConfrontingChallengesDirectlyBoldPlan;
    #uses plan DebatingBoldPlan;
    #uses plan DecisionMakingBoldPlan;
    #uses plan DecisiveActionPlan;
    #uses plan DirectCommunicationPlan;
    #uses plan EmbracingUncertaintyBoldPlan;
    #uses plan HeadHeldHighBoldPlan;
    #uses plan InnovativeThinkingPlan;
    #uses plan LeadingByExamplePlan;
    #uses plan OpinionatedBoldPlan;
    #uses plan PersuasiveSpeechPlan;
    #uses plan PushingBoundariesBoldPlan;
    #uses plan RiskTakingBoldPlan;
    #uses plan SpeakToInspirePlan;
    #uses plan StrategicPlanningBoldPlan;
    #uses plan StrongEyeContactBoldPlan;
    #uses plan StrongPostureBoldPlan;
    #uses plan SetPlanContextBoldPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
