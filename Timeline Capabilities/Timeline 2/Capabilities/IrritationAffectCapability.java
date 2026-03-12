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
public capability IrritationAffectCapability extends Capability {
    #uses plan PurseLipsIrritationPlan;
    #uses plan SternLookHeadForwardPlan;
    #uses plan RubbingBackOfNeckPlan;
    #uses plan IntentivelyWatchingPlan;
    #uses plan FrownIrritationPlan;
    #uses plan CrossingArmsIrritationPlan;
    #uses plan SpeakingInChallengingTonePlan;
    #uses plan SmilingHardPlan;
    #uses plan AskingPointedQuestionsPlan;
    #uses plan ChangeSubjectPlan;
    #uses plan ForcingLaughPlan;
    #uses plan RaisingVoiceIrritationPlan;
    #uses plan InterruptingSelfPlan;
    #uses plan GoingSilentPlan;
    #uses plan ExhaleThroughNoseIrritationPlan;
    #uses plan InterruptingPlan;
    #uses plan RepeatMannerismPlan;
    #uses plan ClenchingTeethIrritationPlan;
    #uses plan DivertNegativityPlan;
    #uses plan WishingShutupPlan;
    #uses plan CloudedJudgementPlan;
    #uses plan JudgementalPlan;
    #uses plan ChallengeViewpointPlan;
    #uses plan SwearingPlan;
    #uses plan NegativeLanguagePlan;
    #uses plan SarcasmIrritationPlan;
    #uses plan InsultPlan;
    #uses plan SetPlanContextIrritationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
