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
public capability LongingAffectCapability extends Capability {
    #uses plan EyesClosedLongingPlan;
    #uses plan DeepBreathsLongingPlan;
    #uses plan SmilingLongingPlan;
    #uses plan StillnessLongingPlan;
    #uses plan ConfusionConversationPlan;
    #uses plan InattentivePlan;
    #uses plan IsolationLongingPlan;
    #uses plan LossOfAppetiteLongingPlan;
    #uses plan ConcentrateLongingPlan;
    #uses plan FrustrationLongingPlan;
    #uses plan DesperationPlan;
    #uses plan LackSenseOfTimePlan;
    #uses plan DifficultyFocusingPlan;
    #uses plan MakingBigChangesPlan;
    #uses plan SacrificingLongingPlan;
    #uses plan SetPlanContextLongingPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
