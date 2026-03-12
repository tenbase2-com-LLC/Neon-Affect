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
public capability AnticipationAffectCapability extends Capability {
    #uses plan UnableThinkTalkAnythingElsePlan;
    #uses plan ClosingEyesSighingPlan;
    #uses plan LeaningInPlan;
    #uses plan BeggingForDetailsPlan;
    #uses plan SensitiviityToTouchPlan;
    #uses plan LackOfConcentrationPlan;
    #uses plan ImagineWhatWillHappenPlan;
    #uses plan BecomingSelfCriticalPlan;
    #uses plan FrustrationImpatiencePlan;
    #uses plan IrritabilityAnticipationPlan;
    #uses plan NeglectingEverythingElsePlan;
    #uses plan OverthinkingPlan;
    #uses plan SetPlanContextAnticipationPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
