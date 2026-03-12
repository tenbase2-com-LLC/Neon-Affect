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
public capability InsecureAffectCapability extends Capability {
    #uses plan ApologizingInsecurePlan;
    #uses plan ArmsCrossedInsecurePlan;
    #uses plan AskPermissionInsecurePlan;
    #uses plan AvoidingChallengesInsecurePlan;
    #uses plan AvoidingEyeContactInsecurePlan;
    #uses plan BadPostureInsecurePlan;
    #uses plan CompareOneselfToOthersPlan;
    #uses plan DoubtingAbilitiesPlan;
    #uses plan ExcessiveWorryingPlan;
    #uses plan ExpressingDoubtPlan;
    #uses plan FidgetingInsecurePlan;
    #uses plan HesitationSpeechInsecurePlan;
    #uses plan LookAwayInsecurePlan;
    #uses plan OverthinkingDecisionsPlan;
    #uses plan ProcrastinationInsecurePlan;
    #uses plan RubBackOfNeckInsecurePlan;
    #uses plan RuminatingPastFailuresInsecurePlan;
    #uses plan SeekingApprovalPlan;
    #uses plan SelfDeprecatingRemarksPlan;
    #uses plan SpeakQuietVoiceInsecurePlan;
    #uses plan StutteringInsecurePlan;
    #uses plan TrailingOffMidSentencePlan;
    #uses plan UsingFillerWordsInsecurePlan;
    #uses plan SetPlanContextInsecurePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
