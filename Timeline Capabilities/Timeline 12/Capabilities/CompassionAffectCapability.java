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
public capability CompassionAffectCapability extends Capability {
    #uses plan AskingHowToHelpPlan;
    #uses plan CryingCompassionPlan;
    #uses plan EyeContactCompassionPlan;
    #uses plan FaceConcernedPlan;
    #uses plan GratitudeCompassionPlan;
    #uses plan HeadTiltingToSideCompassionPlan;
    #uses plan OfferingEncouragementSupportCompassionPlan;
    #uses plan OfferingHugPlan;
    #uses plan OfferingToBabysitPlan;
    #uses plan OfferingToHelpCompassionPlan;
    #uses plan OfferingToTeachSkillPlan;
    #uses plan OpenBodyPostureCompassionPlan;
    #uses plan ProvideListeningEarPlan;
    #uses plan SharingSecretsCompassionPlan;
    #uses plan SmilingCompassionPlan;
    #uses plan SpeakingSoflyCompassionPlan;
    #uses plan SpeakingSupportiveWordsPlan;
    #uses plan ValidsatingFeelingsPlan;
    #uses plan SetPlanContextCompassionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
