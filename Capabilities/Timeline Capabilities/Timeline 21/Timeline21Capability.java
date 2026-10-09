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
public capability Timeline21Capability extends Capability {
    #has capability BetrayedAffectCapability betrayedCap;
    #has capability HeartbrokenAffectCapability heartbrokenCap;
    #has capability DisillusionedAffectCapability disillusionedCap;
    #has capability UnappreciatedAffectCapability unappreciatedCap;
    #has capability WistfulAffectCapability wistfulCap;
    #has capability GuardedAffectCapability guardedCap;
    #has capability ReassuredAffectCapability reassuredCap;
    #has capability BelongingAffectCapability belongingCap;
    #has capability TendernessAffectCapability tendernessCap;
    #has capability CherishedAffectCapability cherishedCap;
    #has capability ElevationAffectCapability elevationCap;
    #has capability OnenessAffectCapability onenessCap;
    #handles external event AffectEvent;
    #handles external event SetPlanContextEvent;
    #sends event ContextEvent ce;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}

