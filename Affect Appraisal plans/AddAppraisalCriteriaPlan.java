/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan AddAppraisalCriteriaPlan extends Plan {

    #handles event AddAppraisalCriteriaEvent aace;
    #uses interface NeonAffectAgent enc;
    #uses data Appraisals appraisalSims;
    #uses data NA_Debug debug;
    #uses data Semaphore mutex;
    
    static boolean relevant(AddAppraisalCriteriaEvent aace)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    body()
    {
        try
        {      
            logical boolean $debug;
            debug.get($debug).next();
        
            bDebug = false;
        
            bDebug = $debug.as_boolean();
    
            if (bDebug)
            {
                System.out.println("Inside AddAppraislCrteriaPlan");
            }
            
            PersonalityAppraisals personalityTypes = new PersonalityAppraisals();
            
            ArrayList appraisalList = (ArrayList)personalityTypes.get(aace.strPersonalityType);
            
            for (int i = 0; i < appraisalList.size(); i++)            
            {
                AffectAppraisal appraisal = (AffectAppraisal)appraisalList.get(i); 
                
                if (bDebug)
                {
                    System.out.println("Inside AddAppraislCrteriaPlan: adding appraisal to belief set: [" + appraisal.ToString() + "]");
                }
                
                appraisalSims.add(appraisal);
            }
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }
        finally
        {
            mutex.signal();
        }
    }
    private boolean bDebug = false;

}
