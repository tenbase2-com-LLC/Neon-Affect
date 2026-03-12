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
public capability Timeline6Capability extends Capability {
    #has capability DepressedAffectCapability dac;
    #has capability RegretAffectCapability rac;
    #has capability RemorseAffectCapability rac2;
    #has capability GuiltAffectCapability gac;
    #has capability DoubtAffectCapability dac2;
    #has capability ConflictedAffectCapability cac;
    #has capability AdmirationAffectCapability aac;
    #has capability DesireAffectCapability dac3;
    #has capability LongingAffectCapability lac;
    #has capability LustAffectCapability lac2;
    #has capability MovedAffectCapability mac;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
