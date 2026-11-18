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
public capability PainAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPainPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> CryingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> DescribingSensationPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> MoaningPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> PleadingForSupportPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> PleadingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> ScreamPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> ShortResponsesPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> SwearingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> VoiceStrainedPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.VERBAL> WhimperPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> ClenchedJawPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> FlinchingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> GrimacePainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> HandsToStomachPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> HeavyBreathingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> HoldBreathPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> ShallowBreathingPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> StiffPosturePainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> TearingUpPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.NONVERBAL> WincePainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> AskForHelpPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> DesireToBeHeldPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> InabilityToFocusPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> IrritabilityPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> SeekingComfortPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> SeekingMedicalAssistancePlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> SitPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> TakeAspirinPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> TakingLongBreakPainPlan;
    #uses BehaviorPlan<AffectEnum.PAIN, AffectEnum.ACTION> WithdrawingFromOthersPainPlan;

}

