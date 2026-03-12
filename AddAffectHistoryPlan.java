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
public plan AddAffectHistoryPlan extends Plan {

    #handles event AddAffectHistoryEvent aahe;
    #uses interface NeonAffectAgent enc;
    #modifies data AffectHistory affectHistory;
    #uses data Semaphore mutex3;
    #uses data NA_Debug debug;
    
    static boolean relevant(AddAffectHistoryEvent aahe)
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
         
            boolean bDebug = $debug.as_boolean();
        
            if (bDebug)
            { 
                System.out.println("Inside AddAffectHistoryPlan.");
            }
        
            affectHistory.add(affectHistory.nFacts(), aahe.iLevel, aahe.iAffect, aahe.dValue, aahe.time);
            
            //add to observable
            enc.AddAffectHistoryValue(new AffectHistoryVar(affectHistory.nFacts(), aahe.iLevel, aahe.iAffect, aahe.dValue, aahe.time));
            
            if (bDebug)
            { 
                System.out.println("Leaving AddAffectHistoryPlan.");
            }
        }
        catch (Exception e)
        {   
            e.printStackTrace();
        }
        finally
        {
            mutex3.signal();            
        }        
    }

}
