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
public capability SurprisedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSurprisedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> AskForRepetitionSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> ExpressingDisbeliiefSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> GaspSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> InabilityToSpeakSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> LaughterSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> ScreamSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> SwearingSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> VoicePirchRisingSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> VoiceTremorSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.VERBAL> WantingToBeAloneSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> BlinkingRapidlySurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> BreathingStoppedAbruptlySurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> DizzinessSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> DoubleTakeSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> EyesWideningSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> FlushedFaceSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> HeadTiltingToSideSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> MouthOpenSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> NoddingSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> SmileBuildingSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> StiffPostureSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.NONVERBAL> TearingUpSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> DisbeliefSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> DisorientatedSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> HeightenedAwarenessSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> ImprovedReactionTimeSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> InabilityToFocusSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> MindRacingSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> SeekingMoreInformationSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> ShareExperienceSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> StopMidTaskSurprisedPlan;
    #uses BehaviorPlan<AffectEnum.SURPRISED, AffectEnum.ACTION> TakingSeatSurprisedPlan;

}

