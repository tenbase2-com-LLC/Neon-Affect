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
public capability GriefAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextGriefPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> CondescendingPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> CryingGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> LashingOutGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> LosingTrackConversationPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> LosingTrackOfTimeGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> MoaningGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> OneWordAnswerGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> RelivingPastEventsGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> WeakVoiceSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.VERBAL> WishingEventNeverHappenedGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> CoverFaceHandsGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> EmptyStareGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> LossOfBreathPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> NoiseSensitivityGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> RedEyesGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> ShakingHeadGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> SlackFacePlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> TremblingLipsPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> WeakMovementsPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.NONVERBAL> WeakPostureGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> AskForHelpGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> DwellingOnPastGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> InabilityToSeeFutureGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> IsolationGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> LackOfMotivationPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> LonelinessPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> OverdoingItPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> ParanoiaGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> SeekingComfortGriefPlan;
    #uses BehaviorPlan<AffectEnum.GRIEF, AffectEnum.ACTION> StopMidTaskGriefPlan;

}

