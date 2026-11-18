/*******************************************************************
 * Created by the JDE: Wed Nov 18 09:22:18 EDT 2026
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


    private String CreateOpenAIPrompt(ArrayList affectHistory, ArrayList behaviorList, String strPersonalityType) throws Exception
    {
        //Given this history of behaviors and emotions, determine whether to do any combination of "verbal," "nonverbal," or "action" given an INTP Myers-Briggs personality type:
        //1.  A happy emotion occurred with a smile behavior at 30.0 seconds ago.
        //2.  A sad emoption occurred with a cry behavior at 40.0 seconds ago.
    
        String strPrompt = "Given this history of emotions and behaviors, determine whether to do a \"verbal,\" \"nonverbal,\" or \"action\" given an " + strPersonalityType + " Myers-Briggs personality type.  Give only one answer for the entire list.\n";
                
        strPrompt += AffectBehaviorHistory.FormatLines(affectHistory, behaviorList, System.currentTimeMillis());
        
        return strPrompt;        
    }
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
        //ONE channel per response: the judge picks verbal, nonverbal or action.
        //Verbal is the fallback - no history yet, or no usable answer.
        boolean bVerbal = false;
        boolean bNonverbal = false;
        boolean bAction = false;

        String strChannel = JevChannelSelector.VERBAL;
        
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
            
                AffectHistoryBehaviors items = enc.GetNeonAffectAgent().GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetNeonAffectAgent().GetPersonalityType();
    
                ArrayList affectHistory = items.GetAffectHistory();
                ArrayList behaviorList = items.GetBehaviorList();
                
                if (bDebug)
                {
                    System.out.println("Inside NeonAffectAgent.ComputePlan: affectHistory.size: " + Integer.toString(affectHistory.size()) + " behaviorList.size: " + Integer.toString(behaviorList.size()));                
                }
                
                //mixed emotions: a channel fixed in advance by CursorPlanChoicePlan
                String strAssigned = enc.GetNeonAffectAgent().TakeAssignedChannel();

                if (strAssigned != null)
                {
                    strChannel = strAssigned;
                }
                else if (affectHistory.size() != 0 && behaviorList.size() != 0)
                {
                    //================ OpenAI path - DISABLED ==========================
                    //Kept here, next to the live path, so the two can be swapped by moving
                    //the comment markers (as in PlanSelectorPlan).
                    //
                    //String strPrompt = CreateOpenAIPrompt(affectHistory, behaviorList, strPersonalityType);
                    //
                    //ArrayList ret = new NeonOpenAI(bDebug).determineAffectContext(strPrompt);
                    //
                    //if (ret.size() != 0)
                    //{
                    //    strChannel = (String)ret.get(0);
                    //}
                    //=================================================================

                    //================ Jev path - ACTIVE ==============================
                    //Jev takes the personality type and the history as separate fields of
                    //structured state and answers with one of the three channel labels.
                    strChannel = JevChannelSelector.Select(affectHistory, behaviorList, strPersonalityType, bDebug);
                    //=================================================================
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        };

        if (strChannel.equals(JevChannelSelector.NONVERBAL))
        {
            bNonverbal = true;
        }
        else if (strChannel.equals(JevChannelSelector.ACTION))
        {
            bAction = true;
        }
        else
        {
            bVerbal = true;
        }
     
        if (bDebug)
        {
            System.out.println("Inside NeonAffectAgent.ComputePLan replying bVerbal: [" + bVerbal + "] bNonverbal: [" + bNonverbal + "] bAction: [" + bAction + "]");                
        }
     
        @reply(ce, reply.response(bVerbal, bNonverbal, bAction));   
    }
    

}


