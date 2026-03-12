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
public capability AnnoyanceAffectCapability extends Capability {
    #uses plan SighAnnoyancePlan;
    #uses plan AssertivePlan;
    #uses plan ArmsCrossedAnnoyancePlan;
    #uses plan GrimaceAnnoyancePlan;
    #uses plan ComplainPlan;
    #uses plan ShakeHeadAnnoyancePlan;
    #uses plan ShiftWeightPlan;
    #uses plan DeepBreathAnnoyancePlan;
    #uses plan FakeSmilePlan;
    #uses plan SarcasmAnnoyancePlan;
    #uses plan SharpToneAnnoyancePlan;
    #uses plan ShortResponsesPlan;
    #uses plan StiffPostureAnnoyancePlan;
    #uses plan NoiseSensitivityAnnoyancePlan;
    #uses plan StrayingAttentionPlan;
    #uses plan MakingMentalComparisonsPlan;
    #uses plan RedFaceAnnoyancePlan;
    #uses plan NotRespondingAnnoyancePlan;
    #uses plan SetPlanContextAnnoyancePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
