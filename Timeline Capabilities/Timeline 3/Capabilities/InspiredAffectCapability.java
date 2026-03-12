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
public capability InspiredAffectCapability extends Capability {
    #uses plan RemainStillAtAhaMomentPlan;
    #uses plan MouthOpenPlan;
    #uses plan WideOpenEyesPlan;
    #uses plan RapidBreathingInspiredPlan;
    #uses plan HandWavingPlan;
    #uses plan SmilingFrequentlyPlan;
    #uses plan LeaningInInspiredPlan;
    #uses plan SeriousExpressionInspiredPlan;
    #uses plan NotRespondingPlan;
    #uses plan FrustratedAtInterruptionsPlan;
    #uses plan SpeakingQuicklyLouderPlan;
    #uses plan MentalClarityPlan;
    #uses plan LosingTrackOfTimePlan;
    #uses plan ForgettingInspiredPlan;
    #uses plan EasilyDistractedPlan;
    #uses plan HidingSmilePlan;
    #uses plan SetPlanContextInspiredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
