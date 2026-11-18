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
public capability SexuallyExcitedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSexuallyExcitedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> AskQuestionsSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> ComplimentSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> ExpressingAttractionSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> FlirtingTalkSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> JokingSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> NaughtInsinuationsPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> PraisingOthersSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> SpeakingSoflySexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> VerbalForeplayPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.VERBAL> WhisperDramaticallySexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> BitingLipSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> CoyGlancePlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> EyesWideningSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> FlushedFaceSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> LickingLipsSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> OpenPosutreSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> RapidBreathingSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> SensualGazePlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> SmilingSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.NONVERBAL> StrongEyeContactSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> ClosingDistancePlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> DanceSuggestivelySexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> DimLightsPlayMusicSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> FantasizingSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> FocusingOnPartnerSexuallyExcitedPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> GentleCaressPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> PlanningSeductionPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> SensuousTouchPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> StimulatingSelfPlan;
    #uses BehaviorPlan<AffectEnum.SEXUALLY_EXCITED, AffectEnum.ACTION> TeasingDisrobingPlan;

}

