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
public capability FrustrationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFrustrationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> AskQuestionsFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> InsultFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> MutteringFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> PleadingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> RushedSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> SharpToneFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> ShortResponsesFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> SwearingFrustationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> TemperTantrumPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.VERBAL> YellingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> ArmsCrossedFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> ClenchedTeethFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> DeepBreathBeforeSpeakingPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> PurseLipsFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> RubBackOfNeckFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> ShakeHeadFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> SighFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> SniffingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> StiffPostureFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.NONVERBAL> ThrowingHandsUpPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> CloudedJudgementFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> ClumsinessFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> DemandingImmediateActionFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> GiveUpGoalFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> IrritabilityFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> LackOfEmotionFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> PacingFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> RuminationOverGrievancesFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> SeekingAlternativeOptionsFrustrationPlan;
    #uses BehaviorPlan<AffectEnum.FRUSTRATION, AffectEnum.ACTION> TryHarderFrustrationPlan;

}

