/*******************************************************************
 * Created by the JDE: Wed Nov 18 09:22:18 EDT 2026
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
        //one level event at a time: a positive and a negative cursor can now fire together
        @wait_for(enc.levelLock.planWait());

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

            //mixed emotions: the current emotion of the side whose cursor fired
            int iSideAffect = (lce.iLevel > 0) ? enc.GetPositiveAffect() : enc.GetNegativeAffect();
            if (iSideAffect >= 0)
            {
                iAffect = iSideAffect;
            }
            
            if (bDebug)
            {
                System.out.println("Inside LevelCursorPlan. affectType [" + Integer.toString(iAffect) + "]");
            }
            
            emotion.get(0, $emotion).next();
            double dEmotion = $emotion.as_double();

            //record the real level and intensity - the reservoir of the side whose cursor
            //fired. (This recorded level 1 and the Emotion beliefset's value, which is never
            //updated and stayed 0, so the analyzers saw a flat line.)
            dEmotion = (lce.iLevel > 0) ? enc.GetPositiveReservoirValue() : enc.GetNegativeReservoirValue();

            @post(aahe.post(lce.iLevel, System.currentTimeMillis(), iAffect, dEmotion));
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
            enc.levelLock.signal();
        }
    }
    

}

