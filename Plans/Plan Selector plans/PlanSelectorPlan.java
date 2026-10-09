/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import OpenAIClassLibrary.OpenAI;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.plan.Plan;
import aos.jack.util.cursor.*;
import aos.util.ThreadPool;
import java.lang.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * 
 */
public plan PlanSelectorPlan extends Plan {

    private boolean bDebug = false;
    private ArrayList<SelectedPlan> ret2 = new ArrayList<SelectedPlan>();

    private String CreateOpenAIPrompt(ArrayList<String> planNames, ArrayList<AffectHistoryVar> affectHistory, ArrayList<BehaviorItem> behaviorList, String strEmotion, String strInteractionType, String strPersonalityType) throws Exception
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
       
        //Ask for a subjective weighting, not an empirical frequency.  GPT-6 models
        //correctly refuse "usage percentages" - MBTI supplies no behaviour-frequency
        //data - and return no usable rows at all.  This framing they will answer.
        String strPrompt = "An " + strPersonalityType + " Myers-Briggs personality type is experiencing " + strEmotion + ". Distribute 100 points across the " + strInteractionType + " behaviors below according to how characteristic each is of that type in that state. This is a subjective weighting, not an empirical frequency; approximate judgement is expected.\n";
        
        //long now = System.currentTimeMillis();
        int iCount = 1;
        for (String planName : planNames)
        {
            String strBare = planName.replace(Constants.NEON_NAMESPACE, "").trim();

            strPrompt += Integer.toString(iCount++) + ".  " + PlanUtils.DisplayName(strBare, strEmotion) + "\n";
        }
        
        strPrompt += "Do not add to this list.\nRespond only as: 1. Behavior Name - 15%\n";
        
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
    
        ret2 = new ArrayList<SelectedPlan>();
            
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
                ArrayList<String> planNames = pse.planNames;
                
                AffectHistoryBehaviors ahb = enc.GetNeonAffectAgent().GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetNeonAffectAgent().GetPersonalityType();
    
                ArrayList<AffectHistoryVar> affectHistory = ahb.GetAffectHistory();
                ArrayList<BehaviorItem> behaviorList = ahb.GetBehaviorList();
                
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorAgent: PlanSelectorPlan: after action");               
                }
    
                if (bDebug)
                {
                    System.out.println("Inside PlanSelectorPlan: plans.size: " + Integer.toString(planNames.size()));                   
                }
                
                //================ OpenAI path - DISABLED ==========================
                //Kept here, next to the live path, so the two can be swapped by moving
                //the comment markers.  No switch, no environment variable: whichever
                //block is uncommented is the judge.
                //
                //String strPrompt = CreateOpenAIPrompt(planNames, affectHistory, behaviorList, strEmotion, strInteractionType, strPersonalityType);
                //
                //long beg = System.currentTimeMillis();
                //
                //if (bDebug)
                //{
                //    System.out.println("Inside PlanSelectorPlan: OpenAI prompt [" + strPrompt + "]");
                //    System.out.println("Inside PlanSelectorPlan: before call to OpenAI.");
                //}
                //
                //long end = System.currentTimeMillis();
                //
                //Fully qualified on purpose: JAL blanks generic type arguments before
                //JACK parses, then restores them verbatim, so JACK never resolves this
                //type and emits no import for it.  An unqualified OpenAI.PlanResult here
                //makes javac read "OpenAI" as a package name and the build fails.
                //
                //ArrayList of OpenAIClassLibrary.OpenAI.PlanResult  ret = new NeonOpenAI(bDebug).determineSelectedPlans(strPrompt);
                //  (written without angle brackets on purpose: the JAL generics preprocessor
                //   blanks and restores every angle-bracket span it finds, comments included, so a
                //   commented-out generic can still perturb the generated Java.)
                //
                //if (bDebug)
                //{
                //    long elapsed = end - beg;
                //    System.out.println("Inside PlanSelectorPlan: after call to OpenAI elapsed time: [" + Long.toString(elapsed) + "]");
                //}
                //
                //ret2 = PlanSelectionResolver.Resolve(planNames, ret, strEmotion, bDebug);
                //=================================================================

                //================ Jev path - ACTIVE ==============================
                //Jev takes the personality type, emotion and modality as separate fields
                //of structured state and answers over the declared plan list, instead of
                //having them narrated into a sentence and parsing a numbered list back.
                //
                //The call lives in JevPlanSelector because it needs a Map of state, and
                //a .plan cannot build one - JAL blanks generics, leaving a raw Map whose
                //put(String,String) will not resolve against put(Object,Object).
                ret2 = JevPlanSelector.Select(planNames, strEmotion, strInteractionType, strPersonalityType, bDebug);
                //=================================================================

       
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
    

}









