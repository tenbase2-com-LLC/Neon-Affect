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
public capability Timeline18Capability extends Capability {
    #has capability ControllingAffectCapability cac;
    #has capability TenseAffectCapability tac;
    #has capability TimidAffectCapability tac1;
    #has capability MeekAffectCapability mac;
    #has capability LuckyAffectCapability lac;
    #has capability DignifiedAffectCapability dac;
    #has capability FreeAffectCapability fac;
    #has capability StrongAffectCapability sac;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
