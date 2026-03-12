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
public capability DefeatedAffectCapability extends Capability {
    #uses plan AcknowledgingMistakesPlan;
    #uses plan AdmittingDefeatePlan;
    #uses plan ApologizingDefeatedPlan;
    #uses plan AvoidingChallengesDefeatedPlan;
    #uses plan AvoidingEyeContactDefeatedPlan;
    #uses plan BadPostureDefeatedPlan;
    #uses plan BitingLipDefeatedPlan;
    #uses plan ConcedingArgumentPlan;
    #uses plan DeepSighDefeatedPlan;
    #uses plan ExpressingDisappointmentPlan;
    #uses plan ExpressingHopelessnessPlan;
    #uses plan FidgetingDefeatedPlan;
    #uses plan FrownDefeatedPlan;
    #uses plan GiveUpGoalDefeatedPlan;
    #uses plan HeavyBreathingDefeatedPlan;
    #uses plan LackOfInitiativePlan;
    #uses plan LetOthersControlPlan;
    #uses plan NeglectingEverythingElseDefeatedPlan;
    #uses plan NotFollowingThroughPlan;
    #uses plan ProcrastinateDefeatedPlan;
    #uses plan SelfNegativeTalkPlan;
    #uses plan TakingBlamePlan;
    #uses plan TearingUpDefeatedPlan;
    #uses plan WithdrawingFromOthersDefeatedPlan;
    #uses plan SetPlanContextDefeatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
