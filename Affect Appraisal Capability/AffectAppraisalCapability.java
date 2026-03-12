/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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
public capability AffectAppraisalCapability extends Capability {
    #handles event AffectAppraisalEvent;
    #posts event AffectAppraisalEvent aae;
    #handles event TestAffectAppraisalEvent;
    #posts event TestAffectAppraisalEvent taae;
    #handles event AddAppraisalEvent;
    #posts event AddAppraisalEvent aae2;
    #uses plan AffectAppraisalPlan;
    #uses plan AddAppraisalPlan;
    #uses plan TestAffectAppraisalPlan;
    #imports data NA_Debug debug();
    #imports data Semaphore mutex();
    #imports data Expectancy expectancy();
    #imports data Outcome outcome();
    #imports data Appraisals appraisals();
    #private data Semaphore appraisalMutex();

}
