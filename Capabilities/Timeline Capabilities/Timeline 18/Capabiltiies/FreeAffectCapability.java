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
public capability FreeAffectCapability extends Capability {
    #uses plan BreakingRoutinesPlan;
    #uses plan CelebratingIndividualityPlan;
    #uses plan CreativityFreePlan;
    #uses plan DeepBreathsFreePlan;
    #uses plan EmbracingSpontaneityFreePlan;
    #uses plan EngagingPhilosophicalDiscussionsPlan;
    #uses plan ExpressingUnconventionalIdeasPlan;
    #uses plan EyeContactFreePlan;
    #uses plan FacialExpressionsFreePlan;
    #uses plan FluidMovementFreePlan;
    #uses plan FollowingImpulsesPlan;
    #uses plan ImprovisedSpeechPlan;
    #uses plan LaughingFreePlan;
    #uses plan OpenBodyLanguageFreePlan;
    #uses plan RejectingObligationsFreePlan;
    #uses plan SeekingNewOpportunitiesFreePlan;
    #uses plan SharingInformationFreePlan;
    #uses plan SmilingFreePlan;
    #uses plan SpeakingUninhibitedlyPlan;
    #uses plan UsingSpontaneousWordplayPlan;
    #uses plan VocalizingEmotionsOpenlyPlan;
    #uses plan SetPlanContextFreePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
