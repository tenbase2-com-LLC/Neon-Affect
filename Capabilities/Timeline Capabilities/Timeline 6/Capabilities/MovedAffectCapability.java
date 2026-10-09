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
public capability MovedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextMovedPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> ExpressingGratitudeMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> GratitudeMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> InarticulateMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> MoaningMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> SharingFeelingsMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> SincereThankYousMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> StrugglingToSpeakMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> ThoughtfulResponsesMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> TremblingVoiceMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.VERBAL> VoiceChokedWithTMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> BlushedFaceMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> CoverFaceHandsMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> EyesGlisteningPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> HiccupsPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> LipsPursedMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> MeaningfulEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> ShakingHeadMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> SmilingMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> SniffingPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.NONVERBAL> WipingTearsPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> AppreciativeMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> ContemplatingOnesPlaceMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> DesireToGetCloserMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> HyperFocusedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> InsensitivePlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> MoreWillingToHelpOthersMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> SenseOfConnectionMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> SenseOfReliefPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> TakingTimeForReflectionMovedPlan;
    #uses BehaviorPlan<AffectEnum.MOVED, AffectEnum.ACTION> TreasuringMomemrtMovedPlan;

}

