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
public capability EnvyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextEnvyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> ArguingEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> BelittlingEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> ComplainEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> GossipingEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> MutteringEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> NegativeComparisonsEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> OneUpEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> PoutingEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> RudenessPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.VERBAL> SarcasmEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> CrossingArmsEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> FakeSmileEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> HandsOverClothesPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> LickingLipsEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> ReddeningFacePlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> SquintingPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> StaringEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> SullenLookEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> SwallowingQuicklyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.NONVERBAL> TakingStepForwardPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> DesireAffectionPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> DissatisfiiedPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> EntitlementPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> FrustrationEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> IrrationalThinkingPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> MakingDemandsPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> SelfLoathingPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> UnableToCommitPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> UnkindThoughtsEnvyPlan;
    #uses BehaviorPlan<AffectEnum.ENVY, AffectEnum.ACTION> UpsetPlan;

}

