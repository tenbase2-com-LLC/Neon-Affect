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
public capability VengefulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextVengefulPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> AnsweringQuestionsIndirectlyPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> HoldingBackInformationPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> HoldingGrudgeBringingUpPastVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> InsultVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> LyingEasilyConvicinglyPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> MakingThreatsVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> NotForgivingVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> RarelyApologizingPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> SarcasmVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.VERBAL> VerballyAttackPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> HoldingChinUpPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> HoldingFullBreathPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> IntenseGazePlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> InvadingPersonalSpacePlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> NarrowEyesPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> SmirkVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> SneeringVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> StiffPosturePlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> StrongGesturePlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.NONVERBAL> TensionInJawPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> BidingTimePlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> EncouragingSelfDoubtPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> FantasizingGettingEvenPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> NormalRoutineAmissPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> ObsessingPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> PatienceForRightMomentPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> ReadingIntoSayDoPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> RelivingWrongfulEventsPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> RetaliationVengefulPlan;
    #uses BehaviorPlan<AffectEnum.VENGEFUL, AffectEnum.ACTION> SeekingRevengeVengefulPlan;

}

