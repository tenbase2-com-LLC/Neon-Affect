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
public capability DefiantAffectCapability extends Capability {
    #uses plan StrongPostureDefiantPlan;
    #uses plan ArmsCrossedDefiantPlan;
    #uses plan ChallengingStarePlan;
    #uses plan RefusingToObeyPlan;
    #uses plan NotBreakingEyeContactPlan;
    #uses plan DeepBreathDefiantPlan;
    #uses plan MakeFistPlan;
    #uses plan HandsOnHipsDefiantPlan;
    #uses plan WideStancePlan;
    #uses plan NegativeBehaviorPlan;
    #uses plan RestlessnessDefiantPlan;
    #uses plan SarcasmDefiantPlan;
    #uses plan RefusingToApologizePlan;
    #uses plan NeverBackingDownPlan;
    #uses plan ConfusionDefiantPlan;
    #uses plan ReactingWithoutThinkingPlan;
    #uses plan SteadfastnessDefiantPlan;
    #uses plan NotForgivingPlan;
    #uses plan HavingLastWordPlan;
    #uses plan AngryDefiantPlan;
    #uses plan HostileTonePlan;
    #uses plan MakingThreatsPlan;
    #uses plan GiveBirdPlan;
    #uses plan SetPlanContextDefiantPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
