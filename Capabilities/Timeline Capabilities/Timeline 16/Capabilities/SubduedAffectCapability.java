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
public capability SubduedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextSubduedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> AvoidingEmotionalLanguagePlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> CuttingConversationShortSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> GivingNeutralResponsesPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> LowVoiceSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> SlowResponsesPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> SpeakingFlatVoiceSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> UsingMeasuredSpeechPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> UsingMinimalWordsPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> VoiceDecreasingVolumePlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.VERBAL> VoiceLackingEnthusiasmPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> AvoidingLargeGesturesPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> DecreasingPhysicalEnergyPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> LoweredEyeContactSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> MaintainDistantGazePlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> MaintainNeutralExpressionPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> RelaxedPostureSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> SighSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> SlowNodSubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> SlowingBodyMovementsPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.NONVERBAL> SmilingPolitelySubduedPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> AvoidingConflictPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> DelayingDecisionsPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> LimitingEmotionalReactionsPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> MaintainingLowProfilePlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> ObservingQuietlyPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> PreferringFamiliarityPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> ProcessingThoughtsInternallyPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> ReducingSocialEngagementPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> ResistingExcitementPlan;
    #uses BehaviorPlan<AffectEnum.SUBDUED, AffectEnum.ACTION> WithdrawingFromActivitiesPlan;

}

