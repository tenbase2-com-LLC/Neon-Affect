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
public capability RemorseAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextRemorsePlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> ApologizingRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> AskingForAdviceRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> AskingTalkPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> BeggingForForgivenessPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> EmpathyRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> MentallyBeratingOneselfPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> OfferingPromisePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> PleadingTonePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> QuickResponsesPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.VERBAL> TellingTruthPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> BadPostureRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> CoverFaceHandsRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> FrailtyPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> HandCoveringMouthRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> HeadDownEyesLookingUpPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> HioldStomachPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> RunnyNosePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> SilenceRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> StaringAtFloorPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.NONVERBAL> TearingUpRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> AvoidingPersonRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> DesireToFaceConsequencesPlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> DeterminationRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> LossOfAppetiteRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> ObediencePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> OverlyCriticalSelfRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> PeaceOfferingRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> SeekingComfortRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> SetThingsRightRemorsePlan;
    #uses BehaviorPlan<AffectEnum.REMORSE, AffectEnum.ACTION> TryHarderRemorsePlan;

}

