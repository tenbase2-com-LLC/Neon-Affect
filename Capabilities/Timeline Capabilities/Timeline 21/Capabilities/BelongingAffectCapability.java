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
public capability BelongingAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBelongingPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> ActiveListeningResponsesBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> LaughingMoreBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> LightlyJokingBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> MeaningfullConversationBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> SayingPersonalThingsBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> SeekingConsensusBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> SharingExperiencesBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> SharingIdeasBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> UsingInclusiveLanguageBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.VERBAL> WelcomingQuestionsBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> CloseEyesDeepBreathBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> EyeContactBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> GenuineSmileBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> HighFiveBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> ImitationBodyLanguageBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> LeaningInBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> ListeningIntentlyBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> NoddingWhileListeningBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> OpenBodyPostureBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.NONVERBAL> RelaxedPostureBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> BuildRelationshipsBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> ConformingBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> CoordinatingActionsBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> IncreasedConfidenceBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> PlayfulnessBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> SharingResourcesBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> SpendingMoreTimeWithOthersBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> StayingConsistentBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> VolunteeringBelongingPlan;
    #uses BehaviorPlan<AffectEnum.BELONGING, AffectEnum.ACTION> WillingnessToHelpBelongingPlan;

}

