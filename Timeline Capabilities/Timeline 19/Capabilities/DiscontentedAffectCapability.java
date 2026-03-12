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
public capability DiscontentedAffectCapability extends Capability {
    #uses plan ArmsCrossingDiscontentedPlan;
    #uses plan AskQuestionsDiscontentedPlan;
    #uses plan ComplainDiscontentedPlan;
    #uses plan CriticizeDiscontentPlan;
    #uses plan FaultFindingPlan;
    #uses plan FrownDiscontentedPlan;
    #uses plan HeadShakingDiscontentedPlan;
    #uses plan LipsPursedDiscontentedPlan;
    #uses plan LookAwayDiscontentedPlan;
    #uses plan NegativeComparisonsPlan;
    #uses plan NegativeThoughtsDiscontentedPlan;
    #uses plan PassiveAggressiveCommentsDiscontentPlan;
    #uses plan PessimisticStatementsPlan;
    #uses plan ResistanceToCompromisePlan;
    #uses plan RollingEyesDiscontentedPlan;
    #uses plan RuminationOverGrievancesPlan;
    #uses plan SarcasmDiscontentedPlan;
    #uses plan SeekingApprovalDiscontentedPlan;
    #uses plan SelfNegativeTalkDiscontentedPlan;
    #uses plan SelfPityPlan;
    #uses plan SighDiscontentedPlan;
    #uses plan StiffPostureDiscontentedPlan;
    #uses plan WithdrawingFromSituationPlan;
    #uses plan SetPlanContextDiscontentedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
