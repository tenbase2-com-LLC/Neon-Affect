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
public capability BoredAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBoredPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> ChangeSubjectBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> ComplainBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> InterruptingBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> IrrelevamtntComversationtPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> MonotoneVoiceBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> SarcasmBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> ShortResponsesBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> SpeakingFlatVoiceBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> SpeakingMatterOfFactBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.VERBAL> WhateverResponseBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> BadPostureBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> CheckWatchBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> FidgetingBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> RepetitiveGesturesPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> RollingEyesBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> SighBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> StaringBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> TappingFootBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> WanderingGazeBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.NONVERBAL> YawningBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> CalculatingTimeRemainingPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> DecliningParticipationPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> DoingRoutineBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> LossOfInterestBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> PlanningFutureActivitiesPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> ProcrastinationBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> ReplayingPastEventsBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> SeekingEnjoyableActivitiesBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> SeekingNewStimuliBoredPlan;
    #uses BehaviorPlan<AffectEnum.BORED, AffectEnum.ACTION> WanderingThoughtsBoredPlan;

}

