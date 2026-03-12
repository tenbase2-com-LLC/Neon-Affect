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
public capability TerrorAffectCapability extends Capability {
    #uses plan NotBlinkingPlan;
    #uses plan ScreamingPlan;
    #uses plan SpeechlessnessIncoherencePlan;
    #uses plan HoldingOneselfTightlyPlan;
    #uses plan SqueezingEyesShutPlan;
    #uses plan ShakingHeadTerrorPlan;
    #uses plan CoveringFacePlan;
    #uses plan FlinchingTerrorPlan;
    #uses plan RigidBodyPlan;
    #uses plan ClumsinessPlan;
    #uses plan ImpairedDecisionMakingPlan;
    #uses plan SeeingSpotsPlan;
    #uses plan RiskTakingTerrorPlan;
    #uses plan SurrenderBreakingPointPlan;
    #uses plan SetPlanContextTerrorPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
