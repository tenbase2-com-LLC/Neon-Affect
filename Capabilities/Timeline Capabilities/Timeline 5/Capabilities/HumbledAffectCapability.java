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
public capability HumbledAffectCapability extends Capability {
    #uses plan DuckHeadPlan;
    #uses plan LowerChinPlan;
    #uses plan CoverFaceHandsHumbledPlan;
    #uses plan HandsOnHipsPlan;
    #uses plan SlowNodPlan;
    #uses plan QuietVoiceHumbledPlan;
    #uses plan ChokedUpPlan;
    #uses plan HoldingBackTearsPlan;
    #uses plan NotDefendingOneselfPlan;
    #uses plan StayBackgrouindPlan;
    #uses plan ExhaleThroughNoseHumbledPlan;
    #uses plan GoingStillPlan;
    #uses plan ArmsCrossedHumbledPlan;
    #uses plan WinceHumbledPlan;
    #uses plan MindRacingPlan;
    #uses plan RiskAversionPlan;
    #uses plan OverlyCriticalSelfPlan;
    #uses plan TryHarderPlan;
    #uses plan RenewedDeterminismPlan;
    #uses plan DenialPlan;
    #uses plan HatredHumbledPlan;
    #uses plan MakingExcusesPlan;
    #uses plan LaughingHumbledPlan;
    #uses plan ArroganceHumbledPlan;
    #uses plan SetPlanContextHumbledPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
