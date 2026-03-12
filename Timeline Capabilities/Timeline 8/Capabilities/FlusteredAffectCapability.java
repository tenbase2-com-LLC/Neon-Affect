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
public capability FlusteredAffectCapability extends Capability {
    #uses plan LoseEyeContactPlan;
    #uses plan BlinkingRapidlyPlan;
    #uses plan SharpIntakePlan;
    #uses plan FlushedFaceFlusteredPlan;
    #uses plan InarticulateFlusteredPlan;
    #uses plan NervousSmileFlusteredPlan;
    #uses plan QuickMoevementsFlusteredPlan;
    #uses plan HeadShakingFlusteredPlan;
    #uses plan FidgetingFlusteredPlan;
    #uses plan SecondGuessingPlan;
    #uses plan LaughingFlusteredPlan;
    #uses plan ClearThroatFlusteredPlan;
    #uses plan ApologizingFlusteredPlan;
    #uses plan UpsetTonePlan;
    #uses plan DeflectingPlan;
    #uses plan SelfReassurancePlan;
    #uses plan DivertingAttentionPlan;
    #uses plan HeightedAwarenessPlan;
    #uses plan TimeSlowedPlan;
    #uses plan AllowSomeoneElsePlan;
    #uses plan SetPlanContextFlusteredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
