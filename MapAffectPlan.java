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
public plan MapAffectPlan extends Plan {

    #handles event MapAffectEvent mae;
    #sends event SetAffectEnumEvent saee;
    #uses interface NeonAffectAgent enc;
    #uses data Semaphore mutex4;
    #uses data NA_Debug debug;
    
    static boolean relevant(MapAffectEvent mae)
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
            logical int $affect;
            logical double $emotion;
            
            logical boolean $debug;
            debug.get($debug).next();
         
            boolean bDebug = $debug.as_boolean();
        
            if (bDebug)
            { 
                System.out.println("Inside MapAffectPlan.");
            }
               
            int iAffect = mae.iAffect;         
            double dEmotion = enc.GetReservoirValue();
            
            //calculate new reservoir value
            double dNewEmotion = dEmotion + mae.dAmount;
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.MapAffectPlan: dNewEmotion: " + Double.toString(dNewEmotion));
            }
                    
            int iLevel = LevelClassifier.GetLevel(dNewEmotion);           
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.MapAffectPlan: iLevel: " + Integer.toString(iLevel));
            }
            
            int iNewAffect = enc.GetAffectFromTimeline(iAffect, iLevel);
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.MapAffectPlan: iNewAffect: " + Integer.toString(iNewAffect));
            }
            
            //set affectType/affectTypePrev beliefsets
            @subtask(saee.post(iNewAffect));
            
            enc.SetMappedAffect(iNewAffect);
            
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

}
