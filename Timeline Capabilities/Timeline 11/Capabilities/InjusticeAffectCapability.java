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
public capability InjusticeAffectCapability extends Capability {
    #uses plan ArguingInjusticePlan;
    #uses plan BlameInjusticePlan;
    #uses plan ComplainInjusticePlan;
    #uses plan DemandExplanationPlan;
    #uses plan GaspInjusticePlan;
    #uses plan HandsOnHipsInjusticePlan;
    #uses plan RaisingVoiceInjusticePlan;
    #uses plan RefusingToObeyInjusticePlan;
    #uses plan RollingEyesInjusticePlan;
    #uses plan SarcasmInjusticePlan;
    #uses plan StiffPostureInjusticePlan;
    #uses plan SwearingInjusticePlan;
    #uses plan TakingRevengeInjusticePlan;
    #uses plan WithdrawingFromOthersInjusticePlan;
    #uses plan SetPlanContextInjusticePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
