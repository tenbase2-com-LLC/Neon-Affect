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

/**
 * 
 */
public plan ClearAffectHistoryPlan extends Plan {

    #handles event ClearAffectHistoryEvent cahe;
    #uses data AffectHistory affectHistory;
    #uses data NA_Debug debug;
    
    static boolean relevant(ClearAffectHistoryEvent cahe)
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
            logical int $id;
            logical int $level;
            logical int $affect;
            logical double $value;
            logical long $time;
            logical boolean $debug;
    
            debug.get($debug).next();
        
            bDebug = $debug.as_boolean();
     
            int iSize = affectHistory.nFacts();
        
            for (int i = 0; i <= iSize; i++)
            {
                if (bDebug)
                {
                    System.out.println("AffectHistory: CleraItems: removing id: " + Integer.toString(i));
                }
            
                affectHistory.getIter(i, $level, $affect, $value, $time).removeAll();            
            }
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }
    }
    private boolean bDebug = false;

}
