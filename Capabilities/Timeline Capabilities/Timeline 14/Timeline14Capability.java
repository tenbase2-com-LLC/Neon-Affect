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
public capability Timeline14Capability extends Capability {
    #has capability DomineeringAffectCapability dac;
    #has capability SexuallyExcitedAffectCapability seac;
    #has capability UpsetAffectCapability uac;
    #has capability DefeatedAffectCapability eac;
    #has capability BoredAffectCapability bac;
    #has capability DissatisfiedAffectCapability dac2;
    #has capability ActivatedAffectCapability aac;
    #has capability InterestedAffectCapability iac;
    #has capability CapableAffectCapability cac;
    #has capability AffectionateAffectCapability aac2;
    #has capability ImpressedAffectCapability iac2;
    #has capability WonderAffectCapability wac;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
