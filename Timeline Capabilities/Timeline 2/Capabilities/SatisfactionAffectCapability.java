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
public capability SatisfactionAffectCapability extends Capability {
    #uses plan CrispNodPlan;
    #uses plan ThumbsUpSatisfactionPlan;
    #uses plan CockySmilePlan;
    #uses plan StraightPosturePlan;
    #uses plan ClappingPlan;
    #uses plan LoudCheeringPlan;
    #uses plan BraggingPlan;
    #uses plan DeepSighPlan;
    #uses plan WhistlingHummingPlan;
    #uses plan DeepBreathPlan;
    #uses plan UnhurriedMovementPlan;
    #uses plan DirectMannerPlan;
    #uses plan OfferingCongratulationsPlan;
    #uses plan IncreasedConfidencePlan;
    #uses plan HyperAwarenessOfOthersPlan;
    #uses plan ContentmentPlan;
    #uses plan GratificationPlan;
    #uses plan SetPlanContextSatisfactionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
