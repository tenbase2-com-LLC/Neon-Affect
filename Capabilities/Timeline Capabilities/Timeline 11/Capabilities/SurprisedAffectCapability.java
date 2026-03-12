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
public capability SurprisedAffectCapability extends Capability {
    #uses plan BlinkingRapidlySurprisedPlan;
    #uses plan BreathingStoppedAbruptlySurprisedPlan;
    #uses plan DizzinessSurprisedPlan;
    #uses plan DoubleTakeSurprisedPlan;
    #uses plan EyesWideningSurprisedPlan;
    #uses plan FlushedFaceSurprisedPlan;
    #uses plan GaspSurprisedPlan;
    #uses plan HeadTiltingToSideSurprisedPlan;
    #uses plan InabilityToFocusSurprisedPlan;
    #uses plan InabilityToSpeakSurprisedPlan;
    #uses plan LaughterSurprisedPlan;
    #uses plan MouthOpenSurprisedPlan;
    #uses plan NoddingSurprisedPlan;
    #uses plan ScreamSurprisedPlan;
    #uses plan SmileBuildingSurprisedPlan;
    #uses plan StiffPostureSurprisedPlan;
    #uses plan SwearingSurprisedPlan;
    #uses plan TearingUpSurprisedPlan;
    #uses plan VoicePirchRisingSurprisedPlan;
    #uses plan VoiceTremorSurprisedPlan;
    #uses plan WantingToBeAloneSurprisedPlan;
    #uses plan SetPlanContextSurprisedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
