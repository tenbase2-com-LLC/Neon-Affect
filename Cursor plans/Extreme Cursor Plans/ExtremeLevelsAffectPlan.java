/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.util.cursor.ArrayCursor;

/**
 * 
 */
public plan ExtremeLevelsAffectPlan extends Plan {

    #handles event SetExtremeLevelCursorsEvent selcse;
    #posts event SetExtremeLevelCursorEvent selce;
    #uses data Levels levels;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetExtremeLevelCursorsEvent selcse)
    {
        return true;
    }
    
    context()
    {
        levels.get($id, $level);
    }

    #reasoning method
    body()
    {
        
        try
        {
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
        
        /*
            if (bDebug)
            { 
                System.out.println("Inside ExtremeLevelsAffectPlan.");
                System.out.println("Level: " + $level.as_int());
            }
          */
         
            int iBegLevel = selcse.iBegLevel;
            int iEndLevel = $level.as_int();            
       
       /*
            if (bDebug)
            { 
                System.out.println("StartLevel: " + Integer.toString(iBegLevel) + " EndLevel: " + iEndLevel);
                return $id.as_int()==levels.nFacts();
            }        
        */
            //skipping neutral level
            if (iBegLevel == 0 || iEndLevel == 0)
            {
                return $id.as_int()==levels.nFacts();
            }
    
            //only opposing levels     
            if ((iBegLevel <= 0 && iEndLevel <= 0) || (iBegLevel > 0 && iEndLevel > 0))
            {
                return $id.as_int()==levels.nFacts();           
            }
            
            @post(selce.post(iBegLevel, iEndLevel));
            
            return $id.as_int()==levels.nFacts();
        }
        catch (Exception e)
        {
            e.printStackTrace();
         }
    }
    logical int $id;
    logical int $level;

}
