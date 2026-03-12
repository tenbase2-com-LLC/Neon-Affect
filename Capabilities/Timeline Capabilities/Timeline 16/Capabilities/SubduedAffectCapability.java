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
public capability SubduedAffectCapability extends Capability {
    #uses plan AvoidingConflictPlan;
    #uses plan AvoidingEmotionalLanguagePlan;
    #uses plan AvoidingLargeGesturesPlan;
    #uses plan CuttingConversationShortSubduedPlan;
    #uses plan DelayingDecisionsPlan;
    #uses plan DecreasingPhysicalEnergyPlan;
    #uses plan GivingNeutralResponsesPlan;
    #uses plan LimitingEmotionalReactionsPlan;
    #uses plan LoweredEyeContactSubduedPlan;
    #uses plan LowVoiceSubduedPlan;
    #uses plan MaintainDistantGazePlan;
    #uses plan MaintainingLowProfilePlan;
    #uses plan MaintainNeutralExpressionPlan;
    #uses plan ObservingQuietlyPlan;
    #uses plan PreferringFamiliarityPlan;
    #uses plan ProcessingThoughtsInternallyPlan;
    #uses plan ReducingSocialEngagementPlan;
    #uses plan RelaxedPostureSubduedPlan;
    #uses plan ResistingExcitementPlan;
    #uses plan SlowingBodyMovementsPlan;
    #uses plan SlowResponsesPlan;
    #uses plan SpeakingFlatVoiceSubduedPlan;
    #uses plan UsingMeasuredSpeechPlan;
    #uses plan UsingMinimalWordsPlan;
    #uses plan VoiceDecreasingVolumePlan;
    #uses plan VoiceLackingEnthusiasmPlan;
    #uses plan WithdrawingFromActivitiesPlan;
    #uses plan SetPlanContextSubduedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
