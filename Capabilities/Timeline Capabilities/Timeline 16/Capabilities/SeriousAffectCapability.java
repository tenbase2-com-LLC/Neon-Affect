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
public capability SeriousAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSeriousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> AskQuestionsSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> AvoidingHumorPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> AvoidingSmallTalkPan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> EmphasizingImportantPointsPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> MaintainingFormalTonePlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> ProvidingDetailedExplanationsPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> SpeakingDeliberatelyPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> UsingComplexVocabularyPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> UsingLogicalArgumentsPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.VERBAL> UsingPreciseLanguagePlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> EyeContactSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> FurrowedBrowSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> LipsPursedSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> ListeningIntentlySeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> MinimizeGesturesPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> NoddingSlowlySeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> SlackFaceSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> SlowBodyMovementsPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> SternLookHeadForwardSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.NONVERBAL> StiffPostureSeriousPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> AnalyzingSituationCarefullyPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> ApproachingProblemsMeticulouslyPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> AvodingFrivolousActivitiesPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> ConsideringConsequencesPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> FocusingOnTasksPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> MaintainingProfessionalDemeanorPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> PrioritizingResponsibilitiesPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> SeekingFactualInformationPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> TakingTimeForReflectionPlan;
    #uses BehaviorPlan<AffectEnum.SERIOUS, AffectEnum.ACTION> WeighingOptionsSeriousPlan;

}

