/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import OpenAIClassLibrary.openai;
import aos.jack.jak.beliefset.BeliefSetException;
import java.util.*;

/**
 * 
 */
public plan InteractionPlan extends Plan {

    #handles event ContextEvent ce;
    #sends event ContextReply reply;
    #uses interface NeonInteractionComputeAgent enc;
    #uses data NA_Debug debug;
    
    static boolean relevant(ContextEvent ce)
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
        boolean bVerbal = true;
        boolean bNonverbal = false;
        boolean bAction = false;
        
        boolean bDebug = false;
        
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
        
        @action()
        {  
            try 
            {      
                if (bDebug)
                {
                    System.out.println("Inside ComputePlan (Context Agent)");               
                }
            
                Object[] items = enc.GetNeonAffectAgent().GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetNeonAffectAgent().GetPersonalityType();
            
                ArrayList affectHistory = (ArrayList)items[0];
                ArrayList behaviorList = (ArrayList)items[1];
                
                if (bDebug)
                {
                    System.out.println("Inside NeonAffectAgent.ComputePlan: affectHistory.size: " + Integer.toString(affectHistory.size()) + " behaviorList.size: " + Integer.toString(behaviorList.size()));                
                }
                
                if (affectHistory.size() != 0 && behaviorList.size() != 0)
                { 
                    String strPrompt = CreateOpenAIPrompt(affectHistory, behaviorList, strPersonalityType);
                    
                    //calls open ai
                    ArrayList ret = new openai().DetermineAffectContext(strPrompt);
    
                    for (int i = 0; i < ret.size(); i++)
                    {
                        String strResult = (String)ret.get(i);
                
                        if (strResult.equals("Verbal"))
                        {
                            bVerbal = true;                    
                        }
                        else if (strResult.equals("Nonverbal"))
                        {
                            bNonverbal = true;   
                        }
                        else if (strResult.equals("Action"))
                        {
                            bAction = true;                    
                        }                
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();            
            }
        };
     
        if (bDebug)
        {
            System.out.println("Inside NeonAffectAgent.ComputePLan replying bVerbal: [" + bVerbal + "] bNonverbal: [" + bNonverbal + "] bAction: [" + bAction + "]");                
        }
     
        @reply(ce, reply.response(bVerbal, bNonverbal, bAction));   
    }

    private String CreateOpenAIPrompt(ArrayList affectHistory, ArrayList behaviorList, String strPersonalityType) throws Exception
    {
        //Given this history of behaviors and emotions, determine whether to do any combination of "verbal," "nonverbal," or "action" given an INTP Myers-Briggs personality type:
        //1.  A happy emotion occurred with a smile behavior at 30.0 seconds ago.
        //2.  A sad emoption occurred with a cry behavior at 40.0 seconds ago.
    
        String strPrompt = "Given this history of emotions and behaviors, determine whether to do a \"verbal,\" \"nonverbal,\" or \"action\" given an " + strPersonalityType + " Myers-Briggs personality type.  Give only one answer for the entire list.\n";
                
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
            
            strPrompt += Integer.toString(i+1) + ".  A " + AffectEnum.GetName(iType) + " emotion occurred with a " + strBehaviorName + " behavior at " + dDuration + " seconds ago.\n";
        }
        
        return strPrompt;        
    }

}
