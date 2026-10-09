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
public capability HysteriaAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextHysteriaPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> CryingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> ElevatedPitchHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> InarticulateHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> PleadingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> QuickChoppySentencesHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> RepeatingWordsHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> ScreamingYellingPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> UncontrollableSobbingPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> UsingPanicWordsHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.VERBAL> VerballDenyingBadNewsPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> CoveringFaceHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> EyesWideNotBlinkingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> HeavyBreathingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> HoldingOneselfTightlyHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> HyperventilatingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> ShakingHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> TremblingBodyHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> UncontrollableTearsHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> VehementHeadShakingPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.NONVERBAL> WildGesturesHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> CarelessnessPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> DenialHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> DisorientedHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> IgnoringEventsPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> InabilityListenToReasonPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> MentalBreakdownPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> NeedControlHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> PoorCopingSkillsHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> SnappingUnderPressureHysteriaPlan;
    #uses BehaviorPlan<AffectEnum.HYSTERIA, AffectEnum.ACTION> ThinkingIrrationallyHysteriaPlan;

}

