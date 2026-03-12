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
public capability AffectionateAffectCapability extends Capability {
    #uses plan AnticipatingNeedsPlan;
    #uses plan BlowingKissPlan;
    #uses plan BlushingAffectionatePlan;
    #uses plan ExpressingAppreciationPlan;
    #uses plan ExpressingLovePlan;
    #uses plan EyeContactAffectionatePlan;
    #uses plan GentleCaressAffectionatePlan;
    #uses plan GiveComplementsAffectionatePlan;
    #uses plan GivingPraisePlan;
    #uses plan HuggingPlan;
    #uses plan OfferingToHelpAffectionatePlan;
    #uses plan OfferingWordsSupportPlan;
    #uses plan PrioritizingPartnerPlan;
    #uses plan SharingSecretsAffectionatePlan;
    #uses plan ShowingConcernPlan;
    #uses plan ShowingDevotionPlan;
    #uses plan SmilingAffectionatePlan;
    #uses plan SpeakingKindlyPlan;
    #uses plan SpeakingSoftlyAffectionatePlan;
    #uses plan SpendingQualityTimePlan;
    #uses plan SurprisingWithAffectionPlan;
    #uses plan WinkAffectionatePlan;
    #uses plan WisperingPlan;
    #uses plan SetPlanContextAffectionatePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
