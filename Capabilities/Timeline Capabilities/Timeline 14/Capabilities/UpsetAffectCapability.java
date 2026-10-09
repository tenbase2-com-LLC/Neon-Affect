/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextUpsetPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> BlameUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> ComplainUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> CryingUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> ExpressingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> SpeakingLessUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> VentingAngerPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> VerbalizingDisappointmentPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> VoiceAccusatoryTonePlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> VoiceRisingVolumeIntensityUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.VERBAL> VoiceTremorUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> AvoidingEyeContactUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> CrossingArmsUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> FrownUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> JawClinchedUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> LookAwayUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> MakeFistUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> ShakingHeadUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> SighUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> TearingUpUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.NONVERBAL> TremblingLipsUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> AllOrNothingThinkingPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> DwellingOnPastPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> IrritabilityUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> JumpingToConclusionsUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> MagnifyingProblemsPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> NegativeThoughtsUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> PacingPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> SeekingComfortUpsetPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> ThrowingPunchPlan;
    #uses BehaviorPlan<AffectEnum.UPSET, AffectEnum.ACTION> WithdrawFromOthersUpsetPlan;

}

