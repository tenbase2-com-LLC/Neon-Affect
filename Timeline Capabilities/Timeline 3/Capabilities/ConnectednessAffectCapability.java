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
public capability ConnectednessAffectCapability extends Capability {
    #uses plan AskingQuestionsConnectednessPlan;
    #uses plan DeepBreathsConnectednessPlan;
    #uses plan CloseEyesDeepBreathPlan;
    #uses plan LightlyJokingPlan;
    #uses plan SayingPersonalThingsPlan;
    #uses plan BeingHonestConnectednessPlan;
    #uses plan PlayfulnessPlan;
    #uses plan LaughingMorePlan;
    #uses plan WelcomingQuestionsPlan;
    #uses plan WillingnessToHelpPlan;
    #uses plan PerformActsOfKindnessPlan;
    #uses plan LackOfJudgementPlan;
    #uses plan DeepAdmirationPlan;
    #uses plan IncreasedConfidenceConnectednessPlan;
    #uses plan EmbracingChallengesPlan;
    #uses plan DeepThinkingPlan;
    #uses plan SpendingMoreTimeWithOthersPlan;
    #uses plan SetPlanContextConnectednessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
