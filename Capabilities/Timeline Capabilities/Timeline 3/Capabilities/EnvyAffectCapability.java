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
public capability EnvyAffectCapability extends Capability {
    #uses plan StaringEnvyPlan;
    #uses plan SquintingPlan;
    #uses plan CrossingArmsEnvyPlan;
    #uses plan RudenessPlan;
    #uses plan SwallowingQuicklyPlan;
    #uses plan HandsOverClothesPlan;
    #uses plan MutteringEnvyPlan;
    #uses plan LickingLipsEnvyPlan;
    #uses plan ReddeningFacePlan;
    #uses plan TakingStepForwardPlan;
    #uses plan DesireAffectionPlan;
    #uses plan UpsetPlan;
    #uses plan UnkindThoughtsEnvyPlan;
    #uses plan FrustrationEnvyPlan;
    #uses plan SelfLoathingPlan;
    #uses plan UnableToCommitPlan;
    #uses plan DissatisfiiedPlan;
    #uses plan EntitlementPlan;
    #uses plan ArguingEnvyPlan;
    #uses plan IrrationalThinkingPlan;
    #uses plan MakingDemandsPlan;
    #uses plan SetPlanContextEnvyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
