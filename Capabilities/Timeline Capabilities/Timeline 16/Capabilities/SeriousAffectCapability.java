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
public capability SeriousAffectCapability extends Capability {
    #uses plan AnalyzingSituationCarefullyPlan;
    #uses plan ApproachingProblemsMeticulouslyPlan;
    #uses plan AskQuestionsSeriousPlan;
    #uses plan AvodingFrivolousActivitiesPlan;
    #uses plan AvoidingHumorPlan;
    #uses plan AvoidingSmallTalkPan;
    #uses plan ConsideringConsequencesPlan;
    #uses plan EmphasizingImportantPointsPlan;
    #uses plan EyeContactSeriousPlan;
    #uses plan FocusingOnTasksPlan;
    #uses plan LipsPursedSeriousPlan;
    #uses plan MaintainingFormalTonePlan;
    #uses plan MaintainingProfessionalDemeanorPlan;
    #uses plan MinimizeGesturesPlan;
    #uses plan NoddingSlowlySeriousPlan;
    #uses plan PrioritizingResponsibilitiesPlan;
    #uses plan ProvidingDetailedExplanationsPlan;
    #uses plan SeekingFactualInformationPlan;
    #uses plan SlackFaceSeriousPlan;
    #uses plan SlowBodyMovementsPlan;
    #uses plan SpeakingDeliberatelyPlan;
    #uses plan StiffPostureSeriousPlan;
    #uses plan TakingTimeForReflectionPlan;
    #uses plan UsingComplexVocabularyPlan;
    #uses plan UsingLogicalArgumentsPlan;
    #uses plan UsingPreciseLanguagePlan;
    #uses plan WeighingOptionsSeriousPlan;
    #uses plan SetPlanContextSeriousPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
