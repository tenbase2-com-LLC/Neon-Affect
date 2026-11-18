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
public capability WistfulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextWistfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> DifficultyFocusingWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> EngagingPhilosophicalDiscussionsWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> LessTalkativeWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> PlanningFutureActivitiesWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> ReminiscingPastWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> SharingFeelingsWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> SighWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> SpeakingSoftlyWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> TalkingAboutPastRelationshipsWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.VERBAL> UnhurriedSpeechWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> AbsentMindedGazeWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> DeepBreathsWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> EyesClosedWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> EyesGlisteningWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> LeanInWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> LongStaringWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> SlowBodyMovementsWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> SlowSmileWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> SmilingWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.NONVERBAL> StillnessWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> DesireToGetCloserWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> FantasizingWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> ImagineWhatWillHappenWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> InattentiveWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> MakePlansWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> SeekingNewOpportunitiesWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> SeekingOutOthersWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> TakingTimeForReflectionWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> TreasuringMomemrtWistfulPlan;
    #uses BehaviorPlan<AffectEnum.WISTFUL, AffectEnum.ACTION> WanderingThoughtsWistfulPlan;

}

