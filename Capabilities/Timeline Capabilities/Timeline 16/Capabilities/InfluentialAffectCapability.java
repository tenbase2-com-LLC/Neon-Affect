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
public capability InfluentialAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInfluentialPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> AskQuestionsInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> CharmingEloquencePlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> ConfidentVoiceInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> EffectiveNegotiationPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> EmpoweringEncouragmentPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> PersuasiveSpeechInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> SharingIdeasInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> SpeakToInspireInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> StrategicWordChoicePlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.VERBAL> ThoughtfulResponsesInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> AttentiveBodyLanguagePlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> CharmingDemeanorPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> CommandingPresencePlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> ConfidentPostureInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> EyeContactInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> FacialExpressionsInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> GracefulHandGesutresPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> ListeningIntentlyInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> OpenGesturesInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.NONVERBAL> SmilingInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> AdaptiveLeadershipPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> BeingOpenMindedInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> BuildRelationshipsInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> EmpatheticUnderstandingPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> InnovativeThinkingInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> LeadByExampleInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> StrategicNetworkingPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> StrategicPlanningInfluentialPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> TrendSettingPlan;
    #uses BehaviorPlan<AffectEnum.INFLUENTIAL, AffectEnum.ACTION> VisionarySolutionsPlan;

}

