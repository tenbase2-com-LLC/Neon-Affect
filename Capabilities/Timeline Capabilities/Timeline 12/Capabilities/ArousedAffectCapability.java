/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextArousedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> AskingQuestionsArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> ComplimentArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> FlirtingTalkPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> JokingArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> MakingPleasureSoundPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> NaughtInsinuationsArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> RapidSpeakingArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> SpeakingToIncitePlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> VoiceOptimisticPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.VERBAL> WhisperDramaticallyArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> ExpressingAttractionPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> EyeContactPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> EyesWideningArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> FidgetingArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> FlushedFaceArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> HeadTiltingBackPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> OpenPosturePlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> RapidBreathingArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> SensualGazeArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.NONVERBAL> WinkArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> ClosingDistanceArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> DanceSuggestivelyPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> DimLightsPlayMusicPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> EasilyDistractedArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> FantasizingArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> GentleCaressArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> PeformStrpteasePlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> PlanningSeductionArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> PlayfulnessArousedPlan;
    #uses BehaviorPlan<AffectEnum.AROUSED, AffectEnum.ACTION> SlowSensualSelfTouchPlan;

}

