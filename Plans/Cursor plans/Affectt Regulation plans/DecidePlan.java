/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
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
public plan DecidePlan extends Plan {


    private String CreateOpenAIPrompt(ArrayList affectHistory, ArrayList behaviorList, String strPersonalityType) throws Exception
    {
        //Given this history of behaviors and emotions, determine whether to do any combination of "verbal," "nonverbal," or "action" given an INTP Myers-Briggs personality type:
        //1.  A happy emotion occurred with a smile behavior at 30.0 seconds ago.
        //2.  A sad emoption occurred with a cry behavior at 40.0 seconds ago.
    
    /*
        if (affectHistory.size() != behaviorList.size())
        {
            throw new Exception("CreateOpenAIPrompt: ArrayLists have different size.");        
        }
      */  
        String strPrompt = "Given this history of behaviors and emotions, determine whether to do any combination of a \"non-affect regulation,\" \"affect regulation,\" or an \"intense affect-regulation\" given an " + strPersonalityType + " Myers-Briggs personality type:  Give only one answer for the entire list.\n";
        strPrompt += AffectBehaviorHistory.FormatLines(affectHistory, behaviorList, System.currentTimeMillis());
        
        return strPrompt;        
    }
    #handles event DecideEvent de;
    #sends event DecideReply reply;
    #uses interface NeonAffectDeciderAgent enc;
    #uses data NA_Debug debug;
    
    static boolean relevant(DecideEvent de)
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
         boolean bLevelOnly = true;
         boolean bLevelAndAffect = false;
         boolean bLevelAndExtreme = false; 
    
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
                    System.out.println("Inside Decide plan (Affect Regulation)");               
                }
                       
                AffectHistoryBehaviors items = enc.GetNeonAffectAgent().GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetNeonAffectAgent().GetPersonalityType();
    
                ArrayList affectHistory = items.GetAffectHistory();
                ArrayList behaviorList = items.GetBehaviorList();
             
                if (bDebug)
                {
                    System.out.println("Inside NeonAffectAgent.Decider plan: affectHistory.size: " + Integer.toString(affectHistory.size()) + " behaviorList.size: " + Integer.toString(behaviorList.size()));                
                }
                
                if (affectHistory.size() != 0 && behaviorList.size() != 0)
                {
                    String strPrompt = CreateOpenAIPrompt(affectHistory, behaviorList, strPersonalityType);  
                 
                    //calls open ai
                    ArrayList ret = new NeonOpenAI(bDebug).determineAffectRegulation(strPrompt);
     
                    for (int i = 0; i < ret.size(); i++)
                    {
                        String strResult = (String)ret.get(i);
                
                        if (strResult.equals("LevelOnly"))
                        {
                            bLevelOnly = true;                    
                        }
                        else if (strResult.equals("LevelAndAffect"))
                        {
                            bLevelAndAffect = true;   
                        }
                        else if (strResult.equals("LevelAndExtreme"))
                        {
                            bLevelAndExtreme = true;                    
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
            System.out.println("Inside NeonAffectAgent.Decider replying bLevelOnly: [" + bLevelOnly + "] bLevelAndAffect: [" + bLevelAndAffect + "] bLevelAndExtreme: [" + bLevelAndExtreme + "]");                
        }
        
        @reply(de, reply.response(bLevelOnly, bLevelAndAffect, bLevelAndExtreme));
    }
    

}


