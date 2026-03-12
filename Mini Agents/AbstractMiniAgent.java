/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import DebugLibrary.*;
import SetFormulaLibrary.*;
import WaitLibrary.*;
import aos.cojack.base.CatMan;
import aos.cojack.configuration.*;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.util.timer.DilatedClock;
import aos.jack.util.thread.Semaphore;
import aos.util.ThreadPool;
import java.util.*;

/**
 * 
 */
public agent AbstractMiniAgent extends Agent {
    #has capability WaitCapability wc;
    #has capability AbstractAffectCapability cap1;
    #has capability GetSetFormulasCapability gsfc;
    #private data PlansWithFormulas plansFormulas();
    #private data PlanContextName planContextName();
    #private data Behavior behaviorName();
    #agent data Semaphore mutex();
    #private data Semaphore mutex2();
    #global data NA_Debug debug(true);

    public AbstractMiniAgent(String name, String strInteractionType1, int iAffectType1, boolean bDebug1)
    {
        super(name);
        
        Init();
    
        iAffectType = iAffectType1;
        strInteractionType = strInteractionType1;
               
        bDebug = bDebug1;
    }
    private boolean bDebug = false;
    private int iAffectType = -1;
    private String strInteractionType = "";
    private ArrayList plansWithFormulas = new ArrayList();
    private ArrayList selectedPlans = new ArrayList();
    private String strBehavior = "";
    #uses taskmanager CatMan(this);
    private logical boolean $debug;

    public void Init()
    {        
        this.timer = new DilatedClock(1d, this.timer);
        this.timer.setTime(0L);        
    }

    public int GetAffectType()
    {
        return iAffectType;        
    }

    public String GetBehavior(String strModeratorType)
    {   
        try
        {          
            if (bDebug)
            { 
                System.out.println("Inside AddAffectHistoryPlan.");
            }
            
            ArrayList planNames = GetPlans();
                
            if (bDebug)
            {        
                System.out.println("Inside SetPlanContextPlan: printing plans:");    
        
                int iSize = planNames.size();        
                for(int i = 0; i < iSize; i++)        
                {        
                    String strPlanName = (String)planNames.get(i);
            
                    System.out.println("planName [" + strPlanName + "]");        
                }    
            }
            
            //get plans with formulas
            ArrayList planNamesWithFormulas = GetPlansWithFormulas(strModeratorType, planNames);
         
            if (bDebug)
            {
                int iSize = planNamesWithFormulas.size();
                System.out.println("Inside AbstractMiniAgent.GetBehavior: after call to GetPlansWithFormulas: planNamesWithFormulas size: " + Integer.toString(iSize));
            }
                        
            //calls openai api
            ArrayList selectedPlans = GetSelectedPlans(strInteractionType, planNamesWithFormulas);
            
            if (bDebug)
            {  
                int iSize = selectedPlans.size();
                System.out.println("Inside AbstractMiniAgent.GetBehavior: after GetSelectedPlans. size: " + Integer.toString(iSize));
            }
            
            int iSize = selectedPlans.size();
            for(int i = 0; i < iSize; i++)
            {
                Object[] items = (Object[])selectedPlans.get(i);
                       
                String strPlanName = (String)items[0];
                String strPlanFormula = (String)items[1];
                       
                if (bDebug)
                {
                    System.out.println("Inside AbstractMiniAgent.GetBehavior: SelectedPlan Name [" + strPlanName + "] Formula: [" + strPlanFormula + "]");
                }
                            
                SetCognitiveFormula(strModeratorType, strPlanName, strPlanFormula);
            }
            
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent.GetBehavior: before set plan context.");            
            }
        
            //set plan context
            postEvent(spce2.post(PlanConstants.ALL_PLANS));        
            mutex.threadWait();
        
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent.GetBehavior: before call to level plan.");             
            }
        
            if (bDebug)
            {         
                System.out.println("Inside AbstractMiniAgent.GetBehavior: event class name: [" + ev1.getClass().getName() + "]");
                System.out.println("Inside AbstractMiniAgent.GetBehavior: getting events.");
            }
    
            PostEvent();
    
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent.GetBehavior: before call to get behavior.");
            }
        
            //grab behavior beliefSet
            postEvent(gbe.post(iAffectType));        
            mutex.threadWait();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            mutex.signal();
        }
        
        return strBehavior;
    }

    public void PostEvent()
    {   
    
    }

    protected Event GetLevelEvent() throws Exception
    {        
        Event[] events = cap1.getAgent().getKnownEvents();
            
        int iSize = events.length;           
        for (int i = 0; i < iSize; i++)
        {        
            Event event1 = (Event)events[i];
                
            String strEventName = event1.getEventName();
             
            if (bDebug)
            {         
                System.out.println("Inside AbstractMiniAgent.GetBehavior: event name: [" + strEventName + "]");
            }
            
            if (strEventName.contains(Constants.NEON_LEVEL_EVENT) == true)
            {
                return event1;
            }
        }
        throw new Exception("AbstractMiniAgent: GetLeveLEvent: couldn't find level event!");
    }

    private ArrayList GetPlans()
    {   
        ArrayList ret = new ArrayList();
        
        try
        {   
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent: GetPlans");
            }
            
            Plan[] plans = cap1.getAgent().getKnownPlans();
        
            int iLength = plans.length;
            for(int i = 0; i < iLength; i++)
            {
                Plan plan1 = plans[i];
                
                String strPlanName = plan1.getPlanName();
                
                if (bDebug)
                {
                    System.out.println("Inside AbstractMiniAgent: GetPlans PlanName [" + strPlanName + "]");
                }
    
                if (PlanUtils.ContainsCorrectPlan(strPlanName))
                {
                    ret.add(strPlanName);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
        
        return ret;
    }

    private ArrayList GetPlansWithFormulas(String strModeratorType, ArrayList planNames)
    {
        try
        {        
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent: GetPlansWithFormulas before post strModeratorType [" + strModeratorType + "] plans.size: " + Integer.toString(planNames.size()));
            }
    
            //get formulas
            postEvent(gsfc.gfc.gfe.post(strModeratorType, planNames));
            mutex.threadWait();
        
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent: GetPlansWithFormulas before grab formula beliefset.");
            }
        
            //grab formulas
            postEvent(gpfe.post(iAffectType));
            mutex.threadWait();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            mutex.signal();
        }
        
        return plansWithFormulas;
    }

    private ArrayList GetSelectedPlans(String strInteractionType, ArrayList planNames)
    {               
        try
        {   
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent. before GetSelectPlans post plans.size: " + Integer.toString(planNames.size()));
            }
            
            postEvent(gspe.post(iAffectType, strInteractionType, planNames));
            mutex.threadWait();
        
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent. after GetSelectPlans post.");
            }
            
            if (bDebug)
            {
                System.out.println("Inside AbstractMiniAgent.GetSelectPlans: before return: selectedPlans.size: " + Integer.toString(selectedPlans.size()));
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
    
        return selectedPlans; 
    }

    public void SetSelectedPlans(ArrayList selectedPlans1)
    {   
        if (bDebug)
        { 
            System.out.println("Inside AbstractMiniAgent.SetSelectedPlans");
        
            int iSize = selectedPlans1.size();
            
            System.out.println("Inside AbstractMiniAgent.SetSelectedPlans: selectedPlans size: " + Integer.toString(iSize));
        }
        
        selectedPlans = (ArrayList)selectedPlans1.clone();        
    
        if (bDebug)
        { 
            System.out.println("Inside AbstractMiniAgent.SetSelectedPlans. after clone method");
        }
    }

    public void SetPlansWithFormulas(ArrayList plansWithFormulas1)
    {            
        if (bDebug)
        { 
            System.out.println("Inside AbstractMiniAgent.SetPlansWithFormulas");
        
            int iSize = plansWithFormulas1.size();
            
            System.out.println("Inside AbstractMiniAgent.SetPlanWithFormulas: size: " + Integer.toString(iSize));
        }
        
        plansWithFormulas = (ArrayList)plansWithFormulas1.clone();
    }

    public void SetBehavior(String strBehavior1)
    {
        strBehavior = strBehavior1;
    }

    public void SetReservoirFormula(String strModeratorType, String strPlanName, String strFormula)
    {
        postEvent(gsfc.sfc.srfe.post(strModeratorType, strPlanName, strFormula));
        mutex.threadWait();
    }

    public void SetCognitiveFormula(String strModeratorType, String strPlanName, String strFormula)
    {
        postEvent(gsfc.sfc.scfe.post(strModeratorType, strPlanName, strFormula));       
        mutex.threadWait();
    }

    public DebugBeliefSet GetDebugBeliefSetFormulaCap()
    {        
        return gsfc.sfc.dc.debug;       
    }

    public void SetDebug(boolean bDebug1)
    {
        bDebug = bDebug1;  
         
        postEvent(gsfc.sfc.dc.sde.post(bDebug1));
        mutex.threadWait();
    }

    public void Wait(double dValue1)
    {
        postEvent(wc.we.post(dValue1)); 
        mutex.threadWait();
    }

}
