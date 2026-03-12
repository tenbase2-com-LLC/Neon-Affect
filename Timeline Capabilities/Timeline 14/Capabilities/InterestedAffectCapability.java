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
public capability InterestedAffectCapability extends Capability {
    #uses plan AnalyzingCausesPlan;
    #uses plan AskClarifyingQuestionsPlan;
    #uses plan BlinkingSlowlyInterestedPlan;
    #uses plan ContemplatingImplicationsPlan;
    #uses plan EngageCriticalThinkingPlan;
    #uses plan EvaluatingLongTermPlan;
    #uses plan ExpressingCuriosiityPlan;
    #uses plan EyeContactInterestedPlan;
    #uses plan FocusedGazedInterestedPlan;
    #uses plan IdentifyingGapsReasoningPlan;
    #uses plan ListeningIntentlyInterestedPlan;
    #uses plan MimickingGesturesPlan;
    #uses plan OfferingThoughtfulCommecntsPlan;
    #uses plan OpenBodyPostureInterestedPlan;
    #uses plan RequestingSpecificExamplesPlan;
    #uses plan SeekingMoreInformationPlan;
    #uses plan SmilingInterestedPlan;
    #uses plan SummarizingKeyPointsPlan;
    #uses plan SetPlanContextInterestedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
