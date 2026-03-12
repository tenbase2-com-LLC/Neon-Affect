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
public plan GetAffectHistoryPlan extends Plan {

    #handles event GetAffectHistoryEvent gahe;
    #uses interface NeonAffectAgent enc;
    #uses data AffectHistory affectHistory;
    #uses data Semaphore mutex4;
    #uses data NA_Debug debug;
    
    static boolean relevant(GetAffectHistoryEvent gahe)
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
        ArrayList ret = new ArrayList();
        
        try
        {
            logical int $id;
            logical int $level;
            logical int $affect;
            logical double $value;
            logical long $time;
            
            logical boolean $debug;
    
            debug.get($debug).next();
        
            bDebug = $debug.as_boolean();
    
            if (affectHistory.nFacts() != 0)
            {             
                Cursor c = affectHistory.getIter($id, $level, $affect, $value, $time);
        
                while (c.next())
                {
                    int iID = $id.as_int();
                    int iLevel = $level.as_int();
                    int iAffect = $affect.as_int();
                    double dValue = $value.as_double();
                    long time = $time.as_long();
     
                    if (bDebug)
                    {
                        System.out.println("Inside NeonAffectAgent.GetAffectHistoryPlan: iID [" + Integer.toString(iID) + "] iLevel [" + Integer.toString(iLevel) + "] iAffect: [" + Integer.toString(iAffect) + "] dValue: [" + Double.toString(dValue) + "] time [" + Long.toString(time) + "]");                
                    }
     
                    AffectHistoryVar item = new AffectHistoryVar(iID, iLevel, iAffect, dValue, time);
            
                    ret.add(item);
                }          
            }
            enc.SetAffectHistoryItems(ret);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();   
        }
        finally
        {
            mutex4.signal();
        }
    }
    private boolean bDebug = false;

}
