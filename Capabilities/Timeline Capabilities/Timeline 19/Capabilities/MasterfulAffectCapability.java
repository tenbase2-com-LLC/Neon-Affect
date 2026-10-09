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
public capability MasterfulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMasterfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> AskQuestionsMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> AuthoritativeToneSpeechPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> ClearDirectivesPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> ConfidentDeclarationsMastefulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> EffortlessEloquencePlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> EmpoweringEncouragementPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> ExpertiseArticulationPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> ImprovisedSpeechMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> InsightfulCommentaryPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.VERBAL> PreciseExplanationPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> EnergeticPresencePlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> FluidMovementMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> ListeningIntentlyMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> OpenBodyLanguageMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> PreciseHandMovementsMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> RelaxedAlertnessPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> SlowEvenBreathsMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> SmilingMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> SteadyEyeContactMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.NONVERBAL> StiffPostureMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> AdaptabilityMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> AttentionToDetailMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> CreativityMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> DecisionMakingMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> FosteringOthersGrowthMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> HeightenedAwarenessMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> MentalClarityMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> MultitaskingMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> ProblemSolvingMasterfulPlan;
    #uses BehaviorPlan<AffectEnum.MASTERFUL, AffectEnum.ACTION> ResourcefulnessMasterfulPlan;

}

