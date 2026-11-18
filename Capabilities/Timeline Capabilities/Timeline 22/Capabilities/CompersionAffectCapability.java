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
public capability CompersionAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCompersionPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> AcknowledgingEffortCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> AffirmingOthersFeelingsCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> AskForMoreDetailsCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> CheeringCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> CommentingOnSkillCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> EnthusiasticExclamationCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> GivingPraiseCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> OfferingCongratulationsCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> PraisingOthersCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.VERBAL> WarmToneVoiceCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> ApplaudingCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> EyesGlisteningCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> GivingThumbsUpCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> HandClappingCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> HuggingCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> JoyfulTearsCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> NoddingLeaningInWhileListeningCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> PlacingHandOverHeartCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> SlowNodCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.NONVERBAL> SmilingCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> CelebratingMilestonesCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> ConsideringOthersPerspectivesCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> EnjoyingMomentCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> FollowingUpCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> GenerosityCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> IncreasedEmpathyCompassionAltruismCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> OfferingToHelpCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> SharingResourcesCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> ShowingAppreciationCompersionPlan;
    #uses BehaviorPlan<AffectEnum.COMPERSION, AffectEnum.ACTION> SpreadJoyCompersionPlan;

}

