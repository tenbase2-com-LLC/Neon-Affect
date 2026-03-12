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
public capability ShyAffectCapability extends Capability {
    #uses plan ApologizingShyPlan;
    #uses plan ArmsCrossedShyPlan;
    #uses plan AvoidingAttentionPlan;
    #uses plan AvoidingChallengesShyPlan;
    #uses plan AvoidingConversationsPlan;
    #uses plan AvoidingEyeContactShyPlan;
    #uses plan BadPostureShyPlan;
    #uses plan BeingIndecisivePlan;
    #uses plan BlinkingShyPlan;
    #uses plan DeflectingQuestionsShyPlan;
    #uses plan DoubtingAbilitiesShyPlan;
    #uses plan DwellingOnEmbarrassmentPlan;
    #uses plan FearingRejectionPlan;
    #uses plan HesitateAskForHelpPlan;
    #uses plan HesitationSpeechShyPlan;
    #uses plan LookDownShyPlan;
    #uses plan MumblingShyPlan;
    #uses plan NervousSmileShyPlan;
    #uses plan OverthinkingShyPlan;
    #uses plan PreferenceAloneShyPlan;
    #uses plan ShortResponsesShyPlan;
    #uses plan SpeakingWithUncertaintyPlan;
    #uses plan SpeakSoftlyShyPlan;
    #uses plan StutteringShyPlan;
    #uses plan SetPlanContextShyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
