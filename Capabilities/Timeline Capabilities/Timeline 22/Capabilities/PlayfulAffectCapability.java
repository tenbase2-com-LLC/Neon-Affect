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
public capability PlayfulAffectCapability extends Capability {
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #uses plan SetPlanContextPlayfulPlan;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> EncouragingSpontaneityPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> FlirtingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> JokingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> PlanningFutureActivitiesPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> SharingWhimsicalThoughtsPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> SpeakingLightlyPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> TeasingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> TellingJokesPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> UsingPlayfulLanguagePlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.VERBAL> UsingSpontaneousWordplayPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> EyesDanceSparkleShinePlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> FluidMovementPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> GigglingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> GrinPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> MakingCasualGesturesPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> QuickMovementsNoHesitationsPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> RaiseEyebrowsPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> ShakingHeadWhileSmilingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> SmirkPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.NONVERBAL> WinkPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> BenignRiskTakingPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> BreakingRoutinesPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> CompetitivenessPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> CreativityPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> EmbracingSpontaneityPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> EnergenicActivityPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> PlayfulnessPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> SeekingEnjoyableActivitiesPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> SpreadJoyPlayfulPlan;
    #uses BehaviorPlan<AffectEnum.PLAYFUL, AffectEnum.ACTION> TakingThingsLightlyPlayfulPlan;

}

