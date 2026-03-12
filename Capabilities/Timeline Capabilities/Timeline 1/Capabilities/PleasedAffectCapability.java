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
public capability PleasedAffectCapability extends Capability {
    #uses plan RelaxedSmilePlan;
    #uses plan HeadTiltingToSidePlan;
    #uses plan FlushedFacedPleasedPlan;
    #uses plan ChinLiftingPlan;
    #uses plan OpenBodyPosturePlan;
    #uses plan SighingPlan;
    #uses plan PlacingHandOverHeartPlan;
    #uses plan SoftGentleVoicePlan;
    #uses plan ThumbsUpPlan;
    #uses plan CoveringSmileWithHandPlan;
    #uses plan HeadNoddingPlan;
    #uses plan ShakingHeadWhileSmilingPlan;
    #uses plan LaughingToOneselfPlan;
    #uses plan HandClappingPlan;
    #uses plan MakingStrongEyeContactPlan;
    #uses plan SenseOfContentmentPlan;
    #uses plan WantingFeelingToLastPlan;
    #uses plan BeingMoreTolerantPatientPlan;
    #uses plan IncreasedSenseOfPrideSelfConfidencePlan;
    #uses plan ImprovedProductivityPlan;
    #uses plan ImprovedRelationshipsPlan;
    #uses plan IgnoringProblemsPlan;
    #uses plan SetPlanContextPleasedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
