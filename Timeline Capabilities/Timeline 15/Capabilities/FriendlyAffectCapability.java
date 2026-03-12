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
public capability FriendlyAffectCapability extends Capability {
    #uses plan BeingOpenMindedPlan;
    #uses plan ExpressingInterestPlan;
    #uses plan InitiatingConversationFriendlyPlan;
    #uses plan LaughingFriendlyPlan;
    #uses plan NoddingFriendlyPlan;
    #uses plan OfferingComplementFriendlyPlan;
    #uses plan OfferingToHelpFriendlyPlan;
    #uses plan OpenBodyPostureFriendlyPlan;
    #uses plan RememberingDetailsPlan;
    #uses plan SeekingCommonGroundPlan;
    #uses plan SharingExperienceFriendlyPlan;
    #uses plan ShowingEmpathyFriendlyPlan;
    #uses plan ShowingInterestPlan;
    #uses plan SmilingFriendlyPlan;
    #uses plan UsingGentleHandGesturesPlan;
    #uses plan UsingSupportiveLanguagePlan;
    #uses plan UsingWarmGreetingsPlan;
    #uses plan SetPlanContextFriendlyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
