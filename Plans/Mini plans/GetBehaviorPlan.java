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

/**
 * 
 */
public plan GetBehaviorPlan extends Plan {

    #handles event GetBehaviorEvent gbe;
    #uses interface AbstractMiniAgent enc;
    #uses data Behavior behaviorName;
    #uses data NA_Debug debug;
    #uses data Semaphore mutex;
    
    static boolean relevant(GetBehaviorEvent gbe)
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
    
            if (bDebug)
            {
                System.out.println("Inside GetBehaviorPlan: " + getAgent().getBasename());
            }
    
            logical String $behaviorName;
            behaviorName.get(0, $behaviorName).next();
            
            String strBehavior = $behaviorName.as_string();
            
            if (bDebug)
            {
                System.out.println("Inside GetBehaviorPlan: " + getAgent().getBasename() + ": before set behavior [" + strBehavior + "]");
            }
            
            enc.SetBehavior(strBehavior);
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
