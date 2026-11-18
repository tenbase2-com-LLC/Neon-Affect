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
public capability ReliefAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextReliefPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> AskForRepetitionPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> AskQuestionsReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> CryingReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> ExpressingGratitudeReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> HumorousPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> ShakyLaughterPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> SlightMoanPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> StrugglingToSpeakPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> SwearingReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.VERBAL> UnableToSpeakPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> BadPostureReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> BowHeadReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> CoverMouthWithHandPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> GaspPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> HandsToStomachPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> HugeBreathPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> LookingUpwardPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> QuickNoddingPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> ShakingHeadReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> SlightOpenMouthPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> SlowSmileReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.NONVERBAL> StillnessPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> CalmingDownReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> ContentmentReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> DesireToBeHeldPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> GratitudeReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> JumbledThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> LettingGoConcernsReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> MakePlansReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> PostponingLossPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> SeekingOutOthersReliefPlan;
    #uses BehaviorPlan<AffectEnum.RELIEF, AffectEnum.ACTION> TakingLongBreakReliefPlan;

}

