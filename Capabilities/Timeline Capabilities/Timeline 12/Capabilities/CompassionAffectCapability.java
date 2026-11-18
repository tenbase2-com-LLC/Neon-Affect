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
public capability CompassionAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextCompassionPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> AskingHowToHelpPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> GratitudeCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> OfferingEncouragementSupportCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> OfferingHopeCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> ProvidingSupportCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> SharingSecretsCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> SpeakingGentlyCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> SpeakingSoflyCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> SpeakingSupportiveWordsPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.VERBAL> ValidsatingFeelingsPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> CryingCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> EyeContactCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> FaceConcernedPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> FaceSoftCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> GentleCaressCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> HeadTiltingToSideCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> LeaningInCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> NoddingSlowlyCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> OpenBodyPostureCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.NONVERBAL> SmilingCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> BeingGenerousCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> ConsideringOthersPerspectivesCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> ListeningNoJudgementCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> OfferingHugPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> OfferingToBabysitPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> OfferingToHelpCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> OfferingToTeachSkillPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> ProvideListeningEarPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> ProvideUsefulInformationCompassionPlan;
    #uses BehaviorPlan<AffectEnum.COMPASSION, AffectEnum.ACTION> ShowingConcernCompassionPlan;

}

