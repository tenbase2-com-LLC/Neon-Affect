/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
    #uses plan AdaptabilityMasterfulPlan;
    #uses plan AskQuestionsMasterfulPlan;
    #uses plan AuthoritativeToneSpeechPlan;
    #uses plan ClearDirectivesPlan;
    #uses plan ConfidentDeclarationsMastefulPlan;
    #uses plan CreativityMasterfulPlan;
    #uses plan DecisionMakingMasterfulPlan;
    #uses plan EffortlessEloquencePlan;
    #uses plan EmpoweringEncouragementPlan;
    #uses plan EnergeticPresencePlan;
    #uses plan ExpertiseArticulationPlan;
    #uses plan HeightenedAwarenessMasterfulPlan;
    #uses plan InsightfulCommentaryPlan;
    #uses plan MentalClarityMasterfulPlan;
    #uses plan MultitaskingMasterfulPlan;
    #uses plan OpenBodyLanguageMasterfulPlan;
    #uses plan PreciseExplanationPlan;
    #uses plan ProblemSolvingMasterfulPlan;
    #uses plan RelaxedAlertnessPlan;
    #uses plan SlowEvenBreathsMasterfulPlan;
    #uses plan SmilingMasterfulPlan;
    #uses plan SteadyEyeContactMasterfulPlan;
    #uses plan StiffPostureMasterfulPlan;
    #uses plan SetPlanContextMasterfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
