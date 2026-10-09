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
public capability InsecureAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextInsecurePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> AgreeingQuicklyInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> ApologizingInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> AskPermissionInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> ExpressingDoubtPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> HesitationSpeechInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> SelfDeprecatingRemarksPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> SpeakQuietVoiceInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> StutteringInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> TrailingOffMidSentencePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.VERBAL> UsingFillerWordsInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> ArmsCrossedInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> AvoidingEyeContactInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> BadPostureInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> FidgetingInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> LookAwayInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> NervousSmileInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> OverthinkingDecisionsPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> RubBackOfNeckInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> SmoothingClothesInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.NONVERBAL> WringingHandsInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> AvoidingChallengesInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> CompareOneselfToOthersPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> DoubtingAbilitiesPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> ExcessiveWorryingPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> OverPreparingInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> ProcrastinationInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> RuminatingPastFailuresInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> SecondGuessingInsecurePlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> SeekingApprovalPlan;
    #uses BehaviorPlan<AffectEnum.INSECURE, AffectEnum.ACTION> SeekingReassuranceInsecurePlan;

}

