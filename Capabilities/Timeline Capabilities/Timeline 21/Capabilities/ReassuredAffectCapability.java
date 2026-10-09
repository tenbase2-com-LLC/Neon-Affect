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
public capability ReassuredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextReassuredPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> AskForRepetitionReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> ExpressingAgreementReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> ExpressingGratitudeReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> HumorousReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> LightLaughterReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> MeasuredResponsesReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> PositiveSelfTalkReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> SighReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> SincereThankYousReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.VERBAL> SoftGentleVoiceReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> EasyBreathingReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> HugeBreathReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> HuggingReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> NoddingReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> NoddingWhileListeningReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> QuickNoddingReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> RelaxedPostureReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> SlowEvenBreathsReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> SlowSmileReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.NONVERBAL> SmilingReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> BeingOptimisticReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> CalmingDownReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> ContentmentReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> GratitudeReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> LettingGoConcernsReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> MakePlansReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> OpenToSuggestionsReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> RelyingOnOthersReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> ThinkingLogicallyReassuredPlan;
    #uses BehaviorPlan<AffectEnum.REASSURED, AffectEnum.ACTION> TrustingReassuredPlan;

}

