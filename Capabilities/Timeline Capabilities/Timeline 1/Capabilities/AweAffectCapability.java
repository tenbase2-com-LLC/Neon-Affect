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
public capability AweAffectCapability extends Capability {
    #uses plan CeasingAllMovementPlan;
    #uses plan ShouldersDroppingPlan;
    #uses plan DeepBreathAwePlan;
    #uses plan StaringPlan;
    #uses plan SlowingReleasingDeepBreathPlan;
    #uses plan SpeechlessLessArticulatePlan;
    #uses plan ForgettingToBlinkPlan;
    #uses plan RemainingStillPlan;
    #uses plan DesireToGetCloserPlan;
    #uses plan MovingCarefullyPlan;
    #uses plan SpeakingSoftly;
    #uses plan ConcernsWorriesFallingAwayPlan;
    #uses plan ForgetMiddleOfDoingPlan;
    #uses plan HeightenedSensesPlan;
    #uses plan NoticingLittleThingsPlan;
    #uses plan SenseOfConnectionPlan;
    #uses plan AwakendCuriosityPlan;
    #uses plan WantingNewExperiencesPlan;
    #uses plan IncreasedGenerosityCompassionPlan;
    #uses plan MoreWillingToHelpOthersPlan;
    #uses plan SetPlanContextAwePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
