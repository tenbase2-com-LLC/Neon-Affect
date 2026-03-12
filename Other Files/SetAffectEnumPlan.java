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
public plan SetAffectEnumPlan extends Plan {

    #handles event SetAffectEnumEvent ev1;
    #uses data AffectType affectType;
    #uses data AffectTypePrev affectTypePrev;
    #uses data Semaphore mutex4;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetAffectEnumEvent ev1)
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
                        
            if (bDebug)
            { 
                System.out.println("Inside SetAffectEnumPlan.");
            }
    
            affectType.get(0, $affect).next();
            
            int iAffectPrev = $affect.as_int();
            int iNewAffect = ev1.iAffect;
            
            if (bDebug)
            {
                System.out.println("Inside SetAffectEnumPlan: affectType [" + Integer.toString(iNewAffect) + "]");
            }
            
            affectTypePrev.add(0, iAffectPrev);
            affectType.add(0, iNewAffect);
            
            if (bDebug)
            {     
                affectType.get(0, $affect).next();
            
                int iAffectType = $affect.as_int();
                        
                System.out.println("Inside SetAffectEnumPlan: verifying affectType [" + Integer.toString(iAffectType) + "]");
            
                System.out.println("Leaving SetAffectEnumPlan.");
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

}
