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
public capability BetrayedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBetrayedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> BlameBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> CryingBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> DemandExplanationBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> HoldingGrudgeBringingUpPastBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> NotForgivingBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> SarcasmBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> SpeakingFlatVoiceBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> VoiceAccusatoryToneBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> WithdrawFromConversationBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.VERBAL> YellingBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> ArmsCrossedBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> ClenchedJawBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> IncreasePersonalDistanceBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> LookAwayBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> PointingFingerAccusatoryBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> ShakingHeadBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> StaringDownBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> TearingUpBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> ThrowingHandsUpBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.NONVERBAL> TremblingLipsBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> CommittmentIssuesBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> GetEvenBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> IsolationBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> MindReplayingAgonizingBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> PickFightBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> RelivingWrongfulEventsBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> RuminationOverGrievancesBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> SeekingComfortBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> UnforgivingBetrayedPlan;
    #uses BehaviorPlan<AffectEnum.BETRAYED, AffectEnum.ACTION> WithdrawingFromOthersBetrayedPlan;

}

