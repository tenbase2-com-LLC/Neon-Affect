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
public capability PanicAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPanicPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> AskForHelpPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> CryingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> ElevatedPitchTone;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> QuickChoppySentencesPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> RepeatingWordsPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> ScreamingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> ShakyVoicePanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> StutteringPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> TalkToSelfPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.VERBAL> UsingPanicWordsPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> ClenchedJawPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> EyesWideningPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> HyperventilatingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> LookAroundPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> OnEdgePlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> QuickBreathingPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> RigidBodyPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> SweatingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> TremblingBodyPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.NONVERBAL> WringingHandsPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> AvoidingPanicSituationsPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> BeingNegativePlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> CalmingDownPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> DepressionPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> DevelopingPanicDisorderPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> DevelopingPhobiasPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> DisorientedPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> ImpairedDecisionMakingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> PacingPanicPlan;
    #uses BehaviorPlan<AffectEnum.PANIC, AffectEnum.ACTION> ReassuranceFromOthersPanicPlan;

}

