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
public plan Level5PosAffectPlan extends Plan {

    #handles event SetAffectCursorsEvent ev1;
    #posts event Level5PosAffectEvent ev4;
    #posts event AddAffectHistoryEvent aahe;
    #posts event LevelCursorEvent lce;
    #uses interface NeonAffectAgent enc;
    #uses data AffectType affectType;
    #uses data Emotion emotion;
    #uses data Semaphore mutex6;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetAffectCursorsEvent ev1)
    {
        return ev1.iCursorNumber == 5;
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
            logical int $affect;
            logical double $emotion;
            
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
        
            if (bDebug)
            { 
                System.out.println("Inside Level5PosAffectPlan.");
            }
           
            Level5PosAffect c = new Level5PosAffect(enc.emotionCursorVar, enc.GetAgent());
            
            while (true)
            {       
                @wait_for(c);
             
                enc.SetCursorAck(c.GetCursorType(), c.GetLevel(), true);
                             
                if (bDebug)
                {
                    System.out.println("Level5PosAffectPlan: after wait_for.");
                }
                
                @post(lce.post(CursorEnum.iLEVEL_CURSOR_POS_5));   
                @wait_for(mutex6.planWait());
             }
        
            if (bDebug)
            {
                System.out.println("After Level5PosAffectPlan wait_for.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();         
        }
    }

}
