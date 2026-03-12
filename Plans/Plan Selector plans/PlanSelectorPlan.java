/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import OpenAIClassLibrary.openai;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.plan.Plan;
import aos.jack.util.cursor.*;
import aos.util.ThreadPool;
import java.lang.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 
 */
public plan PlanSelectorPlan extends Plan {

    #handles event PlanSelectorEvent pse;
    #sends event PlanSelectorReply reply;
    #uses interface NeonPlanSelectorAgent enc;
    #uses data NA_Debug debug;
    
    static boolean relevant(PlanSelectorEvent pse)
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
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();        
        }
    
        ret2 = new ArrayList(); 
            
        if (bDebug)
        {
            System.out.println("Inside PlanSelectorAgent: PlanSelectorPlan: before action");               
        }
        
        ThreadPool tp = enc.GetThreadPool();
        
        @action(tp)
        {
            try
            {
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorAgent: PlanSelectorPlan: inside action before wait_for");               
                }
                
                String strEmotion = pse.strEmotion;            
                String strInteractionType = pse.strInteractionType;               
                ArrayList planNames = pse.planNames;
                
                Object[] items = enc.GetNeonAffectAgent().GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetNeonAffectAgent().GetPersonalityType();
           
                ArrayList affectHistory = (ArrayList)items[0];
                ArrayList behaviorList = (ArrayList)items[1];
                
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorAgent: PlanSelectorPlan: after action");               
                }
    
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorPlan: plans.size: " + Integer.toString(planNames.size()));                   
                }
                
                String strPrompt = CreateOpenAIPrompt(planNames, affectHistory, behaviorList, strEmotion, strInteractionType, strPersonalityType);
         
                long beg = System.currentTimeMillis();
         
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorPlan: OpenAI prompt [" + strPrompt + "]");
                    System.out.println("Inside PlanSelectorPlan: before call to OpenAI.");                    
                }
                
                long end = System.currentTimeMillis();
     
                //call open ai
                ArrayList ret = new openai().DetermineSelectedPlans(strPrompt);
    
                if (bDebug)
                {
                    long elapsed = end - beg;
                    
                    System.out.println("Inside PlanSelectorPlan: after call to OpenAI elapsed time: [" + Long.toString(elapsed) + "]");                    
                }
    
                items = new Object[0];
                
                //get max percenteage
                int iMaxPercentage = 0;
                for (int i = 0; i < ret.size(); i++)
                {
                    items = (Object[])ret.get(i);
                
                    String strPlanName = (String)planNames.get(i);
                    strPlanName = strPlanName.replace(Constants.NEON_NAMESPACE, "").trim();
                    String strPercentage = (String)items[1];
         
                    if (bDebug)
                    {
                        System.out.println("PlanSelectorPlan: Plan name [" + strPlanName + "]  Percentage [" + strPercentage + "]");
                    }
                    
                    strPercentage = strPercentage.replace("%", "");
                
                    int iPercentage = 0;
                
                    try
                    {
                        iPercentage = Integer.parseInt(strPercentage);
                    }
                    catch (NumberFormatException e)
                    {
                        e.printStackTrace();
                    }
                
                    if (iPercentage > iMaxPercentage)
                    {
                        iMaxPercentage = iPercentage;
                    }
                }
            
                //add plan formulas
                for (int i = 0; i < ret.size(); i++)
                {
                    items = (Object[])ret.get(i);
                
                    String strPlanName = (String)planNames.get(i);
                    strPlanName = strPlanName.replace(Constants.NEON_NAMESPACE, "").trim();
                    String strPercentage = (String)items[1];
                    
                    if (bDebug)
                    {
                        System.out.println("PlanSelectorPlan: adding plan formulas to Plan name [" + strPlanName + "]  Percentage [" + strPercentage + "]");
                    }
                    
                    strPercentage = strPercentage.replace("%", "");
                 
                    int iPercentage = 0;
                
                    try
                    {
                        iPercentage = Integer.parseInt(strPercentage);
                    }
                    catch (NumberFormatException e)
                    {
                        e.printStackTrace();
                    }
                
                    if (iPercentage == iMaxPercentage)
                    {
                        items = new Object[2];
                        items[0] = (Object)strPlanName;
                        items[1] = (Object)PlanConstants.RANDOM_SELECTED_PLAN;
                    
                        if (bDebug)
                        {
                            System.out.println("PlanSelectorPlan: setting random plan (max) to  Plan name [" + strPlanName + "]");
                        }
                    
                        ret2.add((Object)items);
                    }
                    else
                    {
                        items = new Object[2];
                        items[0] = (Object)strPlanName;
                        items[1] = (Object)PlanConstants.RANDOM_NON_SELECTED_PLAN;
                        
                        if (bDebug)
                        {
                            System.out.println("PlanSelectorPlan: setting random plan (nonselected) to  Plan name [" + strPlanName + "]");
                        }
                        
                        ret2.add((Object)items);
                    }
                }
       
                if (bDebug)
                {
                    System.out.println("Inside NeonPLanSelectorAgent.PlanSelectorPlan replying.");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();            
            }
        };     
        
        if (bDebug)
        {
            System.out.println("Inside NeonPLanSelectorAgent.PlanSelectorPlan after action before reply.");
        }  
                
        @reply(pse, reply.response(ret2));
    }
    private boolean bDebug = false;
    private ArrayList ret2 = new ArrayList();

    private String CreateOpenAIPrompt(ArrayList planNames, ArrayList affectHistory, ArrayList behaviorList, String strEmotion, String strInteractionType, String strPersonalityType) throws Exception
    {
        //Given this history of behaviors and emotions, determine whether to do any combination of "verbal," "nonverbal," or "action" given an INTP Myers-Briggs personality type:
        //1.  A happy emotion occurred with a smile behavior at 30.0 seconds ago.
        //2.  A sad emoption occurred with a cry behavior at 40.0 seconds ago.
        
        /*
        if (affectHistory.size() != behaviorList.size())
        {
            throw new Exception("PlanSelectorPlan: CreateOpenAIPrompt: ArrayLists have different size.");        
        }
        */
       
        strEmotion = strEmotion.toLowerCase();
        strInteractionType = strInteractionType.toLowerCase();
       
        String strPrompt = "Given these \"" + strEmotion + "\", " + strInteractionType + " behaviors, provide the usage percentages as a numbered list with behavior name and usages, of what an " + strPersonalityType + " Myers-Briggs personality type would do:\n";
        
        //long now = System.currentTimeMillis();
        for (int i = 0; i < planNames.size(); i++)
        {
            String strPlanName = (String)planNames.get(i);
            
            strPlanName = strPlanName.replace(Constants.NEON_NAMESPACE, "").trim();
            strPlanName = strPlanName.replace(strEmotion, "").trim();
            
            strPlanName = PlanUtils.InsertSpaces(strPlanName);
            
            strPrompt += Integer.toString(i+1) + ".  " + strPlanName + "\n";
        }
        
        strPrompt += "Do not add to this list.\nPlease respond like this: 1. Crying Pain - 15%\n";
        
        /*
        long now = System.currentTimeMillis();
        for (int i = 0; i < behaviorList.size(); i++)
        {
            Object[] items = (Object[])behaviorList.get(i);
            
            String strBehaviorName = (String)items[0];
            long time = (long)items[1];
            
            double dDuration = (now - time) / 1000;
            
            AffectHistoryVar affectHistoryVar = (AffectHistoryVar)affectHistory.get(0);
            
            int iType = affectHistoryVar.GetType();
            double dValue = affectHistoryVar.GetValue();
            
            strPrompt += Integer.toString(i) + ".  A " + AffectEnum.GetName(iType) + " emotion occurred with a " + strBehaviorName + " behavior at " + dDuration + " seconds ago.\n";
        }
        */
       
        return strPrompt;        
    }

}
