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
public plan LevelCursorPlan extends Plan {

    #handles event LevelCursorEvent lce;
    #posts event AddAffectHistoryEvent aahe;
    #posts event CursorPlanChoiceEvent cpce;
    #uses interface NeonAffectAgent enc;
    #uses data Semaphore mutex3;
    #uses data Semaphore mutex6;
    #uses data AffectType affectType;
    #uses data Emotion emotion;
    #uses data NA_Debug debug;
    
    static boolean relevant(LevelCursorEvent lce)
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
      
            logical int $affect;
            logical double $emotion;
    
            int iLevel = lce.iLevel;
        
            if (bDebug)
            { 
                System.out.println("Inside LevelCursorPlan.");
            }
            
            if (bDebug)
            { 
                System.out.println("Inside LevelCursorPlan: triggering cursors.");
            }           
                
            affectType.get(0, $affect).next();
            int iAffect = $affect.as_int();
            
            if (bDebug)
            {
                System.out.println("Inside LevelCursorPlan. affectType [" + Integer.toString(iAffect) + "]");
            }
            
            emotion.get(0, $emotion).next();
            double dEmotion = $emotion.as_double();            
            
            @post(aahe.post(1, System.currentTimeMillis(), iAffect, dEmotion));     
            @wait_for(mutex3.planWait()); //new
                      
            Cursor c2 = new AckCursor(enc.ackCursorVar, enc.GetNumberOfCursors());            
            @wait_for(c2);
    
            if (bDebug)
            { 
                System.out.println("Inside LevelCursorPlan: after AckCursor wait_for.");
            }
            
            //posts to CursorPlanChoicePlan
            @post(cpce.post(iLevel, iAffect, dEmotion));
            @wait_for(mutex3.planWait());
            
            if (bDebug)
            { 
                System.out.println("Inside LevelCursorPlan: after call to plan choice");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();   
        }
        finally
        {
            mutex6.signal();            
        }
    }

}
