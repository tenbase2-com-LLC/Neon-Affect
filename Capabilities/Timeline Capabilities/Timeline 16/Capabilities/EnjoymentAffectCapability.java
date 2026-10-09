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
public capability EnjoymentAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEnjoymentPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> ComplimentEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> EagerConversationPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> EnthusiasticExclamationPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> ExpressingGratitudeEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> HummingWhistlingSingingEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> LaughingEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> PositiveAffirmationPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> SharingExperienceEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> TellingJokesEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.VERBAL> VoicePleasantTonePlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> EyesSatisifiedPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> FacialExpressionsEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> GesturesEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> GigglingEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> NoddingEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> OpenPostureEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> RelaxedPostureEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> SighEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> SmilingEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.NONVERBAL> UnhurriedMovementEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> CaptureMemoryPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> CreativityPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> EmbraceNewExperiencePlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> EngagedParticiapationPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> LivingForTheMomentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> OptimisticPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> PlayfulnessEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> SeekingEnjoyableActivitiesEnjoymentPlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> SeekingPleasurePlan;
    #uses BehaviorPlan<AffectEnum.ENJOYMENT, AffectEnum.ACTION> SenseOfContentmentEnjoymentPlan;

}

