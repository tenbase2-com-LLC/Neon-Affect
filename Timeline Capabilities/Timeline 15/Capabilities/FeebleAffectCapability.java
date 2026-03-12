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
public capability FeebleAffectCapability extends Capability {
    #uses plan ApologizingFeeblePlan;
    #uses plan AskOthersOpinionPlan;
    #uses plan AvoidingEyeContactFeeblePlan;
    #uses plan AvoidingGesturesPlan;
    #uses plan AvoidingPhysicalContactPlan;
    #uses plan AvoidingChallengesFeeblePlan;
    #uses plan BadPostureFeeblePlan;
    #uses plan CoweringPlan;
    #uses plan DoubtingOwnJudgementPlan;
    #uses plan ExpressingUncertaintyPlan;
    #uses plan FailingToAssertOneselfPlan;
    #uses plan GivingUpEasilyPlan;
    #uses plan HesitatingToTakeInitiativePlan;
    #uses plan HoldBreathFeeblePlan;
    #uses plan OveranalyzingTasksPlan;
    #uses plan ProcrastinationFeeblePlan;
    #uses plan ShrinkingAwayFromAttentionPlan;
    #uses plan SpeakWeakVoicePlan;
    #uses plan StrugglingToSpeakFeeblePlan;
    #uses plan UnderestimatingOwnAbilitiesPlan;
    #uses plan UsingHesitantLanguagePlan;
    #uses plan VerbalizingSelfDoubtPlan;
    #uses plan WringingHandsPlan;
    #uses plan SetPlanContextFeeblePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
