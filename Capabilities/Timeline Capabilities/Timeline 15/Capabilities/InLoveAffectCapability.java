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
public capability InLoveAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInLovePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> ComplementInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> ConstantlyTalkingAboutPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> ExpressingAdorationPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> PlanningFutureActivitiesInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> SayILoveYouInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> SharingSecretsInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> SpeakingWithTendernessPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> TongueTiedInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> UsingPetNamesPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.VERBAL> WhisperDramaticallyInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> BlushingInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> GentleCaressInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> LeaningInInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> MaintainPhysicalProximityPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> SillyGrinInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> SmilingInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> SmilingNoReasonInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> StaringInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> StrongEyeContactInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.NONVERBAL> TouchingAffectionatelyInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> ExperiencingEuphoriaAroundPartnerPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> FantasizingInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> FocusingOnPartnerPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> MakePlansInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> NeglectingOtherPrioritiesPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> PrioritizingPartnersPlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> RememberingDetailsInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> SacrificingInLovePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> SeekingQualityTimePlan;
    #uses BehaviorPlan<AffectEnum.IN_LOVE, AffectEnum.ACTION> SurprisingWithAffectionInLovePlan;

}

