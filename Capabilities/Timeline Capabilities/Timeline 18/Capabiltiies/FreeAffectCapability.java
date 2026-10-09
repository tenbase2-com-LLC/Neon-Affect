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
public capability FreeAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextFreePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> BeingDirectFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> EngagingPhilosophicalDiscussionsPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> ExpressingUnconventionalIdeasPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> ImprovisedSpeechPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> LaughingFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> SharingInformationFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> SharingWhimsicalThoughtsFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> SpeakingUninhibitedlyPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> UsingSpontaneousWordplayPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.VERBAL> VocalizingEmotionsOpenlyPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> DeepBreathsFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> EyeContactFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> FacialExpressionsFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> FluidMovementFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> HalfClosedEyesFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> HeadHeldHighFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> MakingCasualGesturesFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> OpenBodyLanguageFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> RelaxedPostureFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.NONVERBAL> SmilingFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> BreakingRoutinesPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> CelebratingIndividualityPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> CreativityFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> EmbracingSpontaneityFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> FollowingImpulsesPlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> LettingGoConcernsFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> MakingBigChangesFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> RejectingObligationsFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> SeekingNewOpportunitiesFreePlan;
    #uses BehaviorPlan<AffectEnum.FREE, AffectEnum.ACTION> TryNewThingsFreePlan;

}

