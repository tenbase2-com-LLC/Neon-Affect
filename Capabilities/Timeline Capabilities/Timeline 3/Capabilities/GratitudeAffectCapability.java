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
public capability GratitudeAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextGratitudePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> AcknowledgingEffortGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> ExpressingGratitudeGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> GivingComplementsPlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> GivingCreditGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> HumbleAcknowledgementsGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> KindWordChoiceGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> PraisingOthersGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> SincereThankYousGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> TremblingVoiceGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.VERBAL> WarmToneVoiceGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> BowHeadGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> ClappingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> EyesGlisteningGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> HuggingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> NoddingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> PlacingHandOverHeartGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> SlowNodGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> SmilingGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> SteadyEyeContactPlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.NONVERBAL> TearingUpPlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> AppreciativeGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> BeingGenerousGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> EmpathyGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> KindnessGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> MoodElevationGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> OfferingToHelpGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> PositiveFocusShiftGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> SharingResourcesGratitudePlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> ShowingAffectionPlan;
    #uses BehaviorPlan<AffectEnum.GRATITUDE, AffectEnum.ACTION> ValueRecognitionGratitudePlan;

}

