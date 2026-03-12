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
public capability ResentmentAffectCapability extends Capability {
    #uses plan ArmsCrossedResentmentPlan;
    #uses plan IncreasePersonalDistancePlan;
    #uses plan ComplainResentmentPlan;
    #uses plan RudenessSarcasmPlan;
    #uses plan PoutingPlan;
    #uses plan NameCallingPlan;
    #uses plan VoiceRisingVolumeIntensityPlan;
    #uses plan ArguingResentmentPlan;
    #uses plan LookingOverPlan;
    #uses plan NotGivingInKindnessPlan;
    #uses plan TwistingMouthPlan;
    #uses plan BelittlingPlan;
    #uses plan GossipingPlan;
    #uses plan UnkindSmilePlan;
    #uses plan ShakingHeadResentmentPlan;
    #uses plan UnkindThoughtsPlan;
    #uses plan FrustrationPlan;
    #uses plan MoodyPlan;
    #uses plan WantingToBeAlonePlan;
    #uses plan SeekingRevengePlan;
    #uses plan SetPlanContextResentmentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
