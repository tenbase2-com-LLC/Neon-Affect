/*******************************************************************
 * Created by the JDE: Wed Nov 18 09:22:18 EDT 2026
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
            //mixed emotions: the reservoir of the amount's sign, after inhibition
            double dNewEmotion = enc.PredictReservoirValue(mae.dAmount);
            
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
            
            //record the mapped emotion FIRST: the plan does not continue past the @subtask
            //below (SetAffectEnumEvent is declared #sends here), so a call placed after it
            //never ran - the side's emotion and its decay rate were never set
            enc.SetMappedAffect(iNewAffect);

            //set affectType/affectTypePrev beliefsets
            @subtask(saee.post(iNewAffect));
            
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

