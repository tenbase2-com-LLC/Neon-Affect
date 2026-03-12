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
public capability HumiliationAffectCapability extends Capability {
    #uses plan BodyCollapsingInwardHumilationPlan;
    #uses plan BowHeadPlan;
    #uses plan ShiveringPlan;
    #uses plan DownwardGazePlan;
    #uses plan FlushedFaceHumiliationPlan;
    #uses plan DullEyesPlan;
    #uses plan CoverFaceHandsPlan;
    #uses plan BottomLipTremblingPlan;
    #uses plan WhimperingPlan;
    #uses plan ArmsAtSideHumiliationPlan;
    #uses plan UncontrollableTearsPlan;
    #uses plan NoiseSensitivityHumiliationPlan;
    #uses plan SelfLoathingHumilationPlan;
    #uses plan RapidSwallowingPlan;
    #uses plan DizzinessPlan;
    #uses plan RacingThoughtsPlan;
    #uses plan DisillusionedHumiliationPlan;
    #uses plan SetPlanContextHumiliationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
