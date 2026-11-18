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
public capability DisillusionedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextDisillusionedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> ExpressingDisappointmentDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> LessTalkativeDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> LossForWordsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> PessimisticStatementsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> PointingOutShortComingsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> SarcasmDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> SighDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> SpeakingFlatVoiceDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> VoicingCriticismDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.VERBAL> WhateverResponseDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> BlankFeaturesDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> DropShouldersDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> DullEyesDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> ExhaleThroughNoseDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> FaceGoingSlackDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> LipsPursedDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> LongExhaleDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> LookAwayDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> RollingEyesDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.NONVERBAL> ShakingHeadDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> ContemplatingImprovementsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> DisconnectingFromOthersDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> DisengagingFromGoalsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> DisillusionedDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> JudgementalDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> LossOfInterestDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> LossOfMotivationDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> MakingBigChangesDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> ReplayingPastLetDownsDisillusionedPlan;
    #uses BehaviorPlan<AffectEnum.DISILLUSIONED, AffectEnum.ACTION> SeekingAlternativeOptionsDisillusionedPlan;

}

