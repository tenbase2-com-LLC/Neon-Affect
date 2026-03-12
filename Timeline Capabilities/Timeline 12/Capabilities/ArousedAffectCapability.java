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
public capability ArousedAffectCapability extends Capability {
    #uses plan AskingQuestionsArousedPlan;
    #uses plan ComplimentArousedPlan;
    #uses plan DanceSuggestivelyPlan;
    #uses plan DimLightsPlayMusicPlan;
    #uses plan ExpressingAttractionPlan;
    #uses plan EyeContactPlan;
    #uses plan EyesWideningArousedPlan;
    #uses plan FidgetingArousedPlan;
    #uses plan FlirtingTalkPlan;
    #uses plan FlushedFaceArousedPlan;
    #uses plan HeadTiltingBackPlan;
    #uses plan JokingArousedPlan;
    #uses plan MakingPleasureSoundPlan;
    #uses plan OpenPosturePlan;
    #uses plan PeformStrpteasePlan;
    #uses plan RapidBreathingArousedPlan;
    #uses plan RapidSpeakingArousedPlan;
    #uses plan SlowSensualSelfTouchPlan;
    #uses plan SpeakingToIncitePlan;
    #uses plan VoiceOptimisticPlan;
    #uses plan WinkArousedPlan;
    #uses plan SetPlanContextArousedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
