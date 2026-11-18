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
public capability ResentmentAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextResentmentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> ArguingResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> BelittlingPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> ComplainResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> GossipingPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> HoldingGrudgeBringingUpPastResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> MutteringResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> NameCallingPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> PoutingPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> RudenessSarcasmPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.VERBAL> VoiceRisingVolumeIntensityPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> ArmsCrossedResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> ClenchedJawResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> IncreasePersonalDistancePlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> LookingOverPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> RollingEyesResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> ShakingHeadResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> SneeringResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> SourLookResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> TwistingMouthPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.NONVERBAL> UnkindSmilePlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> FrustrationPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> GetEvenResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> MoodyPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> NotGivingInKindnessPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> PickFightResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> RuminationOverGrievancesResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> SeekingRevengePlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> UnforgivingResentmentPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> UnkindThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.RESENTMENT, AffectEnum.ACTION> WantingToBeAlonePlan;

}

