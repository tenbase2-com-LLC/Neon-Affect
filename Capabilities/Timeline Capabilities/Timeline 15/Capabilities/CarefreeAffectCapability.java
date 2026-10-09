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
public capability CarefreeAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCarefreePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> DismissingWorriesPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> EncouragingSpontaneityPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> ExpressingOptimismPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> JokingCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> LaughingFrequentlyPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> SharingWhimsicalThoughtsCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> SpeakingLightlyPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> UnhurriedSpeechCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> UsingPlayfulLanguagePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.VERBAL> UsingSpontaneousWordplayCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> FacialExpressionsCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> FluidMovementCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> GigglingCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> HalfClosedEyesCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> MakingCasualGesturesPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> OpenPostureCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> RelaxedPostureCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> ShakingHeadWhileSmilingCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> SmilingCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.NONVERBAL> UnhurriedMovementCarefreePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> AvoidingOverplanningPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> BeingFlexiblePlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> ChoosingOptimismPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> EmbracingSpontaneityPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> EmbracingUncertaintyPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> FocusingOnMomentPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> LettingGoConcernsPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> MinimizingStressorsPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> SeekingEnjoyableActivitiesPlan;
    #uses BehaviorPlan<AffectEnum.CAREFREE, AffectEnum.ACTION> TakingThingsLightlyPlan;

}

