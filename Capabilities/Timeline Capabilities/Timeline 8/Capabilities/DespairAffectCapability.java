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
public capability DespairAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDespairPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> AskForHelpDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> CryingDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> ExpressingHopelessnessDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> MoaningDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> MonotoneVoiceDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> PessimisticStatementsDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> PleadingDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> VerbalizingHelplessnessDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> WeakVoiceDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.VERBAL> WhimperDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> ArmsAtSideDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> BadPostureDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> CoverFaceHandsDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> GrimaceDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> MouthOpenDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> NotWipingTearsPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> RedEyesDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> ShakingHeadDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> ShortBreathsPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.NONVERBAL> SighDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> DepressionDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> DisengagingFromGoalsDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> GiveUpGoalDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> InabilityToSeeFutureDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> IsolationDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> LackOfMotivationDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> LosingTrackOfTimeDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> NotKeepingUpPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> RelyingOnOthersDespairPlan;
    #uses BehaviorPlan<AffectEnum.DESPAIR, AffectEnum.ACTION> SeekingComfortDespairPlan;

}

