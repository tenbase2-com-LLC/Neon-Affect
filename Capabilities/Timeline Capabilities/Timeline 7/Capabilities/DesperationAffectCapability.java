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
public capability DesperationAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDesperationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> AskForHelpDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> CryingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> IssuingUltimatumsDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> MakingDemandsDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> MoaningDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> PleadingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> ShakyVoicePlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> TalkToSelfDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> UsingPanicWordsDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.VERBAL> VerbalizingHelplessnessDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> ClenchedJawDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> LeanInDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> MakeFistDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> QuickMovementsDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> RapidBreathingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> ShakingHeadDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> StrongGazeDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> SwearingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> TremblingBodyDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.NONVERBAL> WringingHandsDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> AssumingWorstScenarioDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> BargainingPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> NeedControlDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> RebelliousPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> RiskTakingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> SacrificingDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> SeekingComfortDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> SteadfastnessDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> ThinkingIrrationallyDesperationPlan;
    #uses BehaviorPlan<AffectEnum.DESPERATION, AffectEnum.ACTION> WillingToDoAnythingPlan;

}

