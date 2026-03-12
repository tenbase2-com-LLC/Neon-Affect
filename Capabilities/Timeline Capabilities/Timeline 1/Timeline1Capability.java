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
public capability Timeline1Capability extends Capability {
    #has capability AnticipationAffectCapability aac;
    #has capability RageAffectCapability rac;
    #has capability VengefulAffectCapability vac;
    #has capability DisgustAffectCapability dac;
    #has capability AngryAffectCapability aac1;
    #has capability SadAffectCapability sac1;
    #has capability MoodyAffectCapability mac;
    #has capability PleasedAffectCapability pac;
    #has capability HappyAffectCapability hac;
    #has capability ElationAffectCapability eac;
    #has capability EuphoriaAffectCapability euac;
    #has capability AweAffectCapability aac2;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
