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
public capability SelfSatisfiedAffectCapability extends Capability {
    #uses plan AccomplishmentMentionPlan;
    #uses plan BraggingSelfSatisfiedPlan;
    #uses plan CompetenceReinforcementPlan;
    #uses plan ConfidenceBoostSelfSatisfiedPlan;
    #uses plan ExpressingSatisfactionPlan;
    #uses plan NoddingSelfSatisfiedPlan;
    #uses plan PersonalStandardsMeetingPlan;
    #uses plan PersonalValidationPlan;
    #uses plan PositiveAffirmationSelfSatisifiedPlan;
    #uses plan PostureImprovementPlan;
    #uses plan ReminiscingPastSelfSatisfiedPlan;
    #uses plan SelfAffirmationPlan;
    #uses plan SelfAssuredCommentsPlan;
    #uses plan SelfCongratulationPlan;
    #uses plan SelfPraisePlan;
    #uses plan SighSelfSatisfiedPlan;
    #uses plan SmileSelfSatisfiedPlan;
    #uses plan SmirkSelfSatisfiedPlan;
    #uses plan SpeakSoflySelfSatisfiedPlan;
    #uses plan SquintSelfSatisfiedPlan;
    #uses plan SetPlanContextSelfSatisfiedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
