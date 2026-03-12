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
public capability ListlessAffectCapability extends Capability {
    #uses plan AbsentMindedGazePlan;
    #uses plan AvoidingResponsibilitiesPlan;
    #uses plan BadpostureListlessPlan;
    #uses plan BlinkingSlowlyListlessPlan;
    #uses plan DelayedReactionListlessPlan;
    #uses plan DelayedResponseListlessPlan;
    #uses plan ExpressingLackOfEnthusiasmPlan;
    #uses plan EyesHeavyListlessPlan;
    #uses plan FacialExpressionsListlessPlan;
    #uses plan ForgettingListlessPlan;
    #uses plan LackOfInitiativeListlessPlan;
    #uses plan LossOfInterestPlan;
    #uses plan LowEnergyConversationPlan;
    #uses plan MonotoneVoiceListlessPlan;
    #uses plan PassiveAgreementPlan;
    #uses plan PoorDecisionMakingPlan;
    #uses plan ProcrastinationListlessPlan;
    #uses plan ReducedProductivityPlan;
    #uses plan SighListlessPlan;
    #uses plan UsingMinimalWordsListlessPlan;
    #uses plan VagueAnswersPlan;
    #uses plan SetPlanContextListlessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
