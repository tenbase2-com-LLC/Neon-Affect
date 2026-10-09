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
public capability AmusedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAmusedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> HumorousAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> JokingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> LaughingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> LaughingToOneselfAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> LightLaughterAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> LightlyJokingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> TeasingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> TellingJokesAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> UnforcedLaughAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.VERBAL> UsingSpontaneousWordplayAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> CoveringSmileWithHandAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> EyesDanceSparkleShineAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> GigglingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> GrinAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> HalfSmileAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> KnowingGrinAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> RaisedEyebrowsAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> ShakingHeadWhileSmilingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> SmilingAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.NONVERBAL> SmirkAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> CaptureMemoryAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> CreativityAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> DrawingConnectionsAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> EnjoyingMomentAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> OptimisticAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> PlayfulnessAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> SeekingEnjoyableActivitiesAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> SeekingOutOthersAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> ShareExperienceAmusedPlan;
    #uses BehaviorPlan<AffectEnum.AMUSED, AffectEnum.ACTION> TakingThingsLightlyAmusedPlan;

}

