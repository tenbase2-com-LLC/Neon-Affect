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
public capability DisgustAffectCapability extends Capability {
    #uses plan CurledLipPlan;
    #uses plan WrinklingNosePlan;
    #uses plan FlinchingPlan;
    #uses plan SwallowingHardPlan;
    #uses plan EyesColdPlan;
    #uses plan RefusingToLookPlan;
    #uses plan ShakingHeadPlan;
    #uses plan RepeatSaidNoEmotionPlan;
    #uses plan JerkingAwayFromContactPlan;
    #uses plan DemandStopSpeakingPlan;
    #uses plan OfferingEvasiveAnswersPlan;
    #uses plan RubbingNosePlan;
    #uses plan SpeakingUnsteadyVoicePlan;
    #uses plan LosingTrackOnesWordsPlan;
    #uses plan CringePlan;
    #uses plan TroubleSwallowingPlan;
    #uses plan WishingSomewhereElsePlan;
    #uses plan MindReplayingAgonizingPlan;
    #uses plan UnableToConcentratePlan;
    #uses plan BecomingUnresponsivePlan;
    #uses plan SetPlanContextDisgustPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
