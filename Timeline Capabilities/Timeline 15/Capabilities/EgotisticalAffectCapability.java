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
public capability EgotisticalAffectCapability extends Capability {
    #uses plan BeingControllingPlan;
    #uses plan BoastingPlan;
    #uses plan BraggingEgotisticalPlan;
    #uses plan CorrectingOthersEgotisticalPlan;
    #uses plan DismissingOthersOpinionsPlan;
    #uses plan DominatingConversationEgotisticalPlan;
    #uses plan ExaggeratedMovementsEgotisticalPlan;
    #uses plan HavingGrandioseFantasiesPlan;
    #uses plan IgnoringEgotisticalPlan;
    #uses plan ImpatienceEgotisticalPlan;
    #uses plan InterruptingOthersEgotisticalPlan;
    #uses plan InvadingPersonalSpaceEgotisticalPlan;
    #uses plan LackingEmpathyPlan;
    #uses plan LookingDisinterestedPlan;
    #uses plan OverestimatingCapabilitiesPlan;
    #uses plan OverusingIPlan;
    #uses plan RefusingToAdmitMistakesPlan;
    #uses plan RollingEyesEgotisticalPlan;
    #uses plan SighEgotisticalPlan;
    #uses plan SmilingCondescendentlyPlan;
    #uses plan SmirkEgotistiscalPlan;
    #uses plan StaringDownEgotisticalPlan;
    #uses plan TalkingOverOthersEgotisticalPlan;
    #uses plan UnderestimatingOthersPlan;
    #uses plan UsingSuperlativesPlan;
    #uses plan SetPlanContextEgotisticalPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
