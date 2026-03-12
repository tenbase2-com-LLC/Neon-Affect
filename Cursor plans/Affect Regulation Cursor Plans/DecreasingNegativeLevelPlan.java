/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;


/**
 * 
 */
public plan DecreasingNegativeLevelPlan extends Plan {

    #handles event SetLevelCursorsEvent ev1;
    #posts event DecreasingNegativeLevelEvent dnle;
    #posts event SetLevelCursorsEvent slce;
    #posts event ClearAffectHistoryEvent cahe;
    #uses interface NeonAffectAgent enc;
    #uses data AffectType affectType;
    #uses data AffectHistory affectHistory;
    #uses data CancelPlan cancelDNLPlan;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetLevelCursorsEvent ev1)
    {
        return ev1.iCursorNumber == 1;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    body()
    {
        while(true)
        {
            setDecreasingNegativeCursors();
        }        
    }

    #reasoning method
    setDecreasingNegativeCursors()
    {   
        logical int $affect;
        
        logical boolean $debug;
        debug.get($debug).next();
         
        boolean bDebug = $debug.as_boolean();
        
        if (bDebug)
        { 
            System.out.println("Inside DecreasingNegativeLevelPlan.");
        }
    
        double dVelocity = 0.0d;
        
        AffectRegulationIntervalCursor c = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -6, -4, enc.GetAgent());
        AffectRegulationIntervalCursor c2 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -6, -3, enc.GetAgent());
        AffectRegulationIntervalCursor c3 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -6, -2, enc.GetAgent());
        AffectRegulationIntervalCursor c4 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -6, -1, enc.GetAgent());
        AffectRegulationIntervalCursor c5 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -5, -3, enc.GetAgent());
        AffectRegulationIntervalCursor c6 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -5, -2, enc.GetAgent());
        AffectRegulationIntervalCursor c7 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -5, -1, enc.GetAgent());
        AffectRegulationIntervalCursor c8 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -4, -2, enc.GetAgent());
        AffectRegulationIntervalCursor c9 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -4, -1, enc.GetAgent());
        AffectRegulationIntervalCursor c10 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -3, -1, enc.GetAgent());
        
        @parallel(ParallelFSM.FIRST, cancelDNLPlan.getValue(), new Exception("Increasing Negative Parallel exception"), null)
        {               
            try
            {
                while (true)
                {
                    @wait_for(c); //-6 -4
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
    
                    enc.SetCursorAck(c.GetCursorType(), c.GetStartLevel(), c.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                   
                }                
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c2); //-6 -3
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
                    
                    enc.SetCursorAck(c2.GetCursorType(), c2.GetStartLevel(), c2.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                    
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c3); //-6 -2
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
    
                    enc.SetCursorAck(c3.GetCursorType(), c3.GetStartLevel(), c3.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                     
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c4); //-6 -1
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
                   
                    enc.SetCursorAck(c4.GetCursorType(), c4.GetStartLevel(), c4.GetEndLevel(), true);
    
                     //clear affect history beliefset
                    @subtask(cahe.post());    
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                 
            try
            {
                while (true)
                {
                    @wait_for(c5); //-5 -3
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
     
                    enc.SetCursorAck(c5.GetCursorType(), c5.GetStartLevel(), c5.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());   
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c6); //-5 -2
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
                    
                    enc.SetCursorAck(c6.GetCursorType(), c6.GetStartLevel(), c6.GetEndLevel(), true);
    
                      //clear affect history beliefset
                    @subtask(cahe.post());   
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c7); //-5 -1
    
                    /*  
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
    
                    enc.SetCursorAck(c7.GetCursorType(), c7.GetStartLevel(), c7.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());   
                }
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c8); //-4 -2
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
    
                    enc.SetCursorAck(c8.GetCursorType(), c8.GetStartLevel(), c8.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                      
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c9); //-4 -1
     
                    /*                     
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
                   
                    enc.SetCursorAck(c9.GetCursorType(), c9.GetStartLevel(), c9.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                     
                }  
            }
            catch (Exception e)
            {
                return true;
            }
                
            try
            {
                while (true)
                {
                    @wait_for(c10); //-3 -1
    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
      
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    dnle.post(iAffect, dVelocity);
                    */
    
                    enc.SetCursorAck(c10.GetCursorType(), c10.GetStartLevel(), c10.GetEndLevel(), true);
    
                    //clear affect history beliefset
                    @subtask(cahe.post());                    
                }  
            }
            catch (Exception e)
            {
                return true;
            }
            
        };
        
        //clear affect history beliefset
        @subtask(cahe.post());  
                
        if (bDebug)
        {
            System.out.println("After DecreasingNegativeLevelPlan wait_for.");
        }
    
    }

}
