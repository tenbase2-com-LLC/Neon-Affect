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
public capability DenialAffectCapability extends Capability {
    #uses plan ArguingPlan;
    #uses plan NegativeDialoguePlan;
    #uses plan ShruggingPlan;
    #uses plan ArmsCrossedPlan;
    #uses plan SpeaklyQuicklyNoInterruptionsPlan;
    #uses plan RationalizingPlan;
    #uses plan SpeakingSlowlyPlan;
    #uses plan SayingNoPlan;
    #uses plan VoicePitchRisingPlan;
    #uses plan QuestioningPlan;
    #uses plan InterruptingDenialPlan;
    #uses plan ShakingHeadDenialPlan;
    #uses plan EyeContactDroppingPlan;
    #uses plan ChoppySentencesPlan;
    #uses plan MakingDemandsDenialPlan;
    #uses plan ReplayingPastEventsPlan;
    #uses plan ConcentrateDenialPlan;
    #uses plan SearchingForExcusePlan;
    #uses plan AngerTowardSituationPlan;
    #uses plan BlamingOthersPlan;
    #uses plan BackUpPositionPlan;
    #uses plan RefusingToListenPlan;
    #uses plan BeggingToBeBelievedPlan;
    #uses plan WantingToBeAlone;
    #uses plan RefusingToArguePlan;
    #uses plan SteadyEyeContactDenialPlan;
    #uses plan RefusingDenialPlan;
    #uses plan VoicingCommentsPlan;
    #uses plan SteadyTonePlan;
    #uses plan SetPlanContextDenialPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
