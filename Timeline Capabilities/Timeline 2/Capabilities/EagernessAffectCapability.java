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
public capability EagernessAffectCapability extends Capability {
    #uses plan LeanInEagernessPlan;
    #uses plan RushedWordsPlan;
    #uses plan LoudVoicePlan;
    #uses plan NodHeadFastPlan;
    #uses plan StrongEyeContactPlan;
    #uses plan InterruptSpeakOverPlan;
    #uses plan OfferingSuggestionsPlan;
    #uses plan AskingQuestionsEagernessPlan;
    #uses plan LongBreathesPlan;
    #uses plan HandsClenchedPlan;
    #uses plan HeadUpAlertPlan;
    #uses plan WinkPlan;
    #uses plan FocusedListeningPlan;
    #uses plan NotEasilyDistractedPlan;
    #uses plan LosingAllInhibitionsPlan;
    #uses plan PositiveThinkingEagernessPlan;
    #uses plan QuickDecisionsPlan;
    #uses plan SetPlanContextEagernessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
