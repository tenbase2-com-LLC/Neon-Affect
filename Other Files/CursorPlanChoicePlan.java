/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.util.thread.Semaphore;
import java.util.*;

/**
 * 
 */
public plan CursorPlanChoicePlan extends Plan {

    #handles event CursorPlanChoiceEvent cpce;
    #posts event SetPlanContextEvent spce;
    #posts event Level6NegAffectEvent ev1;
    #posts event Level5NegAffectEvent ev2;
    #posts event Level4NegAffectEvent ev3;
    #posts event Level3NegAffectEvent ev4;
    #posts event Level2NegAffectEvent ev5;
    #posts event Level1NegAffectEvent ev6;
    #posts event Level1PosAffectEvent ev7;
    #posts event Level2PosAffectEvent ev8;
    #posts event Level3PosAffectEvent ev9;
    #posts event Level4PosAffectEvent ev10;
    #posts event Level5PosAffectEvent ev11;
    #posts event Level6PosAffectEvent ev12;
    #posts event SameLevelEvent sle;
    #posts event DecreasingPositiveLevelEvent dple;
    #posts event IncreasingPositiveLevelEvent iple;
    #posts event DecreasingNegativeLevelEvent dnle;
    #posts event IncreasingNegativeLevelEvent inle;
    #posts event ExtremeLevelEvent ele;
    #sends event DecideEvent de;
    #uses interface NeonAffectAgent enc;
    #uses data PlanContextName planContextName;
    #uses data Semaphore mutex2;
    #uses data Semaphore mutex3;
    #uses data NA_Debug debug;
    
    static boolean relevant(CursorPlanChoiceEvent cpce)
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
            logical int $affect;
            logical double $emotion;
            
            logical boolean $debug;
            debug.get($debug).next();
            
            boolean bDebug = $debug.as_boolean();
          
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan.");
            }            
              
            int iLevel = cpce.iLevel;            
            int iAffect = cpce.iAffect; 
            
            //use orig levels
            iLevel = enc.GetOrigLevel(iAffect);
            
            double dEmotion = cpce.dEmotion;
            
            Hashtable cursorAcks = enc.cursorAcks;
            
            double dVelocity = 0.0;
     
            String strPlanName = "";
     
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan: List of Cursors:\n");
     
                for (Enumeration e = cursorAcks.elements(); e.hasMoreElements();)
                {
                    AckVar ackVar = (AckVar)e.nextElement();
                    if (ackVar.GetValue() == true)
                    {
                        System.out.println(ackVar);
                    }
                }
            }
           
            boolean bLevelOnly = false;
            boolean bExtremeOnly = false;
            boolean bAffectRegulationOnly = false;
            boolean bLevelAndExtreme = false;
            boolean bLevelAndAffect = false;            
            
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan. before send call to AffectDeciderAgent.");
            }
            
            Event levelEvent = null; //level
            Event affectRegEvent = null; //affect regulation
            Event extremeEvent = null; //extreme
            
            DecideEvent de = de.post();
            
            @send(AgentNames.NeonAffectDeciderAgent, de);  //NeonAffectDeciderAgent DecidePLan          
            @wait_for(de.replied());
            DecideReply reply = (DecideReply)de.getReply();
            
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan. after AffectDeciderAgent reply.");
            }
            
            bLevelOnly = reply.bLevelOnly;
            bLevelAndAffect = reply.bLevelAndAffect;
            bLevelAndExtreme = reply.bLevelAndExtreme;
            
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan. before call to set plan context: [" + Integer.toString(iAffect) + "]");
            }
            
            @post(spce.post(iAffect)); //set plan context
            @wait_for(mutex2.planWait());
            
            if (bDebug)
            {
                System.out.println("Inside CursorPlanChoicePlan. after call to set plan context: Level [" + Integer.toString(iLevel) + "]");
            }
            
            if (!bLevelOnly)
            {
                dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();                
            }
            
            if (bLevelOnly || bLevelAndAffect || bLevelAndExtreme)
            {
            
            switch (iLevel)
            { 
                case CursorEnum.iLEVEL_CURSOR_NEG_6:
                    levelEvent = ev1.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_NEG_5:
                    levelEvent = ev2.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_NEG_4:
                    levelEvent = ev3.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_NEG_3:
                    levelEvent = ev4.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_NEG_2:
                    levelEvent = ev5.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_NEG_1:
                    levelEvent = ev6.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_1:
                                
                    if (bDebug)
                    {
                        System.out.println("Inside CursorPlanChoicePlan. creating level 1 event. iAffect [" + Integer.toString(iAffect) + "]");
                    }
            
                    levelEvent = ev7.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_2:
                    levelEvent = ev8.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_3:
                    
                    if (bDebug)
                    {
                        System.out.println("Inside CursorPlanChoicePlan. creating level 3 event. iAffect [" + Integer.toString(iAffect) + "]");
                    }
                    
                    levelEvent = ev9.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_4:
                    levelEvent = ev10.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_5:
            
                    if (bDebug)
                    {
                        System.out.println("Inside CursorPlanChoicePlan. creating level 5 event. iAffect [" + Integer.toString(iAffect) + "]");
                    }
            
                    levelEvent = ev11.post(iAffect);
                    break;
                case CursorEnum.iLEVEL_CURSOR_POS_6:
                    levelEvent = ev12.post(iAffect);
                    break;    
                }
            }
                        
            if (bExtremeOnly || bLevelAndExtreme)
            {
                //ev5 = ele.post(iBegLevel, iEndLevel, iAffect, dVelocity);                
            }
            
            if (bLevelOnly)
            {       
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. before subtask call using level event."); 
                }
             
                int iCount = planContextName.nFacts();
                
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. number of planContextNames: " + Integer.toString(iCount)); 
                }
                
                logical String $name;
                
                for (int i = 0; i < iCount; i++)
                {
                    @subtask(levelEvent); //level
                    //@wait_for(mutex.planWait());
                    
                    //delete first planContextName
                    if (i != 0)
                    {
                        planContextName.get(i, $name);
                        planContextName.add(0, $name.as_string());
                    }
                }
                 
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. after subtask call.");
                }     
            }
            else if (bLevelAndAffect)
            {
                @subtask(levelEvent); //level
                //@wait_for(mutex.planWait());
                
                //@subtask(); //affect regulation                  
            }
            else if (bLevelAndExtreme)
            {
                @subtask(levelEvent); //level
                //@wait_for(mutex.planWait());
                //@subtask(); //extreme                
            }
            else if (bExtremeOnly)
            {
                //@subtask(); //extreme                 
            }
            else if (bAffectRegulationOnly)
            {
                //@subtask(); //affect regulation                
            }
    
       
            /*
            for (Signature s = ev.applicable.first();
                    s != null;
                    s = ev.applicable.next(s)
                )
                {       
                    
                    String strPlanChoiceSelected = s.getPlanName().toString();
                    
                    if (bDebug)
                    {
                        System.out.println("Signature: " + strPlanChoiceSelected);
                    }                
                
                    if (strPlanChoiceSelected.equals(strPlanName))
                    {
                        if (bDebug)
                        {
                            System.out.println("Choosing Signature: " + strPlanChoiceSelected);
                        }
      
                        ev.chosen = s;
                        
                        return true;   
                    }                    
                }
                */
                
                //post message here
                
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            mutex3.signal();           
        }
    }

}
