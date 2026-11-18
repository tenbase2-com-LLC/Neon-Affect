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
public capability ThankfulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextThankfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> AffirmativeWordsThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> ComplimentThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> ExpressingGratitudeThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> KindWordChoicePlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> PositiveAffirmationThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> PraisingOthersThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> SharingWhimsicalThoughtsThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> SighThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> SincereThankYousPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.VERBAL> WarmToneVoiceThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> BowHeadThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> ChinLiftingThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> EyeContactThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> FacialExpressionsThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> HuggingThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> NoddingThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> PlacingHandOverHeartThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> RelaxedPostureThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> SlowEvenBreathsThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.NONVERBAL> SmilingThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> AppreciativeThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> ContentmentThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> EmpathyThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> GenerosityThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> HelpfulnessThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> KindnessThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> MoodElevationPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> OptimisticThankfulPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> PositiveFocusShiftPlan;
    #uses BehaviorPlan<AffectEnum.THANKFUL, AffectEnum.ACTION> ValueRecognitionPlan;

}

