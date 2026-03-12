/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public plan SetCursorsPlan extends Plan {

    #handles event SetCursorsEvent sce;
    #posts event SetAffectCursorsEvent sace;
    #posts event SetLevelCursorsEvent slce;
    #posts event AddLevelsEvent ale;
    #posts event SetExtremeLevelCursorsEvent selcse;
    #uses data Semaphore mutex;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetCursorsEvent sce)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    setLevelCursors()
    {   
        if (bDebug)
        {
            System.out.println("Setting Level Cursors.");
        }
        
        for (int i = NeonAffectAgent.iMaxNegLevel; i <= NeonAffectAgent.iMaxPosLevel; i++)
        {
            @post(sace.post(i)); //sets level cursors
        }
        
        @sleep(5);
        
        if (bDebug)
        {
            System.out.println("done.");
        }
    }

    #reasoning method
    setAffectRegulationCursors()
    {   
        if (bDebug)
        {
            System.out.println("Setting affect regulation cursors.");
        }
        
        for (int i = 0; i < 5; i++)
        {
            @post(slce.post(i)); //sets affect regulation cursors
        }
        
        @sleep(5);
        
        if (bDebug)
        {
            System.out.println("done.");
        }
    }

    #reasoning method
    setExtremeCursors()
    {   
        if (bDebug)
        {
            System.out.println("Setting extreme cursors.");
        }
        
        @subtask(ale.post()); //add levels
        
        if (bDebug)
        {
            System.out.println("Before ExtremeLevelsAffectPlan.");
        }
        
        for (int i = NeonAffectAgent.iMaxNegLevel; i <= NeonAffectAgent.iMaxPosLevel; i++)
        {           
            @post(selcse.post(i)); //sets extreme level cursors       
        }
        
        @sleep(5);
        
        if (bDebug)
        {
            System.out.println("done.");
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
                System.out.println("Inside SetCursorsPlan.");
            }
        
            setLevelCursors();
            setAffectRegulationCursors();
            setExtremeCursors();   
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
    private boolean bDebug = false;

}
