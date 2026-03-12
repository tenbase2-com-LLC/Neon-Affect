/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import SetFormulaLibrary.*;
import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public capability GetSetFormulasCapability extends Capability {
    #has capability SetFormulaCapability sfc;
    #has capability GetFormulasCapability gfc;
    #imports data PlansWithFormulas plansFormulas();
    #imports data Semaphore mutex();
    #imports data NA_Debug debug();

}
