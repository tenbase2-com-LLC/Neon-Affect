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
public capability AffectionateAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAffectionatePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> ExpressingAppreciationPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> ExpressingLovePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> GiveComplementsAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> GivingPraisePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> OfferingToHelpAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> OfferingWordsSupportPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> SharingSecretsAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> SpeakingKindlyPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> SpeakingSoftlyAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.VERBAL> WisperingPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> BlowingKissPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> BlushingAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> EyeContactAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> GentleCaressAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> HuggingPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> LeanInAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> MaintainPhysicalProximityAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> NoddingWhileListeningAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> SmilingAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.NONVERBAL> WinkAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> AnticipatingNeedsPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> BuyingGiftsOfferingKindnessAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> HelpfulnessAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> OfferingHugAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> PrioritizingPartnerPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> RememberingDetailsAffectionatePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> ShowingConcernPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> ShowingDevotionPlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> SpendingQualityTimePlan;
    #uses BehaviorPlan<AffectEnum.AFFECTIONATE, AffectEnum.ACTION> SurprisingWithAffectionPlan;

}

