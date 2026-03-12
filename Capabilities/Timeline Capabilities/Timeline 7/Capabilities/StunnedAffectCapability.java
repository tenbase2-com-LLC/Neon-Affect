/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public capability StunnedAffectCapability extends Capability {
    #uses plan StillnessStunnedPlan;
    #uses plan MouthOpenStunnedPlan;
    #uses plan FlatGazePlan;
    #uses plan BlinkingSlowlyPlan;
    #uses plan SittingLimplyPlan;
    #uses plan NotRespondingStunnedPlan;
    #uses plan DelayedReactionPlan;
    #uses plan RubbingEyesPlan;
    #uses plan StammeringStunnedPlan;
    #uses plan VoicingConfusionPlan;
    #uses plan ForgettingStunnedPlan;
    #uses plan InarticulateStunnedPlan;
    #uses plan DifficultyFocusingStunnedPlan;
    #uses plan EmotionalNumbnessPlan;
    #uses plan DisbeliefPlan;
    #uses plan ApathyFuturePlan;
    #uses plan SetPlanContextStunnedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
