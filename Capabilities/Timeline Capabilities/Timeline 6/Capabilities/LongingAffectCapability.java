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
public capability LongingAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextLongingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> ConfusionConversationPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> ConstantlyTalkingAboutLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> DifficultyFocusingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> LackSenseOfTimePlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> LessTalkativeLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> PlanningFutureActivitiesLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> ReminiscingPastLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> SpeakingSoftlyLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> TalkingAboutPastRelationshipsLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.VERBAL> TremblingVoiceLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> AbsentMindedGazeLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> DeepBreathsLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> EyesClosedLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> EyesGlisteningLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> LeanInLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> LongStaringLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> SighLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> SmilingLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> StillnessLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.NONVERBAL> StrongEyeContactLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> ConcentrateLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> DesireToGetCloserLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> DesperationPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> FixatingThoughtsSubjectLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> FrustrationLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> InattentivePlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> IsolationLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> LossOfAppetiteLongingPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> MakingBigChangesPlan;
    #uses BehaviorPlan<AffectEnum.LONGING, AffectEnum.ACTION> SacrificingLongingPlan;

}

