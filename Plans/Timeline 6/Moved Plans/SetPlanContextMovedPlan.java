/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.plan.Plan;
import aos.jack.util.thread.Semaphore;
import aos.util.ThreadPool;
import java.util.*;

/**
 * 
 */
public plan SetPlanContextMovedPlan extends Plan {

    #handles event SetPlanContextEvent spce;
    #sends event ContextEvent ce;
    #uses interface NeonAffectAgent enc;
    #uses data PlanContextName planContextName;
    #uses data Semaphore mutex2;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetPlanContextEvent spce)
    {
        return spce.iAffect == AffectEnum.MOVED;
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
        catch (BeliefSetException bse)
        {
            bse.printStackTrace();            
        }
            
            if (bDebug)
            {
                System.out.println("Inside SetPlanContextMovedPlan.");
            }   
      
            boolean bVerbal = false;
            boolean bNonverbal = false;
            boolean bAction = false;
        
            String strPlanSelected = "";
        
            //determine type of plan (verbal, nonverbal, action)
            ContextEvent ce = ce.post();
            
            @send(AgentNames.NeonContextComputeAgent, ce);  //NeonContextComputeAgent ComputePlan           
            @wait_for(ce.replied());
            ContextReply reply = (ContextReply)ce.getReply();
                       
            if (bDebug)
            {
                System.out.println("Inside SetPlanContextMovedAgent. after ContextComputeAgent reply.");
            }
            
            bVerbal = reply.bVerbal;
            bNonverbal = reply.bNonverbal;
            bAction = reply.bAction;
     
            ThreadPool tp = enc.GetPlanContextThreadPool();
     
            @action(tp)
            {
                try
                {            
                    //if verbal 
                    if (bVerbal)
                    {   
                        //cteate moderator type                        
                        String strModeratorType = AffectEnum.GetName(AffectEnum.MOVED) + AffectEnum.VERBAL;                                        
                        
                        String strParameterGroup = Constants.NEON + strModeratorType;
    
                        strPlanSelected = new NeonMovedAgent(strParameterGroup, AffectEnum.VERBAL, bDebug).GetBehavior(strModeratorType);
                        
                        planContextName.add(planContextName.nFacts(), strPlanSelected);
                        
                        enc.AddBehavior(strPlanSelected);                        
                                      
                        if (bDebug)
                        {
                            System.out.println("Inside SetPlanContextMovedPlan: verbal plan selected [" + strPlanSelected + "]");
                        }
                    }
     
                    //if nonverbal 
                    if (bNonverbal)
                    {
                        String strModeratorType = AffectEnum.GetName(AffectEnum.MOVED) + AffectEnum.NONVERBAL;                                        
                        
                        String strParameterGroup = Constants.NEON + strModeratorType;
    
                        strPlanSelected = new NeonMovedAgent(strParameterGroup, AffectEnum.NONVERBAL, bDebug).GetBehavior(strModeratorType);
                        
                        planContextName.add(planContextName.nFacts(), strPlanSelected);
                        
                        enc.AddBehavior(strPlanSelected);                        
                                      
                        if (bDebug)
                        {
                            System.out.println("Inside SetPlanContextMovedPlan: verbal plan selected [" + strPlanSelected + "]");
                        }
                    }
    
                    //if action 
                    if (bAction)
                    {
                        String strModeratorType = AffectEnum.GetName(AffectEnum.MOVED) + AffectEnum.ACTION;                                        
                    
                        String strParameterGroup = Constants.NEON + strModeratorType;
    
                        strPlanSelected = new NeonMovedAgent(strParameterGroup,  AffectEnum.ACTION, bDebug).GetBehavior(strModeratorType);
                        
                        planContextName.add(planContextName.nFacts(), strPlanSelected);
                        
                        enc.AddBehavior(strPlanSelected);                        
                                      
                        if (bDebug)
                        {
                            System.out.println("Inside SetPlanContextMovedPlan: verbal plan selected [" + strPlanSelected + "]");
                        }
                    }
              
                    //analyze/select combinations of plasn
        
                    if (bDebug)
                    {
                        System.out.println("Inside SetPlanContextMovedPlan: Set plan context nFacts [" + Integer.toString(planContextName.nFacts()) + "]");
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();                    
                }
                finally
                {
                    mutex2.signal();   
                }
            };
    }
    private boolean bDebug = false;

}
