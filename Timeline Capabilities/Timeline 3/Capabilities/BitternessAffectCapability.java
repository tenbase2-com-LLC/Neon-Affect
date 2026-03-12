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
public capability BitternessAffectCapability extends Capability {
    #uses plan AbnoxiousPlan;
    #uses plan HeadForwardLookPlan;
    #uses plan SourLookPlan;
    #uses plan SpeakingMatterOfFactPlan;
    #uses plan ShakingHeadBitternessPlan;
    #uses plan TakingOffenseEasilyPlan;
    #uses plan ArmsCrossedBitternessPlan;
    #uses plan ComplainingConstantlyPlan;
    #uses plan SneeringPlan;
    #uses plan ASetJawPlan;
    #uses plan NotMeaningStatementPlan;
    #uses plan OpinionatedPlan;
    #uses plan InterruptingBitternessPlan;
    #uses plan TenseMovementPlan;
    #uses plan UnableToRelaxBitternessPlan;
    #uses plan PlacingFaultPlan;
    #uses plan GivingAdvicePlan;
    #uses plan FakeSmileBitternessPlan;
    #uses plan HarshVoiceWordsPlan;
    #uses plan ArgumentativePlan;
    #uses plan LashingOutPlan;
    #uses plan HoldingGrudgeBringingUpPastPlan;
    #uses plan UngratefulPlan;
    #uses plan UnhelpfulPlan;
    #uses plan QuickToBlamePlan;
    #uses plan KeepingSecretsPlan;
    #uses plan SicklyPlan;
    #uses plan SensitiveToTouchPlan;
    #uses plan BlameSomeoneElsePlan;
    #uses plan UnrustworthyPlan;
    #uses plan NoResponsibilityPlan;
    #uses plan GetEvenPlan;
    #uses plan UnforgivingPlan;
    #uses plan JudgementalBitternessPlan;
    #uses plan MoodSwingsBitternessPlan;
    #uses plan IsolationPlan;
    #uses plan NoSmallTalkPlan;
    #uses plan SetPlanContextBitternessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
