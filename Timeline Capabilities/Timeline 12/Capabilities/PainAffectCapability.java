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
public capability PainAffectCapability extends Capability {
    #uses plan AskForHelpPlan;
    #uses plan CryingPainPlan;
    #uses plan DescribingSensationPlan;
    #uses plan FlinchingPainPlan;
    #uses plan GrimacePainPlan;
    #uses plan MoaningPainPlan;
    #uses plan PleadingPainPlan;
    #uses plan ScreamPainPlan;
    #uses plan SeekingMedicalAssistancePlan;
    #uses plan ShallowBreathingPainPlan;
    #uses plan SwearingPainPlan;
    #uses plan TakeAspirinPlan;
    #uses plan WincePainPlan;
    #uses plan WithdrawingFromOthersPainPlan;
    #uses plan SetPlanContextPainPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
