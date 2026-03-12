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
public capability TormentedAffectCapability extends Capability {
    #uses plan EyesWideNotBlinkingPlan;
    #uses plan HighPitchedVoicePlan;
    #uses plan QuickBreathingTormentedPlan;
    #uses plan VocalizeTormentPlan;
    #uses plan NoiseSensitivityTormentedPlan;
    #uses plan YellingTormentedPlan;
    #uses plan InarticulateTormentedPlan;
    #uses plan TearingTormentedPlan;
    #uses plan PoorCopingSkillsPlan;
    #uses plan SetPlanContextTormentedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
