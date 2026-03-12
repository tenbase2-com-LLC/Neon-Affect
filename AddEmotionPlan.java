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
import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public plan AddEmotionPlan extends Plan {

    #handles event AddEmotionEvent aee;
    #modifies data Emotion emotion;
    #uses data Semaphore mutex4;
    #uses data NA_Debug debug;
    
    static boolean relevant(AddEmotionEvent aee)
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
                System.out.println("Inside AddEmotionPlan.");
            }
        
            //collect event data, such as moderator and the amount to add to the current reservoir
    
            String strModerator = aee.strModerator;
       
            if (bDebug)
            {
                System.out.println("Moderator name: [" + strModerator + "]");
            }
       
            double dValue = aee.dAmount;
    
            long lTime = agent.timer.getTime();
    
            //compute the value of the moderator reservoir at this very moment
        
            double dReservoir = Configuration.moderatorCurrentReservoir(agent.getId(), strModerator, lTime);
    
            //add the event amount to the current reservoir and update the moderator
             
            if (bDebug)
            {
                System.out.println("Injecting " + dValue + "+" + dReservoir + " @ " + lTime+"\n");
            }
       
            if (aee.bIncremental)
            {       
                dReservoir = dReservoir + dValue;
            }
            else
            {
                dReservoir = dValue;
            }
            
            Configuration.moderatorReservoirAgentUpdate(agent.getId(), strModerator, dReservoir, lTime);
            
            dReservoir = Configuration.moderatorCurrentReservoir(agent.getId(), strModerator, lTime);
             
            if (bDebug)
            {
                System.out.println(dReservoir + " is the amount for affect emotion " + dValue + "\n");
            }            
        }
        catch (Exception e)
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
