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
public capability FrustrationAffectCapability extends Capability {
    #uses plan PurseLipsFrustrationPlan;
    #uses plan RushedSpeechPlan;
    #uses plan RubBackOfNeckFrustrationPlan;
    #uses plan ShakeHeadFrustrationPlan;
    #uses plan StiffPostureFrustrationPlan;
    #uses plan SniffingFrustrationPlan;
    #uses plan SwearingFrustationPlan;
    #uses plan DeepBreathBeforeSpeakingPlan;
    #uses plan ThrowingHandsUpPlan;
    #uses plan InsultFrustrationPlan;
    #uses plan SighFrustrationPlan;
    #uses plan ArmsCrossedFrustrationPlan;
    #uses plan ClumsinessFrustrationPlan;
    #uses plan AskQuestionsFrustrationPlan;
    #uses plan LackOfEmotionFrustrationPlan;
    #uses plan YellingFrustrationPlan;
    #uses plan PleadingFrustrationPlan;
    #uses plan TemperTantrumPlan;
    #uses plan SetPlanContextFrustrationPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
