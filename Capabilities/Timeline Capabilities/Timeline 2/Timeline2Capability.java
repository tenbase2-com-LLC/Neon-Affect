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
public capability Timeline2Capability extends Capability {
    #has capability OverwhelmedAffectCapability owc;
    #has capability PanicAffectCapability pac;
    #has capability TerrorAffectCapability tac;
    #has capability FearAffectCapability fac;
    #has capability WarinessAffectCapability wac;
    #has capability IrritationAffectCapability iac;
    #has capability IndifferenceAffectCapability inac;
    #has capability SatisfactionAffectCapability sac;
    #has capability AmazementAffectCapability aac2;
    #has capability EagernessAffectCapability aac;
    #imports data PlanContextName planContextName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Behavior behaviorName();
    #imports data NA_Debug debug();

}
