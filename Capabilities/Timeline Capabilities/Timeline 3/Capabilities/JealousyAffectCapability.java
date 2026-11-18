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
public capability JealousyAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextJealousyPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> CriticizeJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> GloatingPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> MutteringPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> OneUpPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> PassiveAggressiveCommentsJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> RudenessJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> SarcasmJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> ShoutingInsultsPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> SwearingJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.VERBAL> UglyLaughterPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> ClenchTeethPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> CrossingArmsJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> FasterBreathsPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> FlushedFaceJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> PursingLipsPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> QuickMovementsPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> SchemingAgainstRivalPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> SelfDoubtPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> SquintingJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.NONVERBAL> SullenLookPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> ComparingOthersToRivalPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> DishonestyWithSelfPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> FocusingOnNegativePlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> MonitoringOthersJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> PickFightJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> PossessivenessJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> RashDecisionMakingPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> RiskTakingJealousyPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> ShowingOffPlan;
    #uses BehaviorPlan<AffectEnum.JEALOUSY, AffectEnum.ACTION> UnkindThoughtsJealousyPlan;

}

