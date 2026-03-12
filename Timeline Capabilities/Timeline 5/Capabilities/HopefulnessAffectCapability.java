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
public capability HopefulnessAffectCapability extends Capability {
    #uses plan HoldBreathPlan;
    #uses plan LeanInHopefulnessPlan;
    #uses plan BitingLipHopefulnessPlan;
    #uses plan CoverFaceWithHandsPlan;
    #uses plan DeepBreathsHopefulnessPlan;
    #uses plan SquirmingPlan;
    #uses plan StrongEyeContactHopefulnessPlan;
    #uses plan SmilingHopefulnessPlan;
    #uses plan StiffPostureHopefulnessPlan;
    #uses plan SmoothingClothesHopefulnesslan;
    #uses plan StandingStillPlan;
    #uses plan OfferingCommittmentPlan;
    #uses plan PostiiveThinkingHopefulnessPlan;
    #uses plan AwarenessSurroundingsPlan;
    #uses plan FocusingImprovmentPlan;
    #uses plan RefusingNegativityPlan;
    #uses plan PreparingBestScenarioPlan;
    #uses plan TearingHopefulnessPlan;
    #uses plan TremblingVoicePlan;
    #uses plan SetPlanContextHopefulnessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
