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
public capability AdorationAffectCapability extends Capability {
    #uses plan LipsPartingAdorationPlan;
    #uses plan SlackExpressionPlan;
    #uses plan ImitationBodyLanguagePlan;
    #uses plan TouchingMouthPlan;
    #uses plan SteadyEyeContactAdorationPlan;
    #uses plan LeanInAdorationPlan;
    #uses plan FlushedFacedPlan;
    #uses plan SighAdorationPlan;
    #uses plan ComplimentPlan;
    #uses plan RepetitiiveSpeechPlan;
    #uses plan BeingAttentivePlan;
    #uses plan LosingAwarenessPlan;
    #uses plan ReducedBlinkingPlan;
    #uses plan CloseEyesAdorationPlan;
    #uses plan SoftTonePlan;
    #uses plan AcuteListeningPlan;
    #uses plan FixatingThoughtsSubjectPlan;
    #uses plan IgnoringDistractionsAdorationPlan;
    #uses plan PossessivenessPlan;
    #uses plan SetPlanContextAdorationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
