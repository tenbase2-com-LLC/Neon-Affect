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
public capability InterestedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInterestedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> AskClarifyingQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> EncouragingElaborationInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> ExpressingCuriosiityPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> OfferingThoughtfulCommecntsPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> ProposingHypothesesInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> RephraseToUnderstandInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> RequestingSpecificExamplesPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> SharingExperiencesInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> SummarizingKeyPointsPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.VERBAL> ThoughtfulResponsesInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> BlinkingSlowlyInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> EyeContactInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> FocusedGazedInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> LeaningInInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> ListeningIntentlyInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> MimickingGesturesPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> OpenBodyPostureInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> RaiseEyebrowsInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> SmilingInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.NONVERBAL> StrokingChinInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> AnalyzingCausesPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> ContemplatingImplicationsPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> EngageCriticalThinkingPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> EvaluatingLongTermPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> ExperimentingWithIdeasInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> FollowingUpInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> IdentifyingGapsReasoningPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> ImaginingScenariosInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> SeekingAlternativePerspectivesInterestedPlan;
    #uses BehaviorPlan<AffectEnum.INTERESTED, AffectEnum.ACTION> SeekingMoreInformationPlan;

}

