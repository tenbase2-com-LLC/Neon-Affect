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
public capability EuphoriaAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEuphoriaPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> EuphoricExclamationsEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> ExpressingGratitudeEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> GiddinessEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> HighlyTalkativeAndExpressiveEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> LaughingEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> MakingBoldDeclarationsEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> RapidSpeechDecliningArticulationPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> SharingFeelingsEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> SlurringWordsPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.VERBAL> SpeechlessnessEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> DeepBreathsEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> EyesWideAndGlowingEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> FlushedFaceEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> GaspEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> HalfClosedEyesEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> MouthOpeningInWonderPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> RapidEyeMovementsEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> SmileGrinCannotBeContainedEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> TemporaryBreathlessnessPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.NONVERBAL> UnrestrainedSmilingLaughterPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> DesireToSpreadHappinessEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> HeightenedCreativityPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> IncreasedEmpathyCompassionAltruismPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> InvincibilityPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> LosingTrackOfTimeEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> MoreLikelyToNoticeBeautyPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> NotCaringWhatOthersThinkEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> RiskTakingEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> TooExcitedToThinkStraightEuphoriaPlan;
    #uses BehaviorPlan<AffectEnum.EUPHORIA, AffectEnum.ACTION> WantingFeelingToLastEuphoriaPlan;

}

