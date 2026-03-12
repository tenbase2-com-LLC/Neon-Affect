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
public capability ReliefAffectCapability extends Capability {
    #uses plan CoverMouthWithHandPlan;
    #uses plan ShakingHeadReliefPlan;
    #uses plan GaspPlan;
    #uses plan BadPostureReliefPlan;
    #uses plan SlowSmileReliefPlan;
    #uses plan HumorousPlan;
    #uses plan ShakyLaughterPlan;
    #uses plan AskForRepetitionPlan;
    #uses plan StrugglingToSpeakPlan;
    #uses plan CryingReliefPlan;
    #uses plan AskQuestionsReliefPlan;
    #uses plan LookingUpwardPlan;
    #uses plan HugeBreathPlan;
    #uses plan SlightMoanPlan;
    #uses plan SlightOpenMouthPlan;
    #uses plan HandsToStomachPlan;
    #uses plan BowHeadReliefPlan;
    #uses plan QuickNoddingPlan;
    #uses plan SwearingReliefPlan;
    #uses plan DesireToBeHeldPlan;
    #uses plan StillnessPlan;
    #uses plan GratitudeReliefPlan;
    #uses plan JumbledThoughtsPlan;
    #uses plan UnableToSpeakPlan;
    #uses plan PostponingLossPlan;
    #uses plan SetPlanContextReliefPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
