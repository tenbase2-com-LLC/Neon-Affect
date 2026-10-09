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
public capability AggressiveAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextAggressivePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> ExpressingAngerPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> InsultAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> InterruptingAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> IssuingUltimatumsPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> MakingDemandsAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> ShoutingAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> SpeakingLoudlyAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> SwearingAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> UsingConfrontationalToneAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.VERBAL> UsingThreateningLanguagePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> ClenchedTeethAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> EyesIntensePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> FlushedFaceAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> InvadingPersonalSpaceAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> MakeFistAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> NarrowEyesAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> PointingFingerAccusatoryPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> StaringDownAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> StiffPostureAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.NONVERBAL> ThrowingHandsUpAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> ActingTerritorialyPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> DominatingOthersPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> EscalatingConflictsPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> IgnoringOthersAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> InterpretingSituationsHostileyPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> IrritabilityAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> ReactingImpulsivelyPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> RefusingToCompromiseAggressivePlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> RetaliationPlan;
    #uses BehaviorPlan<AffectEnum.AGGRESSIVE, AffectEnum.ACTION> SeekingConfrontationPlan;

}

