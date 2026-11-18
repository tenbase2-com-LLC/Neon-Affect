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
public capability NostalgiaAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextNostalgiaPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> DescribingDetailsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> RelivingPastEventsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> ReminiscingPastNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> SharingExperiencesNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> SharingFeelingsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> SighNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> SpeakingSoftlyNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> TalkingAboutPastRelationshipsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> ThoughtfulResponsesNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.VERBAL> TremblingVoiceNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> AbsentMindedGazeNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> DeepBreathsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> EyesClosedNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> EyesGlisteningNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> HalfClosedEyesNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> HuggingNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> LongStaringNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> SlowSmileNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> SmilingNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.NONVERBAL> StillnessNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> CaptureMemoryNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> DesireToGetCloserNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> LosingTrackOfTimeNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> ReplayingPastEventsNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> ResearchingTopicFurtherNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> SeekingQualityTimeNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> SenseOfConnectionNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> ShareExperienceNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> TakingTimeForReflectionNostalgiaPlan;
    #uses BehaviorPlan<AffectEnum.NOSTALGIA, AffectEnum.ACTION> TreasuringMomemrtNostalgiaPlan;

}

