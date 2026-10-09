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
public capability RageAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextRagePlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> CuttingPeopleOffRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> HoldingBackCriticismPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> InsultRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> LowVoiceRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> MakingThreatsRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> ScreamPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> ShortResponsesRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> SpeakingSlowlyRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> SwearingRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.VERBAL> YellingRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> ClenchedTeethRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> CrackKnucklesIntimidatePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> EyesIntenseRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> FlushedFaceRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> InvadingPersonalSpaceRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> MakeFistRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> PointingFingerAccusatoryRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> StaringDownRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> StiffPostureRagePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.NONVERBAL> TwitchyFeelingPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> DepressionPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> DominateControlPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> FatiguePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> HardToConcentratePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> IncreasedStrengthPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> ManipulatePlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> NoConsequencesPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> PainSuspensionPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> PickFightPlan;
    #uses BehaviorPlan<AffectEnum.RAGE, AffectEnum.ACTION> UpsetOverLittleThingPlan;

}

