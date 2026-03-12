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
public capability WonderAffectCapability extends Capability {
    #uses plan BlinkingRapidlyWonderPlan;
    #uses plan ContemplatingOnesPlacePlan;
    #uses plan DescribingSensationsPlan;
    #uses plan EnjoyingMomemtWonderPlan;
    #uses plan ExaminingDetailsPlan;
    #uses plan ExpressingEnthisiasmPlan;
    #uses plan EyesWideningWonderPlan;
    #uses plan GaspWonderPlan;
    #uses plan HeadShakingWonderPlan;
    #uses plan MouthOpenWonderPlan;
    #uses plan PausingAbsorbEnvironmentPlan;
    #uses plan RaiseEyebrowsWonderPlan;
    #uses plan ReplayingPastEventsWonder;
    #uses plan SharingFeelingsPlan;
    #uses plan ShoutingPlan;
    #uses plan StaringWonderPlan;
    #uses plan StrugglingToSpeakWonderPlan;
    #uses plan SwearingWonderPlan;
    #uses plan TreasuringMomemrtPlan;
    #uses plan TremblingBodyPlan;
    #uses plan VerbaliszingJoyPlan;
    #uses plan WhisperDramaticallyWonderPlan;
    #uses plan SetPlanContextWonderPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
