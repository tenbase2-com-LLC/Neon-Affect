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
public capability BitternessAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextBitternessPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> AbnoxiousPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> ArgumentativePlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> BlameSomeoneElsePlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> ComplainingConstantlyPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> GivingAdvicePlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> HarshVoiceWordsPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> HoldingGrudgeBringingUpPastPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> InterruptingBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> KeepingSecretsPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> LashingOutPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> NoSmallTalkPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> NotMeaningStatementPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> OpinionatedPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> PlacingFaultPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> QuickToBlamePlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> SpeakingMatterOfFactPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.VERBAL> TakingOffenseEasilyPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> ASetJawPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> ArmsCrossedBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> FakeSmileBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> HeadForwardLookPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> RollingEyesBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> ShakingHeadBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> SneeringPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> SourLookPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> TenseMovementPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.NONVERBAL> UnableToRelaxBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> GetEvenPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> IsolationPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> JudgementalBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> MoodSwingsBitternessPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> NoResponsibilityPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> SensitiveToTouchPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> SicklyPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> UnforgivingPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> UngratefulPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> UnhelpfulPlan;
    #uses BehaviorPlan<AffectEnum.BITTERNESS, AffectEnum.ACTION> UnrustworthyPlan;

}

