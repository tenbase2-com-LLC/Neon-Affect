
package NeonAffect;

import java.lang.StringBuilder;
import java.util.regex.*;

public class PlanUtils {

    public PlanUtils()
    {
        
    }      
    
    public static String InsertSpaces(String strPlanName)
    {
        //HoldingBackCriticismPlan
        
        String str = strPlanName;
        
        str = str.replaceAll("Plan", "");
        
        StringBuilder out = new StringBuilder(str);
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(str);
        int extraFeed = 0;
        while(m.find()) {
            if(m.start()!=0) {
                out = out.insert(m.start()+extraFeed, " ");
                extraFeed++;
            }
        }
        
        return out.toString().trim();
    }
    
    public static boolean ContainsCorrectPlan(String strPlanName)
    {        
        boolean bRet = false;
        
        if (!strPlanName.contains("WaitLibrary") && 
            !strPlanName.contains("DebugLibrary") &&          
            !strPlanName.contains("SetFormulaLibrary") &&
            !strPlanName.contains("SetPlanContext") &&
            !strPlanName.contains("GetBehavior") &&
            !strPlanName.contains("GetPlanFormulas") &&
            !strPlanName.contains("GetSelectedPlans") &&
            !strPlanName.contains("SetFormulaPlan") &&
            !strPlanName.contains("GetFormulasPlan")
            )
        {
             bRet = true;                
        }
        
        return bRet;        
    }
}
