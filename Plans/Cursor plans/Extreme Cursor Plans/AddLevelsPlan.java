/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;


/**
 * 
 */
public plan AddLevelsPlan extends Plan {

    #handles event AddLevelsEvent ale;
    #uses data Levels levels;
    #uses data NA_Debug debug;
    
    static boolean relevant(AddLevelsEvent ale)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    insert()
    {
        try {
            
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
            
            for (int i = NeonAffectAgent.iMaxNegLevel; i <= NeonAffectAgent.iMaxPosLevel; i++)
            {             
                if (bDebug)
                {
                    System.out.println("AddLevelsPlan: Inserting: " + Integer.toString(i));
                }
                
                levels.add(levels.nFacts(), i);
                
                if (bDebug)
                {
                    System.out.println("AddLevelsPlan: Inserted: id: " + Integer.toString(levels.nFacts()) + " Level: " + Integer.toString(i));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }         
    }

    #reasoning method
    iterate()
    {
        try
        {                       
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
                        
            logical int $id;
            logical int $level;
            
            for (int i = 0; i < 12; i++)
            {
                levels.get(i, $level);
                
                if (bDebug)
                {
                    System.out.println("AddLevelsPlan: iterate: id: " + Integer.toString(i) + " level: " + Integer.toString($level.as_int()));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }         
    }

    #reasoning method
    body()
    {
        insert();
        //iterate();    
    }

}
