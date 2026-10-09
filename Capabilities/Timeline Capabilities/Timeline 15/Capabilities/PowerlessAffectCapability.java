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
public capability PowerlessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPowerlessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> ApologizingPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> AskForHelpPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> DeferringToOthersOpinionsPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> ExpressingDefeatPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> PleadingForSupportPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> QuietVoicePowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> UseQualifyingLanguagePlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> UsingHesitantLanguagePowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> VerbalizingHelplessnessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.VERBAL> VoiceTremorPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> BadPosturePowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> DropShouldersPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> FidgetingPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> HoldingPalmUpPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> LookAwayPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> LoweringHeadPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> ShrugPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> TearingUpPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> TremblingBodyPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.NONVERBAL> WringingHandsPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> AdmittingLackCopingSkillsPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> AdmittingLackOfControlPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> AvoidingResponsibilityPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> DisengagingFromGoalsPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> DoubtingOwnJudgementPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> ProcrastinationPowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> RelyingOnOthersPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> RuminatingPastFailuresPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> SeekingReassurancePowerlessPlan;
    #uses BehaviorPlan<AffectEnum.POWERLESS, AffectEnum.ACTION> SurrendingControlPlan;

}

