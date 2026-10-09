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
public capability DistressedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDistressedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> AskForHelpDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> ExpressingFeelingsPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> MakingSoundsPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> PleadingForSupportPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> RepeatThoughtsPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> SpeakingQuicklyDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> StutteringDistressePlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> UsingPanicWordsPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> VocalizingAnxietyPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.VERBAL> VoicingWorryPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> ClenchedJawDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> CoveringFaceDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> EyesWideningDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> FidgetingDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> LookAroundDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> QuickMovementsDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> RapidBreathingDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> StiffPostureDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> TremblingBodyDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.NONVERBAL> WringingHandsDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> AvoidingPanicSituationsDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> ConfusionDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> EasilyOverwhelmedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> InabilityToFocusDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> NeglectingSelfPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> OverthinkingProblemsPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> PessimisticThoughtsDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> ReassuranceFromOthersDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> RepeatingNegativesDistressedPlan;
    #uses BehaviorPlan<AffectEnum.DISTRESSED, AffectEnum.ACTION> SeekingReassurancePlan;

}

