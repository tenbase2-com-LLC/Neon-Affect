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
public capability ArrogantAffectCapability extends Capability {
    #uses plan BelievingRulesDoNotApplyPlan;
    #uses plan BraggingArrogantPlan;
    #uses plan DemandSpecialTreatmentPlan;
    #uses plan DismissingOthersOpinionsArrogantPlan;
    #uses plan GesturesArrogantPlan;
    #uses plan IgnoringOthersArrogantPlan;
    #uses plan InterruptingArrogantPlan;
    #uses plan LookAwayArrogantPlan;
    #uses plan LookingDisinterestedArrogantPlan;
    #uses plan ManipulateArrogantPlan;
    #uses plan OverestimatingAbilitiesPlan;
    #uses plan PatronizingTonePlan;
    #uses plan PompousPosturePlan;
    #uses plan RefusingToAdmitMistakesArrogantPlan;
    #uses plan RefusingToListenArrogantPlan;
    #uses plan RollingEyesArrogantPlan;
    #uses plan ScoffingExpressionPlan;
    #uses plan SeekingRecognitionArrogantPlan;
    #uses plan SmirkArrogantPlan;
    #uses plan SpeakingLoudlyArrogantPlan;
    #uses plan UsingCondescendingLanguagePlan;
    #uses plan SetPlanContextArrogantPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
