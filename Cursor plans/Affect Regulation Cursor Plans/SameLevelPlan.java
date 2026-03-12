/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
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
public plan SameLevelPlan extends Plan {

    #handles event SetLevelCursorsEvent ev1;
    #posts event SameLevelEvent sle;
    #posts event SetLevelCursorsEvent slce;
    #posts event ClearAffectHistoryEvent cahe;
    #uses interface NeonAffectAgent enc;
    #uses data AffectType affectType;
    #uses data AffectTypePrev affectTypePrev;
    #uses data AffectHistory affectHistory;
    #uses data CancelPlan cancelSameLevelPlan;
    #uses data NA_Debug debug;
    
    static boolean relevant(SetLevelCursorsEvent ev1)
    {
        return ev1.iCursorNumber == 4;
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
            setSameLevelCursors();
        }        
    }

    #reasoning method
    setSameLevelCursors()
    {   
        logical int $affect;
        
        logical boolean $debug;
        debug.get($debug).next();
         
        boolean bDebug = $debug.as_boolean();
        
        if (bDebug)
        { 
            System.out.println("Inside SameLevelPlan.");
        }
    
        int iAffect = 0;
        int iPrevAffect = 0;
        double dVelocity = 0.0d;
            
        AffectRegulationIntervalCursor c = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 6, 6, enc.GetAgent());
        AffectRegulationIntervalCursor c2 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 5, 5, enc.GetAgent());
        AffectRegulationIntervalCursor c3 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 4, 4, enc.GetAgent());
        AffectRegulationIntervalCursor c4 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 3, 3, enc.GetAgent());
        AffectRegulationIntervalCursor c5 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 2, 2, enc.GetAgent());
        AffectRegulationIntervalCursor c6 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, 1, 1, enc.GetAgent());
        AffectRegulationIntervalCursor c7 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -6, -6, enc.GetAgent());
        AffectRegulationIntervalCursor c8 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -5, -5, enc.GetAgent());
        AffectRegulationIntervalCursor c9 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -4, -4, enc.GetAgent());
        AffectRegulationIntervalCursor c10 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -3, -3, enc.GetAgent());
        AffectRegulationIntervalCursor c11 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -2, -2, enc.GetAgent());
        AffectRegulationIntervalCursor c12 = new AffectRegulationIntervalCursor(enc.affectHistoryCursorVar, -1, -1, enc.GetAgent());
    
        @parallel(ParallelFSM.FIRST, cancelSameLevelPlan.getValue(), new Exception("Increasing Negative Parallel exception"), null)
        {               
            try
            {
                while (true)
                {
                    @wait_for(c); //6 6
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c2); //5 5
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c3); //4 4
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c4); //3 3
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c5); //2 2 
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c6); //1 1
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c7); //-6 -6
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c8); //-5 -5
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c9); //-4 -4
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                    @wait_for(c10); //-3 -3
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
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
                 
            try
            {
                while (true)
                {
                    @wait_for(c11); //-2 -2
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
                    */
                   
                    enc.SetCursorAck(c11.GetCursorType(), c11.GetStartLevel(), c11.GetEndLevel(), true);
                    
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
                    @wait_for(c12); //-1 -1
                    
                    /*
                    affectType.get($affect).next();
                    int iAffect = $affect.as_int();
                               
                    affectTypePrev.get($affect).next();
                    int iPrevAffect = $affect.as_int();
                
                    dVelocity = enc.affectHistoryCursorVar.GetLevelVelocity();
                    sle.post(iAffect, iPrevAffect, dVelocity);
                    */
                   
                    enc.SetCursorAck(c12.GetCursorType(), c12.GetStartLevel(), c12.GetEndLevel(), true);
                    
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
            System.out.println("After SameLevelPlan wait_for.");
        }
    
    }

}
