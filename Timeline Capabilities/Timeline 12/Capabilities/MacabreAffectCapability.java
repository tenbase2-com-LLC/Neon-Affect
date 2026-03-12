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
public capability MacabreAffectCapability extends Capability {
    #uses plan DiscussingDisturbingTopicsPlan;
    #uses plan DsitancingOneselfMacabrePlan;
    #uses plan EyeContactDroppingMacabrePlan;
    #uses plan HeadTiltingToSideMacabrePlan;
    #uses plan IgnoringMacabrePlan;
    #uses plan IsolationMacabrePlan;
    #uses plan JokingMacabrePlan;
    #uses plan LaughingSuddenlyDarkPlan;
    #uses plan LongPauseBeforeRespondingMacabrePlan;
    #uses plan MovingSlowlyMacabrePlan;
    #uses plan SeekingDisturbingKnowledgePlan;
    #uses plan SpeakingCrypticallyPlan;
    #uses plan SpeakingFlatVoiceMacabrePlan;
    #uses plan SpeakingMatterOfFactMacabrePlan;
    #uses plan SquintingMacabrePlan;
    #uses plan StandingStillMacabrePlan;
    #uses plan StaringMacabrePlan;
    #uses plan WhisperDramaticallyPlan;
    #uses plan SetPlanContextMacabrePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
