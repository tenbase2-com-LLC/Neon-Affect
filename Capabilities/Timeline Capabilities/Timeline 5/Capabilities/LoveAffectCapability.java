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
public capability LoveAffectCapability extends Capability {
    #uses plan SmilingNoReasonPlan;
    #uses plan StrongEyeContactLovePlan;
    #uses plan DeepBreathsLovePlan;
    #uses plan SillyGrinPlan;
    #uses plan LaughingNonStopTalkingPlan;
    #uses plan UsingPetNamesPan;
    #uses plan TongueTiedPlan;
    #uses plan SayILoveYouPlan;
    #uses plan SharingSecretsPlan;
    #uses plan AlignInterestsOtherPlan;
    #uses plan AppreciatingWorldPlan;
    #uses plan LosingTrackOfTimeLovePlan;
    #uses plan DizzinessLovePlan;
    #uses plan PossessivenessLovePlan;
    #uses plan PerceptivePlan;
    #uses plan OthersAsFriendPlan;
    #uses plan ShowImportancePlan;
    #uses plan InterestGoingsOnPlan;
    #uses plan SetPlanContextLovePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
