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
public capability InLoveAffectCapability extends Capability {
    #uses plan BlushingInLovePlan;
    #uses plan ComplementInLovePlan;
    #uses plan ConstantlyTalkingAboutPlan;
    #uses plan ExperiencingEuphoriaAroundPartnerPlan;
    #uses plan ExpressingAdorationPlan;
    #uses plan FocusingOnPartnerPlan;
    #uses plan GentleCaressInLovePlan;
    #uses plan MaintainPhysicalProximityPlan;
    #uses plan NeglectingOtherPrioritiesPlan;
    #uses plan PlanningFutureActivitiesInLovePlan;
    #uses plan PrioritizingPartnersPlan;
    #uses plan RememberingDetailsInLovePlan;
    #uses plan SacrificingInLovePlan;
    #uses plan SeekingQualityTimePlan;
    #uses plan SharingSecretsInLovePlan;
    #uses plan SmilingInLovePlan;
    #uses plan SpeakingWithTendernessPlan;
    #uses plan StaringInLovePlan;
    #uses plan UsingPetNamesPlan;
    #uses plan WhisperDramaticallyInLovePlan;
    #uses plan SetPlanContextInLovePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
