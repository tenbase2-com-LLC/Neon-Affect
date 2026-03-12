/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan GetSelectedPlansPlan extends Plan {

    #handles event GetSelectedPlansEvent gspe;
    #sends event PlanSelectorEvent pse;
    #uses interface AbstractMiniAgent enc;
    #uses data NA_Debug debug;
    #uses data Semaphore mutex;
    
    static boolean relevant(GetSelectedPlansEvent gspe)
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
                System.out.println("Inside GetSelectedPlansRagePlan: Agent: " + getAgent().getBasename());
            }
         
            if (bDebug)
            {
                System.out.println("Before GetSelectedPlans send to NeonPlanSelectorAgent.");
            }
    
            String strAffectName = AffectEnum.GetName(gspe.iAffect);
            String strInteractionType = gspe.strInteractionType;
            ArrayList plans = gspe.plans;
            
            int iSize = plans.size();
    
            if (bDebug)
            {
                System.out.println("Inside GetSelectedPlansRagePlan: strAffectName [" + strAffectName + "] strInteractionType [" + strInteractionType + "] plan size: [" + Integer.toString(iSize) + "]");
            }
                       
            //determine which plans to select
            PlanSelectorEvent pse = pse.post(strAffectName, strInteractionType, plans);
            
            @send(AgentNames.NeonPlanSelectorAgent, pse);  //NeonPlanSelectorAgent PlanSelectorPlan
            @wait_for(pse.replied());
            PlanSelectorReply reply = (PlanSelectorReply)pse.getReply();
    
            if (bDebug)
            {
                System.out.println("Inside GetSelectedPlansRagePlan: after reply.");
            }
                        
            if (bDebug)
            {
                int iSize = reply.selectedPlans.size();
                System.out.println("Inside GetSelectedPlansRagePlan: before set selected plans. size: " + Integer.toString(iSize));
            }
            
            enc.SetSelectedPlans(reply.selectedPlans);            
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        }
        finally
        {
            mutex.signal();
        }    
    }

}
