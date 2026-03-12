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
public capability UpsetAffectCapability extends Capability {
    #uses plan AllOrNothingThinkingPlan;
    #uses plan AvoidingEyeContactUpsetPlan;
    #uses plan ComplainUpsetPlan;
    #uses plan DwellingOnPastPlan;
    #uses plan ExpressingFrustrationPlan;
    #uses plan FrownUpsetPlan;
    #uses plan JawClinchedUpsetPlan;
    #uses plan JumpingToConclusionsUpsetPlan;
    #uses plan LookAwayUpsetPlan;
    #uses plan MagnifyingProblemsPlan;
    #uses plan MakeFistUpsetPlan;
    #uses plan PacingPlan;
    #uses plan SighUpsetPlan;
    #uses plan TearingUpUpsetPlan;
    #uses plan ThrowingPunchPlan;
    #uses plan TremblingLipsUpsetPlan;
    #uses plan VentingAngerPlan;
    #uses plan VerbalizingDisappointmentPlan;
    #uses plan VoiceAccusatoryTonePlan;
    #uses plan VoiceRisingVolumeIntensityUpsetPlan;
    #uses plan VoiceTremorUpsetPlan;
    #uses plan WithdrawFromOthersUpsetPlan;
    #uses plan SetPlanContextUpsetPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
