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
public capability AmazementAffectCapability extends Capability {
    #uses plan EyesWideningPlan;
    #uses plan BecomingSuddenlyStillPlan;
    #uses plan SuckInQuickBreathPlan;
    #uses plan HandCoveringMouthPlan;
    #uses plan SmallYelpPlan;
    #uses plan GulpStutterAmazementPlan;
    #uses plan RapidBlinkingThenStarePlan;
    #uses plan TakeStepBackPlan;
    #uses plan SlowHeadShakePlan;
    #uses plan LeanInPlan;
    #uses plan SpontaneousLaughterPlan;
    #uses plan SpeechlessnessAmazementPlan;
    #uses plan RepeatingPlan;
    #uses plan ForgettingAmazementPlan;
    #uses plan ShareExperiencePlan;
    #uses plan GiddinessPlan;
    #uses plan DisorientatedAmazementPlan;
    #uses plan InabilityFindWordsPlan;
    #uses plan LookDownPlan;
    #uses plan StonyExpressionPlan;
    #uses plan TakingSeatPlan;
    #uses plan ForcingCoughPlan;
    #uses plan SetPlanContextAmazementPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
