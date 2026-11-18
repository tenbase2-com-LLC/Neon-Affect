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
public capability ConnectednessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextConnectednessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> AffirmingOthersFeelingsConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> AskingQuestionsConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> BeingHonestConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> LaughingMorePlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> LightlyJokingPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> SayingPersonalThingsPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> SeekingConsensusConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> SharingExperiencesConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> UsingInclusiveLanguageConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.VERBAL> WelcomingQuestionsPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> CloseEyesDeepBreathPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> DeepBreathsConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> EyeContactConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> FocusedGazedConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> ImitationBodyLanguageConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> LeaningInConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> NoddingWhileListeningConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> OpenBodyPostureConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> RelaxedPostureConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.NONVERBAL> SmilingConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> BuildRelationshipsConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> DeepAdmirationPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> DeepThinkingPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> EmbracingChallengesPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> IncreasedConfidenceConnectednessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> LackOfJudgementPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> PerformActsOfKindnessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> PlayfulnessPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> SpendingMoreTimeWithOthersPlan;
    #uses BehaviorPlan<AffectEnum.CONNECTEDNESS, AffectEnum.ACTION> WillingnessToHelpPlan;

}

