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
public capability Timeline4Capability extends Capability {
    #has capability HumiliationAffectCapability hac;
    #has capability DenialAffectCapability dac;
    #has capability HysteriaAffectCapability hac1;
    #has capability DreadAffectCapability dac2;
    #has capability WorryAffectCapability wac;
    #has capability VulnerabilityAffectCapability vac;
    #has capability ReliefAffectCapability rac;
    #has capability ValuedAffectCapability vac2;
    #has capability PrideAffectCapability pac;
    #has capability ConfidenceAffectCapability cac;
    #has capability FearlessnessAffectCapability fac;
    #has capability SmugnessAffectCapability sac;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
