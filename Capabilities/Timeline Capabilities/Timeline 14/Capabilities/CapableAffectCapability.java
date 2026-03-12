/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public capability CapableAffectCapability extends Capability {
    #uses plan AdaptabilityPlan;
    #uses plan AnsweringQuestionsPlan;
    #uses plan AttentionToDetailPlan;
    #uses plan CalmExteriorCapablePlan;
    #uses plan ConfidentPosturePlan;
    #uses plan ConfidentVoiceCapablePlan;
    #uses plan DecisionMakingPlan;
    #uses plan DetailedExplanationsCapablePlan;
    #uses plan EfficientlyManagingTasksPlan;
    #uses plan EyeContactCapabilePlan;
    #uses plan GivingEncouragementPlan;
    #uses plan ListeningIntentlyCapablePlan;
    #uses plan MaintainComposurePlan;
    #uses plan NoddingCapablePlan;
    #uses plan OfferingAdvicePlan;
    #uses plan ProblemSolvingPlan;
    #uses plan ResourcefulnessPlan;
    #uses plan SharingExperienceCapablePlan;
    #uses plan SmilingSincerelyPlan;
    #uses plan TakingInitiativePlan;
    #uses plan SetPlanContextCapablePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
