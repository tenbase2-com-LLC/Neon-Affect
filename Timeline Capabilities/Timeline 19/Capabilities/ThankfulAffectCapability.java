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
public capability ThankfulAffectCapability extends Capability {
    #uses plan AffirmativeWordsThankfulPlan;
    #uses plan AppreciativeThankfulPlan;
    #uses plan ChinLiftingThankfulPlan;
    #uses plan ComplimentThankfulPlan;
    #uses plan EmpathyThankfulPlan;
    #uses plan ExpressingGratitudeThankfulPlan;
    #uses plan EyeContactThankfulPlan;
    #uses plan FacialExpressionsThankfulPlan;
    #uses plan KindnessThankfulPlan;
    #uses plan KindWordChoicePlan;
    #uses plan MoodElevationPlan;
    #uses plan NoddingThankfulPlan;
    #uses plan OptimisticThankfulPlan;
    #uses plan PositiveAffirmationThankfulPlan;
    #uses plan PositiveFocusShiftPlan;
    #uses plan PraisingOthersThankfulPlan;
    #uses plan RelaxedPostureThankfulPlan;
    #uses plan SharingWhimsicalThoughtsThankfulPlan;
    #uses plan SighThankfulPlan;
    #uses plan SincereThankYousPlan;
    #uses plan SlowEvenBreathsThankfulPlan;
    #uses plan SmilingThankfulPlan;
    #uses plan ValueRecognitionPlan;
    #uses plan WarmToneVoiceThankfulPlan;
    #uses plan SetPlanContextThankfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
