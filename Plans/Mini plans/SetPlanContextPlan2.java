/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.cojack.configuration.*;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan SetPlanContextPlan2 extends Plan {

    #handles event SetPlanContextEvent2 spce2;
    #uses data PlanContextName planContextName;
    #uses data NA_Debug debug;
    #uses data Semaphore mutex;
    
    static boolean relevant(SetPlanContextEvent2 spce2)
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
        
            boolean bDebug = false;
        
            bDebug = $debug.as_boolean();
    
    /*
            if (bDebug)
            {
                System.out.println("Inside SetPlanContextPlan2 strName [" + spce2.strName + "]");
            }
    
            if (bDebug)
            {
                System.out.println("Inside SetPlanContextPlan2. iterating ids:");
            }
    
            Configuration config = Configuration.getInstance();
            
            Set ids = config.getModeratorInstances();
     
            Iterator iter = ids.iterator();
     
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
      */      
            //ModeratorEngine engine = getModerator(java.lang.String moderatorId)
    
            planContextName.add(0, spce2.strName);
                
            if (bDebug)
            {                
                logical String $planName;
                planContextName.get(0, $planName).next();
            
                String strPlanName = $planName.as_string();
            
                System.out.println("Inside SetPlanContextPlan2 set to [" + strPlanName + "]");
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

}
