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
public capability ActivatedAffectCapability extends Capability {
    #uses plan AnimatedDiscussionPlan;
    #uses plan AskingQuestionsActivatedPlan;
    #uses plan BrainstormingIdeasPlan;
    #uses plan ChangingTopicActivatedPlan;
    #uses plan DetailedExplanationsActivatedPlan;
    #uses plan EyesWideOpenActivatedPlan;
    #uses plan FidgetingActivatedPlan;
    #uses plan ImmersingSelfInProjectsPlan;
    #uses plan InterruptingOthersActivatedPlan;
    #uses plan MaintainEyeContactActivatedPlan;
    #uses plan NoddingActivatedPlan;
    #uses plan RapidProblemSolvingPlan;
    #uses plan SeekingNewStimuliPlan;
    #uses plan SharingIdeasActivatedPlan;
    #uses plan ShiftWeiightActivatedPlan;
    #uses plan SpeakingQuicklyLouderActivatedPlan;
    #uses plan TakingOnMultipleProjectsPlan;
    #uses plan VerbalizingExcitementPlan;
    #uses plan SetPlanContextActivatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
