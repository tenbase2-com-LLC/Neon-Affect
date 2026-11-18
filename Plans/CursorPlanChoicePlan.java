/*******************************************************************
 * Created by the JDE: Wed Nov 18 09:22:18 EDT 2026
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
    #posts event AffectEvent aev;
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
            
            // the run-time (personality-adjusted) level travels on the AffectEvent;
            // GetOrigLevel is no longer needed to route it to the right capability
            
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
            
            //mixed emotions: is the other valence also in a level band right now?
            int iOtherAffect = (iLevel > 0) ? enc.GetNegativeAffect() : enc.GetPositiveAffect();
            double dOther = (iLevel > 0) ? enc.GetNegativeReservoirValue() : enc.GetPositiveReservoirValue();
            int iOtherLevel = LevelClassifier.GetLevel(dOther);
            boolean bMixed = (iOtherLevel != 0 && iOtherAffect >= 0 && iOtherAffect != iAffect);

            String strBehavior1 = "";
            String strBehavior2 = "";

            if (bMixed)
            {
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. mixed: affect [" + Integer.toString(iAffect) + "] level [" + Integer.toString(iLevel) + "] with affect [" + Integer.toString(iOtherAffect) + "] level [" + Integer.toString(iOtherLevel) + "]");
                }

                //one channel per emotion, chosen together
                String[] channels = null;
                AffectHistoryBehaviors ahb = enc.GetAffectHistoryBehaviors();
                String strPersonalityType = enc.GetPersonalityType();

                @action()
                {
                    channels = JevChannelSelector.SelectPair(iAffect, iLevel, iOtherAffect, iOtherLevel, ahb.GetAffectHistory(), ahb.GetBehaviorList(), strPersonalityType, bDebug);
                };

                //each emotion's own SetPlanContextXxxPlan and mini agent, in its assigned channel;
                //each appends its chosen behavior at the end of planContextName
                int iFirst = planContextName.nFacts();
                logical String $chosen1;
                logical String $chosen2;

                enc.SetAssignedChannel(channels[0]);
                enc.SetCoEmotion(JevChannelSelector.Describe(iOtherAffect, iOtherLevel));
                @post(spce.post(iAffect)); //set plan context
                @wait_for(mutex2.planWait());

                enc.SetAssignedChannel(channels[1]);
                enc.SetCoEmotion(JevChannelSelector.Describe(iAffect, iLevel));
                @post(spce.post(iOtherAffect)); //set plan context
                @wait_for(mutex2.planWait());

                enc.SetAssignedChannel(null);
                enc.SetCoEmotion("");

                if (planContextName.get(iFirst, $chosen1).next())
                {
                    strBehavior1 = $chosen1.as_string();
                }
                if (planContextName.get(iFirst + 1, $chosen2).next())
                {
                    strBehavior2 = $chosen2.as_string();
                }
            }
            else
            {
                //the behavior this cycle's SetPlanContextXxxPlan appends. planContextName is
                //never cleared, so its first fact is a stale behavior from an earlier cycle.
                int iFirstSingle = planContextName.nFacts();
                logical String $chosenSingle;

                @post(spce.post(iAffect)); //set plan context
                @wait_for(mutex2.planWait());

                if (planContextName.get(iFirstSingle, $chosenSingle).next())
                {
                    strBehavior1 = $chosenSingle.as_string();
                }
            }
            
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
            
            levelEvent = aev.post(iAffect, iLevel);
            }
                        
            if (bExtremeOnly || bLevelAndExtreme)
            {
                //ev5 = ele.post(iBegLevel, iEndLevel, iAffect, dVelocity);                
            }
            
            if (bMixed)
            {
                //run each emotion's chosen behavior in the main agent: the plan context
                //names the behavior, the AffectEvent selects the emotion's capability
                if (!strBehavior1.equals(""))
                {
                    planContextName.add(0, strBehavior1);
                    @subtask(aev.post(iAffect, iLevel));
                }
                if (!strBehavior2.equals(""))
                {
                    planContextName.add(0, strBehavior2);
                    @subtask(aev.post(iOtherAffect, iOtherLevel));
                }

                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. mixed response [" + strBehavior1 + "] + [" + strBehavior2 + "]");
                }
            }
            else if (bLevelOnly)
            {
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. before subtask call using level event.");
                }
             
                //run THIS cycle's behavior. (This used to replay every fact of planContextName,
                //starting with fact 0 - a stale behavior from an earlier cycle.)
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. behavior [" + strBehavior1 + "]");
                }

                if (!strBehavior1.equals(""))
                {
                    planContextName.add(0, strBehavior1);
                    @subtask(levelEvent); //level
                }
                 
                if (bDebug)
                {
                    System.out.println("Inside CursorPlanChoicePlan. after subtask call.");
                }     
            }
            else if (bLevelAndAffect)
            {
                planContextName.add(0, strBehavior1);
                @subtask(levelEvent); //level
                //@wait_for(mutex.planWait());
                
                //@subtask(); //affect regulation                  
            }
            else if (bLevelAndExtreme)
            {
                planContextName.add(0, strBehavior1);
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

