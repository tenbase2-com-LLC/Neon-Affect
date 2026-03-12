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
public plan AffectAppraisalPlan extends Plan {

    #handles event AffectAppraisalEvent aae;
    #uses interface NeonAffectAgent enc;
    #uses data Semaphore appraisalMutex;
    #uses data NA_Debug debug;
    
    static boolean relevant(AffectAppraisalEvent aae)
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
            
            int iAffectType = aae.iAffectType;
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AffectAppraisalPlan: AffectType: [" + Integer.toString(iAffectType) + "]");
            }
            
            //enc.AddNegativeEmotionDirect(AffectEnum.DISAPPOINTMENT); 
                                    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AffectAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
        finally
        {
            appraisalMutex.signal();            
        }
    }

}
