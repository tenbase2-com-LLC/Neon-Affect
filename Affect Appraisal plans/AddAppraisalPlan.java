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
public plan AddAppraisalPlan extends Plan {

    #handles event AddAppraisalEvent aae;
    #uses data Appraisals appraisals;
    #uses data NA_Debug debug;
    
    static boolean relevant(AddAppraisalEvent aae)
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
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AddAppraisalPlan");
            }
            
            appraisals.add(aae.appraisal);
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

}
