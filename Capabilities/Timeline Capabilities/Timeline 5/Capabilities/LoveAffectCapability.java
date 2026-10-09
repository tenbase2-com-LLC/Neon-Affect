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
public capability LoveAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLovePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> ComplementLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> LaughingNonStopTalkingPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> MakingCommitmentsLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> SayILoveYouPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> SharingSecretsPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> ShowImportancePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> SpeakingWithTendernessLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> TongueTiedPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> UsingPetNamesPan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.VERBAL> WhisperDramaticallyLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> BlushingLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> DeepBreathsLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> DizzinessLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> GentleCaressLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> HalfClosedEyesLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> LeanInLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> MaintainPhysicalProximityLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> SillyGrinPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> SmilingNoReasonPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.NONVERBAL> StrongEyeContactLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> AlignInterestsOtherPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> AppreciatingWorldPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> InterestGoingsOnPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> LosingTrackOfTimeLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> MakePlansLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> OthersAsFriendPlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> PerceptivePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> PossessivenessLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> SacrificingLovePlan;
    #uses BehaviorPlan<AffectEnum.LOVE, AffectEnum.ACTION> SurprisingWithAffectionLovePlan;

}

