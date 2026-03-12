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
public capability Timeline15Capability extends Capability {
    #has capability PowerlessAffectCapability pac;
    #has capability FeebleAffectCapability fac;
    #has capability InsecureAffectCapability iac;
    #has capability EgotisticalAffectCapability eac;
    #has capability VigorousAffectCapability vac;
    #has capability ShyAffectCapability sac;
    #has capability KindAffectCapability kac;
    #has capability FriendlyAffectCapability fac2;
    #has capability CarefreeAffectCapability cac;
    #has capability DevotedAffectCapability dac;
    #has capability InLoveAffectCapability ilac;
    #has capability MightyAffectCapability mac;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
