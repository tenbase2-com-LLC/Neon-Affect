/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import CoJACKConfigParserXML.parser;
import aos.cojack.base.CatMan;
import aos.cojack.configuration.*;
import aos.cojack.moderator.*;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.util.timer.DilatedClock;
import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan GetFormulasPlan extends Plan {

    #handles event GetFormulasEvent gfe;
    #uses data PlansWithFormulas plansFormulas;
    #uses data Semaphore mutex;
    #uses data NA_Debug debug;
    
    static boolean relevant(GetFormulasEvent gfe)
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
         
            bDebug = $debug.as_boolean();
        
            if (bDebug)
            { 
                System.out.println("Inside GetFormulaPlan:.body.");
            }
            
            String strModeratorType = gfe.strModeratorType;
            ArrayList planNames = gfe.planNames;
         
            if (bDebug)
            { 
                System.out.println("Inside GetFormulaPlan: Agent name [" + getAgent().getBasename() + "]");
            }
     
            int iSize = planNames.size();
            
            for (int i = 0; i < iSize; i++)
            {
                String strPlanName = (String)planNames.get(i);
                                           
                String strParameterGroupName = "Neon" + strModeratorType;
                String strConfigPlanName = strPlanName.replace("NeonAffect.", "");
                
                String strPlanNameValue = "0"; 
                                
                if (bDebug)
                { 
                    System.out.println("Inside GetFormulaPlan: before call to GetPlanNameValue: strParameterGroupName: [" + strParameterGroupName + "] PlanName: [" + strConfigPlanName + "]");
                }                
                
                try               
                {
                    strPlanNameValue = new parser(Constants.COJACK_COGNITIVE_PATH).GetPlanNameValue(strParameterGroupName, strConfigPlanName);
                }
                catch (Exception e)
                {
                    e.printStackTrace();   
                }                    
                
                if (bDebug)
                { 
                    System.out.println("Inside GetFormulaPlan: after call to getFormula: PlanName: [" + strPlanName + "] strPlanNameValue [" + strPlanNameValue + "]");
                }
                
                if (!strPlanNameValue.equals("0"))
                {   
                    //add to list
                    plansFormulas.add(plansFormulas.nFacts(),  strPlanName);
                }
            }
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
    private String strPlanWithFormula = "";

}
