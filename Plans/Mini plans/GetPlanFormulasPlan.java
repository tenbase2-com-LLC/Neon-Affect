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
import java.util.*;

/**
 * 
 */
public plan GetPlanFormulasPlan extends Plan {

    #handles event GetPlanFormulasEvent gpfe;
    #uses interface AbstractMiniAgent enc;
    #uses data PlansWithFormulas plansFormulas;
    #uses data Semaphore mutex;
    #uses data NA_Debug debug;
    
    static boolean relevant(GetPlanFormulasEvent gpfe)
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
                System.out.println("Inside GetPlanFormulasPlan: Agent name [" + getAgent().getBasename() + "]");
            }
    
            ret = new ArrayList();
            
            logical int $id;
            logical String $planName;
    
            Cursor c = plansFormulas.get($id, $planName);
     
            while (c.next())
            {   
                int iId = $id.as_int();
                String strPlanName = $planName.as_string();
        
                if (bDebug)
                {
                    System.out.println("Inside GetPlanFormulasPlan:: ID: [" + iId + "] strPlanName: [" + strPlanName + "]"); 
                }
    
                ret.add((Object)strPlanName);
            }
       
            if (bDebug)
            { 
                System.out.println("Inside GetPlanFormulasPlan: ret size: " + Integer.toString(ret.size()));
            }
            
            enc.SetPlansWithFormulas(ret);
        }
        catch (Exception e)
        {
            e.printStackTrace();                
        }
        finally
        {
            mutex.signal();   
        }
    }
    private ArrayList ret = new ArrayList();

}
