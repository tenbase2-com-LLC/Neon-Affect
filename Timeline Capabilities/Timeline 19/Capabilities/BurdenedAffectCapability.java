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
public capability BurdenedAffectCapability extends Capability {
    #uses plan ArmsCrossedBurdenedPlan;
    #uses plan AskForHelpBurdenedPlan;
    #uses plan BadPostureBurdenedPlan;
    #uses plan ClenchedJawBurdenedPlan;
    #uses plan ComplainBurdenedPlan;
    #uses plan DeclineSuggestionsBurdenedPlan;
    #uses plan FidgetingTenseBurdenedPlan;
    #uses plan HesitationBurdenedPlan;
    #uses plan LoweredEyeContactBurdenedPlan;
    #uses plan LowFocusedPlan;
    #uses plan LowWorryingPlan;
    #uses plan NegativeThoughtsBurdenedPlan;
    #uses plan OverthinkingBurdenedPlan;
    #uses plan PessimisticStatementsBurdenedPlan;
    #uses plan ProcrastinationBurdenedPlan;
    #uses plan QuickResponsesBurdenedPlan;
    #uses plan ReluctantCommitmentPlan;
    #uses plan SelfDoubtBurdenedPlan;
    #uses plan ShrugBurdenedPlan;
    #uses plan SighBurdenedPlan;
    #uses plan SlowBodyMovementsBurdenedPlan;
    #uses plan SpeakSoftlyBurdenedPlan;
    #uses plan SubduedToneVoicePlan;
    #uses plan TimeManagementBurdenedPlan;
    #uses plan WeakVoiceBurdenedPlan;
    #uses plan WithdrawalFromOthersBurdenedPlan;
    #uses plan SetPlanContextBurdenedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
