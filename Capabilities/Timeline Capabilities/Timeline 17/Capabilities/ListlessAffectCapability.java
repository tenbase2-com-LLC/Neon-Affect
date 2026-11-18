/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextListlessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> DelayedResponseListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> ExpressingLackOfEnthusiasmPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> LowEnergyConversationPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> MonotoneVoiceListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> MumblingListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> SighListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> SpeakingFlatVoiceListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> UsingMinimalWordsListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> VagueAnswersPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.VERBAL> WhateverResponseListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> AbsentMindedGazePlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> BadpostureListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> BlinkingSlowlyListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> DelayedReactionListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> DullEyesListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> EyesHeavyListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> FacialExpressionsListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> ShrugListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> SlowingBodyMovementsListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.NONVERBAL> YawningListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> AvoidingResponsibilitiesPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> DecliningParticipationListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> ForgettingListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> LackOfInitiativeListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> LossOfInterestPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> PassiveAgreementPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> PoorDecisionMakingPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> ProcrastinationListlessPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> ReducedProductivityPlan;
    #uses BehaviorPlan<AffectEnum.LISTLESS, AffectEnum.ACTION> WanderingThoughtsListlessPlan;

}

