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
public capability RageAffectCapability extends Capability {
    #uses plan HoldingBackCriticismPlan;
    #uses plan UpsetOverLittleThingPlan;
    #uses plan PickFightPlan;
    #uses plan CrackKnucklesIntimidatePlan;
    #uses plan ScreamPlan;
    #uses plan StaringDownRagePlan;
    #uses plan ManipulatePlan;
    #uses plan PainSuspensionPlan;
    #uses plan IncreasedStrengthPlan;
    #uses plan TwitchyFeelingPlan;
    #uses plan NoConsequencesPlan;
    #uses plan DominateControlPlan;
    #uses plan HardToConcentratePlan;
    #uses plan DepressionPlan;
    #uses plan FatiguePlan;
    #uses plan SetPlanContextRagePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
