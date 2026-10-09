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
public capability RestlessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextRestlessPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> ChangingTopicRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> ComplainRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> GetThingsGoingRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> InterruptingRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> MutteringRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> SetTimeLimitRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> ShortResponsesRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> SighRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> SpeakingQuicklyRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.VERBAL> TalkToSelfRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> CheckWatchRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> DeepExhaleRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> FidgetingRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> MassagingTemplesRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> QuickMovementsRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> RestlessStanceRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> RestlessnessRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> RubBackOfNeckRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> ShiftWeightRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.NONVERBAL> TappingFootRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> BecomingBusyRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> CalculatingTimeRemainingRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> DifficultySittingStillRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> EasilyDistractedRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> ImpatienceRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> PacingRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> QuickToActionRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> SeekingNewStimuliRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> SeekingOutOthersRestlessPlan;
    #uses BehaviorPlan<AffectEnum.RESTLESS, AffectEnum.ACTION> StrayingAttentionRestlessPlan;

}

