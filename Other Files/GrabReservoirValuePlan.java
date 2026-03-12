/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.cojack.configuration.*;
import aos.jack.jak.beliefset.BeliefSetException;

/**
 * 
 */
public plan GrabReservoirValuePlan extends Plan {

    #handles event GrabReservoirValueEvent grve;
    #uses interface NeonAffectAgent enc;
    #uses data NA_Debug debug;
    
    static boolean relevant(GrabReservoirValueEvent grve)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    grabValue()
    {         
         try {
            
            if (bDebug)
            {
                System.out.println("Inside GrabReservoirValuePlan grabValue");
            }
            
            double v = enc.GetReservoirValue();
            
            //set observable
            enc.SetEmotionValue(v);
            
            if (bDebug)
            {
                System.out.println("GrabReservoirValuePlan: Done setting observable.");
            }
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }        
    }

    #reasoning method
    body()
    {
        try
        {
            logical boolean $debug;
            debug.get($debug).next();
        
            bDebug = $debug.as_boolean();
            
            if (bDebug)
            {
                System.out.println("Inside GrabReservoirValuePlan.");
            }
            
            while(true)
            {
                @wait_for(elapsedMillis(TIME_OUT));
                grabValue();            
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();     
        }
    }
    private static long TIME_OUT = 500;
    private boolean bDebug = false;

}
