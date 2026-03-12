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
public capability DoubtAffectCapability extends Capability {
    #uses plan DelayingTacticsPlan;
    #uses plan ConversationFillersPlan;
    #uses plan DecliningSupportPlan;
    #uses plan TightSmilePlan;
    #uses plan HesitatingNodPlan;
    #uses plan ExcessiveSwallowingPlan;
    #uses plan ShruggingDoubtPlan;
    #uses plan AskingClarificationPlan;
    #uses plan ArguingDoubtPlan;
    #uses plan HoldingLongBreathPlan;
    #uses plan ArmsCrossedDoubtPlan;
    #uses plan WorryingPlan;
    #uses plan LookingAheadPlan;
    #uses plan RethinkingPastDecisionPlan;
    #uses plan DefensiveDoubtPlan;
    #uses plan FearmongeringDoubtPlan;
    #uses plan SetPlanContextDoubtPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
