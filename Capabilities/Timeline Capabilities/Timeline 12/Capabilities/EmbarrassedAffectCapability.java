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
public capability EmbarrassedAffectCapability extends Capability {
    #uses plan AdmittingMistakesPlan;
    #uses plan ApologizingEmbarrassedPlan;
    #uses plan ArmsCrossedEmbarrassedPlan;
    #uses plan AvoidingEyeContactEmbarrassedPlan;
    #uses plan BecomingBusyPlan;
    #uses plan BlinkingRapidlyEmbarrassedPlan;
    #uses plan BlushingEmbarrassedPlan;
    #uses plan CoveringFaceEmbarrassedPlan;
    #uses plan CrossingArmsEmbarrassedPlan;
    #uses plan DistractedEmbarrassedPlan;
    #uses plan DownplaySituationPlan;
    #uses plan ExitBirefllyPlan;
    #uses plan FidgetingEmbarrassedPlan;
    #uses plan LaughterEmbarrassedPlan;
    #uses plan LickingLipsEmbarrassedlPlan;
    #uses plan MakingExcusesEmbarrassedPlan;
    #uses plan OfferRefreshmentPlan;
    #uses plan PlayingWithHairPlan;
    #uses plan QuietVoiceEmbarrassedPlan;
    #uses plan RedirectingConversationPlan;
    #uses plan SelfDeprecatingHumorPlan;
    #uses plan SpeakingQuicklyEmbarrassedPlan;
    #uses plan StutteringEmbarrassedPlan;
    #uses plan SweatingPlan;
    #uses plan SetPlanContextEmbarrassedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
