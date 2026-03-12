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
public capability OverwhelmedAffectCapability extends Capability {
    #uses plan BringHandToForeheadPlan;
    #uses plan HoldingPalmUpPlan;
    #uses plan WaveAwayPlan;
    #uses plan DropShouldersPlan;
    #uses plan VoiceChokedWithTears;
    #uses plan MumblingPlan;
    #uses plan WhimperPlan;
    #uses plan ShakingPlan;
    #uses plan TearyEyesPlan;
    #uses plan DifficultyRespondingOverwhelmedPlan;
    #uses plan ShakingHeadOverwhelmedPlan;
    #uses plan HandsOverEarsPlan;
    #uses plan CloseEyesPlan;
    #uses plan InappropriateResponsesOverwhelmedPlan;
    #uses plan HyperventilatingPlan;
    #uses plan NoiseSensitivityPlan;
    #uses plan InabilityToFocusPlan;
    #uses plan WishingForComfortPlan;
    #uses plan IsolationOverwhelmedPlan;
    #uses plan IndecisivenessPlan;
    #uses plan SnappingUnderPressurePlan;
    #uses plan FaintingPlan;
    #uses plan HeadachePlan;
    #uses plan ChronicFatiguePlan;
    #uses plan SetPlanContextOverwhelmedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
