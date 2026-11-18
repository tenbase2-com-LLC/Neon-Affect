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
public capability UnappreciatedAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextUnappreciatedPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> AccomplishmentMentionUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> ComplainUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> ExpressingDisappointmentUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> HoldingGrudgeBringingUpPastUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> PassiveAggressiveCommentsDiscontentUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> PoutingUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> SarcasmUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> SeekingReassuranceUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> SighUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.VERBAL> SpeakingLessUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> ArmsCrossedUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> DeepExhaleUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> DropShouldersUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> ExhaleThroughNoseUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> FakeSmileUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> LipsPursedUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> LookAwayUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> MassagingTemplesUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> RollingEyesUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.NONVERBAL> SourLookUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> DwellingOnNegativeUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> LossOfMotivationUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> LowerStandardsUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> MoodyUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> NotGivingInKindnessUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> RuminationOverGrievancesUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> SeekingApprovalUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> SeekingRecognitionUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> WantingToBeAloneUnappreciatedPlan;
    #uses BehaviorPlan<AffectEnum.UNAPPRECIATED, AffectEnum.ACTION> WithdrawalFromOthersUnappreciatedPlan;

}

