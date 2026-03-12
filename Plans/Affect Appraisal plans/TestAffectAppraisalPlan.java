/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public plan TestAffectAppraisalPlan extends Plan {

    #handles event TestAffectAppraisalEvent taae;
    #posts event AddAppraisalEvent aae;
    #uses data Appraisals appraisals;
    #uses data NA_Debug debug;
    #uses data Semaphore mutex;
    #uses data Semaphore appraisalMutex;
    
    static boolean relevant(TestAffectAppraisalEvent taae)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    timeline1()
    {
        try
        {                 
            if (bDebug)
            {
                System.out.println("Timeline 1");
            }
            
            @post(aae.post(appraisalList.createRageAppraisal()));
            @wait_for(appraisalMutex.planWait()); 
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
            
            @post(aae.post(appraisalList.createVengefulAppraisal()));
            @wait_for(appraisalMutex.planWait());            
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
            
            @post(aae.post(appraisalList.createAngryAppraisal()));
            @wait_for(appraisalMutex.planWait());           
           
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }
            
            @post(aae.post(appraisalList.createDisgustAppraisal()));
            @wait_for(appraisalMutex.planWait());
           
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
            
            @post(aae.post(appraisalList.createSadAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
            }
    
            @post(aae.post(appraisalList.createMoodyAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
            }
            
            @post(aae.post(appraisalList.createAnticipationAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
            }
            
            @post(aae.post(appraisalList.createPleasedAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
            }
            
            @post(aae.post(appraisalList.createHappyAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
            }
            
            @post(aae.post(appraisalList.createElationAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 11");
            }
            
            @post(aae.post(appraisalList.createEuphoriaAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 12");
            }
            
            @post(aae.post(appraisalList.createAweAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

    #reasoning method
    timeline2()
    {
        try
        {           
            if (bDebug)
            {
                System.out.println("Timeline 2");
            }       
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 1");
            }
            
            @post(aae.post(appraisalList.createOverwhelmedAppraisal()));
            @wait_for(appraisalMutex.planWait()); 
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
            
            @post(aae.post(appraisalList.createPanicAppraisal()));
            @wait_for(appraisalMutex.planWait());            
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
            
            @post(aae.post(appraisalList.createTerrorAppraisal()));
            @wait_for(appraisalMutex.planWait());           
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }
            
            @post(aae.post(appraisalList.createFearAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
    
            @post(aae.post(appraisalList.createWarinessAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
            }
            
            @post(aae.post(appraisalList.createIrritationAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
            }
            
            @post(aae.post(appraisalList.createIndifferenceAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
            }
            
            @post(aae.post(appraisalList.createCuriosityAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
            }
            
            @post(aae.post(appraisalList.createSatisfactionAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
            }
            
            @post(aae.post(appraisalList.createAmazementAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 11");
            }
            
            @post(aae.post(appraisalList.createEagernessAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 12");
            }
            
            @post(aae.post(appraisalList.createExcitementAppraisal()));
            @wait_for(appraisalMutex.planWait());
           
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

    #reasoning method
    timeline3()
    {
        try
        {           
            if (bDebug)
            {
                System.out.println("Timeline 3");
            }        
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 1");
            }
            
            @post(aae.post(appraisalList.createObsessedAppraisal()));
            @wait_for(appraisalMutex.planWait()); 
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
            
            @post(aae.post(appraisalList.createBitternessAppraisal()));
            @wait_for(appraisalMutex.planWait());            
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
            
            @post(aae.post(appraisalList.createResentmentAppraisal()));
            @wait_for(appraisalMutex.planWait());           
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }
            
            @post(aae.post(appraisalList.createEnvyAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
    
            @post(aae.post(appraisalList.createJealousyAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
            }
            
            @post(aae.post(appraisalList.createInsecurityAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
            }
            
            @post(aae.post(appraisalList.createAcceptanceAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
            }
            
            @post(aae.post(appraisalList.createPeacefulnessAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
            }
            
            @post(aae.post(appraisalList.createInspiredAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
            }
            
            @post(aae.post(appraisalList.createGratitudeAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 11");
            }
            
            @post(aae.post(appraisalList.createConnectednessAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 12");
            }
            
            @post(aae.post(appraisalList.createWanderlustAppraisal()));
            @wait_for(appraisalMutex.planWait());
           
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
    }

    #reasoning method
    timeline4() 
    {
        try
        {
             if (bDebug)
             {
                  System.out.println("Timeline 4");
             }
             
             @post(aae.post(appraisalList.createHumiliationAppraisal())); 
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
             }
    
             @post(aae.post(appraisalList.createDenialAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
             }
    
             @post(aae.post(appraisalList.createHysteriaAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug) 
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
             }
    
             @post(aae.post(appraisalList.createDreadAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
             }
    
             @post(aae.post(appraisalList.createWorryAppraisal())); 
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
             }  
    
             @post(aae.post(appraisalList.createVulnerabilityAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
             }
    
             @post(aae.post(appraisalList.createReliefAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
             }
    
             @post(aae.post(appraisalList.createValuedAppraisal()));
             @wait_for(appraisalMutex.planWait()); 
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
             }
    
             @post(aae.post(appraisalList.createPrideAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
             }
    
             @post(aae.post(appraisalList.createConfidenceAppraisal()));
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 11");
             }
    
             @post(aae.post(appraisalList.createFearlessnessAppraisal()));  
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 12");
             }
    
             @post(aae.post(appraisalList.createSmugnessAppraisal())); 
             @wait_for(appraisalMutex.planWait());
    
             if (bDebug)
             {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
             }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline5()
    {
        try
        {
            if (bDebug)
            {
                System.out.println("Timeline 5");
            }
            
            @post(aae.post(appraisalList.createScornAppraisal())); 
            @wait_for(appraisalMutex.planWait());
             
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
            
            @post(aae.post(appraisalList.createContemptAppraisal())); 
            @wait_for(appraisalMutex.planWait());
             
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
             
            @post(aae.post(appraisalList.createContemptAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
            
            @post(aae.post(appraisalList.createPityAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }
            
            @post(aae.post(appraisalList.createDisappointmentAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
            
            @post(aae.post(appraisalList.createResignationAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
            }
            
            @post(aae.post(appraisalList.createHumbledAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
            }
            
            @post(aae.post(appraisalList.createDeterminationAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
            }
            
            @post(aae.post(appraisalList.createHopefulnessAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
            }
            
            @post(aae.post(appraisalList.createAdorationAppraisal()));
            @wait_for(appraisalMutex.planWait());
                
            if (bDebug)
            {
                 System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
            }
            
            @post(aae.post(appraisalList.createLoveAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("After setting emotion"); 
            }
    
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline6()  
    {
        try
        {
            if (bDebug)
            {
                System.out.println("Timeline 6");
            }
    
            @post(aae.post(appraisalList.createDepressedAppraisal()));  
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
    
            @post(aae.post(appraisalList.createRegretAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }
    
            @post(aae.post(appraisalList.createRemorseAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
    
            @post(aae.post(appraisalList.createGuiltAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 6");
            }
     
            @post(aae.post(appraisalList.createDoubtAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 7");
            }
    
            @post(aae.post(appraisalList.createConflictedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 8");
            }
    
            @post(aae.post(appraisalList.createAdmirationAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 9");
            }
    
            @post(aae.post(appraisalList.createDesireAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 10");
            }
    
            @post(aae.post(appraisalList.createLongingAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 11");
            }
    
            @post(aae.post(appraisalList.createLustAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 12");
            }
    
            @post(aae.post(appraisalList.createMovedAppraisal()));
            @wait_for(appraisalMutex.planWait());
       
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline7()
    {
        try
        {
            if (bDebug)
            {
                System.out.println("Timeline 7");
            }
    
            @post(aae.post(appraisalList.createTormentedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
    
            @post(aae.post(appraisalList.createAnguishAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
    
            @post(aae.post(appraisalList.createStunnedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4"); 
            }
    
            @post(aae.post(appraisalList.createDesperationAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
    
            @post(aae.post(appraisalList.createAnxietyAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline8()
    {
        try
        {
            if (bDebug)
            {
                System.out.println("Timeline 8");
            }
    
            @post(aae.post(appraisalList.createGriefAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
    
            @post(aae.post(appraisalList.createDevastationAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
    
            @post(aae.post(appraisalList.createDespairAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4"); 
            }
    
            @post(aae.post(appraisalList.createFlusteredAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 5");
            }
    
            @post(aae.post(appraisalList.createConfusionAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: After setting emotion");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline9()  
    {
        try 
        {
            if (bDebug)
            {
                System.out.println("Timeline 9");   
            }
    
            @post(aae.post(appraisalList.createImpatienceAppraisal())); 
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }  
    
            @post(aae.post(appraisalList.createFrustrationAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }  
    
            @post(aae.post(appraisalList.createAnnoyanceAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 4");
            }         
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline10() 
    {
        try
        {
            if (bDebug)
            {
                System.out.println("Timeline 10");  
            }
    
            @post(aae.post(appraisalList.createDefiantAppraisal()));
            @wait_for(appraisalMutex.planWait());
            
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 2");
            }
            
            @post(aae.post(appraisalList.createAppalledAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug) 
            {
                System.out.println("NeonAffectAgent.TestAffefctAppraisalPlan: 3");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline11()
    {   
        try
        {
    
            if (bDebug)
            {
                System.out.println("Timeline 11");
            }
    
            @post(aae.post(appraisalList.createSurprisedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Surprised emotion posted"); 
            }
    
            @post(aae.post(appraisalList.createInjusticeAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Injustice emotion posted");
            }
    
           @post(aae.post(appraisalList.createDiscouragedAppraisal()));
           @wait_for(appraisalMutex.planWait());
    
           if (bDebug)
           {
               System.out.println("Discouraged emotion posted"); 
           }
    
           @post(aae.post(appraisalList.createTrustAppraisal()));
           @wait_for(appraisalMutex.planWait());
    
           if (bDebug)
           {
               System.out.println("Trust emotion posted");
           }
    
       }
       catch (Exception e) 
       {
           e.printStackTrace(); 
       }
    }

    #reasoning method
    timeline12()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting pain appraisal");
            }
    
            @post(aae.post(appraisalList.createPainAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting macabre appraisal");
            }
    
            @post(aae.post(appraisalList.createMacabreAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting embarrassed appraisal");
            }
    
            @post(aae.post(appraisalList.createEmbarrassedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting fatigued appraisal");
            }
    
            @post(aae.post(appraisalList.createFatiguedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting aroused appraisal");
            }
    
            @post(aae.post(appraisalList.createArousedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting patience appraisal");
            }
    
            @post(aae.post(appraisalList.createPatienceAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting compassion appraisal");
            }
    
            @post(aae.post(appraisalList.createCompassionAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline13()
    {
        try
        {
    
            if (bDebug)
            {  
                System.out.println("Posting empathy appraisal");
            }
    
            @post(aae.post(appraisalList.createEmpathyAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting loyalty appraisal");  
            }
    
            @post(aae.post(appraisalList.createLoyaltyAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline14()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting defeated appraisal");
            }
    
            @post(aae.post(appraisalList.createDefeatedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting bored appraisal");
            }
    
            @post(aae.post(appraisalList.createBoredAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting dossatosfoed appraisal");
            }
    
            @post(aae.post(appraisalList.createDissatisfiedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting upset appraisal");
            }
    
            @post(aae.post(appraisalList.createUpsetAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting domineering appraisal");
            }
    
            @post(aae.post(appraisalList.createDomineeringAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting sexually excited appraisal");
            }
    
            @post(aae.post(appraisalList.createSexuallyExcitedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting interested appraisal");
            }
    
            @post(aae.post(appraisalList.createInterestedAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug)
            {
                System.out.println("Posting capable appraisal");
            }
    
            @post(aae.post(appraisalList.createCapableAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting affectionate appraisal");
            }
    
            @post(aae.post(appraisalList.createAffectionateAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting activated appraisal");
            }
    
            @post(aae.post(appraisalList.createActivatedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting impressed appraisal");
            }
    
            @post(aae.post(appraisalList.createImpressedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting wonder appraisal");
            }
    
            @post(aae.post(appraisalList.createWonderAppraisal()));
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline15()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting powerless appraisal");
            }
    
            @post(aae.post(appraisalList.createPowerlessAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting feeble appraisal");
            }
    
            @post(aae.post(appraisalList.createFeebleAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting insecure appraisal");
            }
    
            @post(aae.post(appraisalList.createInsecureAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting egotistical appraisal");
            }
    
            @post(aae.post(appraisalList.createEgotisticalAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting vigorous appraisal");
            }
    
            @post(aae.post(appraisalList.createVigorousAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting shy appraisal");
            }
    
            @post(aae.post(appraisalList.createShyAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting kind appraisal");
            }
    
            @post(aae.post(appraisalList.createKindAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug)
            {
                System.out.println("Posting friendly appraisal");
            }
    
            @post(aae.post(appraisalList.createFriendlyAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting carefree appraisal");
            }
    
            @post(aae.post(appraisalList.createCarefreeAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting devoted appraisal");
            }
    
            @post(aae.post(appraisalList.createDevotedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting in love appraisal");
            }
    
            @post(aae.post(appraisalList.createInLoveAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting mighty appraisal");
            }
    
            @post(aae.post(appraisalList.createMightyAppraisal()));
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline16()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting subdued appraisal");
            }
    
            @post(aae.post(appraisalList.createSubduedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting inhibited appraisal");
            }
    
            @post(aae.post(appraisalList.createInhibitedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting distessedappraisal");
            }
    
            @post(aae.post(appraisalList.createDistressedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting aggressive appraisal");
            }
    
            @post(aae.post(appraisalList.createAggressiveAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting serious appraisal");
            }
    
            @post(aae.post(appraisalList.createSeriousAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting useful appraisal");
            }
    
            @post(aae.post(appraisalList.createUsefulAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting responsible appraisal");
            }
    
            @post(aae.post(appraisalList.createResponsibleAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug)
            {
                System.out.println("Posting concentrating appraisal");
            }
    
            @post(aae.post(appraisalList.createConcentratingAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting enjoyment appraisal");
            }
    
            @post(aae.post(appraisalList.createEnjoymentAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting influential appraisal");
            }
    
            @post(aae.post(appraisalList.createInfluentialAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting bold appraisal");
            }
    
            @post(aae.post(appraisalList.createBoldAppraisal())); 
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline17()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting lonely appraisal");
            }
    
            @post(aae.post(appraisalList.createLonelyAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting listless appraisal");
            }
    
            @post(aae.post(appraisalList.createListlessAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting rejected appraisal");
            }
    
            @post(aae.post(appraisalList.createRejectedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting arrogant appraisal");
            }
    
            @post(aae.post(appraisalList.createArrogantAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting admired appraisal");
            }
    
            @post(aae.post(appraisalList.createAdmiredAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting alert appraisal");
            }
    
            @post(aae.post(appraisalList.createAlertAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting cooperative appraisal");
            }
    
            @post(aae.post(appraisalList.createCooperativeAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug)
            {
                System.out.println("Posting excited appraisal");
            }
    
            @post(aae.post(appraisalList.createExcitedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting joyful appraisal");
            }
    
            @post(aae.post(appraisalList.createJoyfulAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting powerful appraisal");
            }
    
            @post(aae.post(appraisalList.createPowerfulAppraisal()));
            @wait_for(appraisalMutex.planWait()); 
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline18()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting timid appraisal");
            }
    
            @post(aae.post(appraisalList.createTimidAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting meek appraisal");
            }
    
            @post(aae.post(appraisalList.createMeekAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting tense appraisal");
            }
    
            @post(aae.post(appraisalList.createTenseAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting controlling appraisal");
            }
    
            @post(aae.post(appraisalList.createControllingAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting dignified appraisal");
            }
    
            @post(aae.post(appraisalList.createDignifiedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting free appraisal");
            }
    
            @post(aae.post(appraisalList.createFreeAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting lucky appraisal");
            }
    
            @post(aae.post(appraisalList.createLuckyAppraisal()));
            @wait_for(appraisalMutex.planWait());
     
            if (bDebug)
            {
                System.out.println("Posting strong appraisal");
            }
    
            @post(aae.post(appraisalList.createStrongAppraisal()));
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline19()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting burdened appraisal");
            }
    
            @post(aae.post(appraisalList.createBurdenedAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting discontented appraisal");
            }
    
            @post(aae.post(appraisalList.createDiscontentedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting troubled appraisal");
            }
    
            @post(aae.post(appraisalList.createTroubledAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting thankful appraisal");
            }
    
            @post(aae.post(appraisalList.createThankfulAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting masterful appraisal");
            }
    
            @post(aae.post(appraisalList.createMasterfulAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting triumphant appraisal");
            }
    
            @post(aae.post(appraisalList.createTriumphantAppraisal())); 
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    timeline20()
    {
        try
        {
    
            if (bDebug)
            {
                System.out.println("Posting curious appraisal");
            }
    
            @post(aae.post(appraisalList.createCuriousAppraisal()));
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting self satisfied appraisal");
            }
    
            @post(aae.post(appraisalList.createSelfSatisfiedAppraisal())); 
            @wait_for(appraisalMutex.planWait());
    
            if (bDebug)
            {
                System.out.println("Posting fascinated appraisal");
            }
    
            @post(aae.post(appraisalList.createFascinatedAppraisal()));
            @wait_for(appraisalMutex.planWait());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    #reasoning method
    body()
    {
        try
        {
            logical boolean $debug;
            debug.get($debug).next();
        
            bDebug = $debug.as_boolean();
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.TestAffectAppraisalPlan");
            }        
                        
            timeline1();
            timeline2();
            timeline3();
            timeline4();
            timeline5();
            timeline6();
            timeline7();
            timeline8();
            timeline9();
            timeline10();
            timeline11();
            timeline12();
            timeline13();
            timeline14();  
            timeline15();
            timeline16();
            timeline17();
            timeline18();
            timeline19();
            timeline20();
        }
        catch (Exception e)
        {
            e.printStackTrace();            
        }
        finally
        {
            mutex.signal();            
        }
    }
    private boolean bDebug = false;
    private PersonalityTypeAppraisals appraisalList = new PersonalityTypeAppraisals();

}
