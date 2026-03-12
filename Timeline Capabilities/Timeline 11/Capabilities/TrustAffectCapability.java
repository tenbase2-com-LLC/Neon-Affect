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
public capability TrustAffectCapability extends Capability {
    #uses plan ApologizingTrustPlan;
    #uses plan AppreciativeTrustPlan;
    #uses plan AskingForAdviceTrustPlan;
    #uses plan ConfidentVoiceTrustPlan;
    #uses plan EmpathyTrustPlan;
    #uses plan ForgvvenessTrustPlan;
    #uses plan GivingComplementsTrustPlan;
    #uses plan ImitationBodyLanguageTrustPlan;
    #uses plan LeaningInTrustPlan;
    #uses plan MakePlansTrustPlan;
    #uses plan NoddingWhileListeningTrustPlan;
    #uses plan OfferingToHelpTrustPlan;
    #uses plan OpenBodyPostureTrustPlan;
    #uses plan RelaxedSmileTrustPlan;
    #uses plan SharingSecretsTrustPlan;
    #uses plan StreadyEyeContactTrustPlan;
    #uses plan WarmToneVoiceTrustPlan;
    #uses plan SetPlanContextTrustPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
