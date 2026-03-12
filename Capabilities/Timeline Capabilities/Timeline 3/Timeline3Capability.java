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
public capability Timeline3Capability extends Capability {
    #has capability ObsessedAffectCapability oac;
    #has capability BitternessAffectCapability bac;
    #has capability ResentmentAffectCapability rac;
    #has capability EnvyAffectCapability eac;
    #has capability JealousyAffectCapability jac;
    #has capability AcceptanceAffectCapability aac;
    #has capability PeacefulnessAffectCapability pac;
    #has capability InspiredAffectCapability iac1;
    #has capability GratitudeAffectCapability gac;
    #has capability ConnectednessAffectCapability cac;
    #has capability WanderlustAffectCapability wac;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
