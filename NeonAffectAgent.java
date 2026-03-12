/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import ReservoirLibrary.*;
import WaitLibrary.*;
import aos.cojack.base.CatMan;
import aos.cojack.configuration.*;
import aos.jack.jak.event.PlanChoice;
import aos.jack.jak.util.timer.DilatedClock;
import aos.jack.util.thread.Semaphore;
import aos.util.ThreadPool;
import java.lang.NoSuchMethodException;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * 
 */
public agent NeonAffectAgent extends Agent {
    #has capability NeonAffectCapability nac;
    #has capability WaitCapability wc;
    #private data Emotion emotion();
    #private data PersonalityType personalityType();
    #private data AffectType affectType();
    #private data PlanContextName planContextName();
    #private data Behavior behaviorName();
    #private data Semaphore mutex();
    #private data Semaphore mutex2();
    #private data Semaphore mutex3();
    #private data Semaphore mutex4();
    #private data Semaphore mutex5();
    #private data Semaphore mutex6();
    #private data Expectancy expectancy();
    #private data Outcome outcome();
    #private data Appraisals appraisals();
    #private data Appraisals appraisalSims();
    #global data NA_Debug debug(true);

    public NeonAffectAgent()
    {
        super("NeonAffectGroup");
        Init();
        CreateAgents();
    }
    private ThreadPool pctp = new ThreadPool(10);
    private String strPersonalityType = "";
    public ReservoirAgent riskTakingEuhporia = null;
    private NeonAffectDeciderAgent affectDeciderAgent = null;
    private NeonInteractionComputeAgent interactionComputeAgent = null;
    private NeonPlanSelectorAgent planSelectorAgent = null;
    public static int iMaxNegLevel = -6;
    public static int iMaxPosLevel = 6;
    private boolean bDebug = true;
    public EmotionCursorVar emotionCursorVar = new EmotionCursorVar();
    public AffectHistoryCursorVar affectHistoryCursorVar = new AffectHistoryCursorVar();
    public AckCursorVar ackCursorVar = null;
    public Hashtable cursorAcks = new Hashtable();
    private int iNumberOfCursors = 0;
    private String strBehavior = null;
    private ArrayList affectTimelineList = new ArrayList();
    private ArrayList origAffectTimelineList = new OrigAffectLevels().GetLevels();
    private int iMappedAffect = -1;
    private ArrayList behaviorList = new ArrayList();
    private ArrayList affectHistoryItems = new ArrayList();
    private java.util.concurrent.Semaphore emotionMutex = new java.util.concurrent.Semaphore(1);
    #uses taskmanager CatMan(this);

    public void Init()
    {
        this.timer = new DilatedClock(1d, this.timer);
        this.timer.setTime(0L);
        
        ackCursorVar = new AckCursorVar(cursorAcks);
       
        mutex5.signal();
        
        //AddAffectAppraisalCriteria();
    }

    private void CreateAgents()
    {       
        riskTakingEuhporia = new ReservoirAgent("GeorgeRiskTakingEuphoria", 2.0);
        affectDeciderAgent = new NeonAffectDeciderAgent(AgentNames.NeonAffectDeciderAgent, GetAgent());
        interactionComputeAgent = new NeonInteractionComputeAgent(AgentNames.NeonInteractionComputeAgent, GetAgent());
        planSelectorAgent = new NeonPlanSelectorAgent(AgentNames.NeonPlanSelectorAgent, GetAgent(), pctp);
    }

    private void CreateCursorAcks()
    {   
        cursorAcks = new Hashtable();
        ackCursorVar = new AckCursorVar(cursorAcks);        
    }

    /*
    private void AddAffectAppraisalCriteria()
    {       
        postEvent(nac.aace.post(strPersonalityType));
        mutex.threadWait();  
    }
    */
    
    private void CreateAffectMapping(String strPersonalityType) throws IllegalArgumentException
    {
        switch (strPersonalityType)
        {
            case MBPT_Enum.ENFJ:
                affectTimelineList = new ENFJ_AffectLevels().GetLevels();
                break;
        
            case MBPT_Enum.ENFP:
                affectTimelineList = new ENFP_AffectLevels().GetLevels();
                break;
            
            case MBPT_Enum.ENTJ:
                affectTimelineList = new ENTJ_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ENTP:
                affectTimelineList = new ENTP_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ESFJ:
                affectTimelineList = new ESFJ_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ESFP:
                affectTimelineList = new ESFP_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ESTJ:
                affectTimelineList = new ESTJ_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ESTP:
                affectTimelineList = new ESTP_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.INFJ:
                affectTimelineList = new INFJ_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.INFP:
                affectTimelineList = new INFP_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.INTJ:
                affectTimelineList = new INTJ_AffectLevels().GetLevels();
                break;
                
            case MBPT_Enum.INTP:
                affectTimelineList = new INTP_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ISFJ:
                affectTimelineList = new ISFJ_AffectLevels().GetLevels();
                break;
                
            case MBPT_Enum.ISFP:
                affectTimelineList = new ISFP_AffectLevels().GetLevels();
                break;
                
            case MBPT_Enum.ISTJ:
                affectTimelineList = new ISTJ_AffectLevels().GetLevels();
                break;
    
            case MBPT_Enum.ISTP:
                affectTimelineList = new ISTP_AffectLevels().GetLevels();
                break;
            
            default:
                throw new IllegalArgumentException("Invalid MBTI personality type: " + strPersonalityType);            
        }
    }

    public void PostInit()
    {
        SetPersonalityType();
        CreateAffectMapping(strPersonalityType);
        StartGrabbingValues();        
    }

    public ThreadPool GetPlanContextThreadPool()
    {
        return pctp;        
    }

    public void SetPersonalityType()
    {
        postEvent(nac.spte.post());
        mutex.threadWait();        
    }

    public String GetPersonalityType()
    {
        return strPersonalityType;        
    }

    public void SetPersonalityType(String strPersonalityType1)
    {
        strPersonalityType = strPersonalityType1;
    }

    public void TestAffectAppraisal()
    {
        postEvent(nac.aac.taae.post());
        mutex.threadWait();    
    }

    public void TestAffectlevels()
    {
        System.out.println(MBPT_Enum.ENFJ + " Number of levels: " + new ENFJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ENFP + " Number of levels: " + new ENFP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ENTJ + " Number of levels: " + new ENTJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ENTP + " Number of levels: " + new ENTP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ESFJ + " Number of levels: " + new ESFJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ESFP + " Number of levels: " + new ESFP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ESTJ + " Number of levels: " + new ESTJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ESTP + " Number of levels: " + new ESTP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.INFJ + " Number of levels: " + new INFJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.INFP + " Number of levels: " + new INFP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.INTJ + " Number of levels: " + new INTJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.INTP + " Number of levels: " + new INTP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ISFJ + " Number of levels: " + new ISFJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ISFP + " Number of levels: " + new ISFP_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ISTJ + " Number of levels: " + new ISTJ_AffectLevels().GetLevels().size());
        System.out.println(MBPT_Enum.ISTP + " Number of levels: " + new ISTP_AffectLevels().GetLevels().size());
    }

    public void CountAffectLevels()
    {
        System.out.println("\nAffect Counts by MBTI Type");
        System.out.println("========================\n");
        
        // Print counts for each type
        printTypeAffectCounts(MBPT_Enum.ENFJ, new ENFJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ENFP, new ENFP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ENTJ, new ENTJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ENTP, new ENTP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ESFJ, new ESFJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ESFP, new ESFP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ESTJ, new ESTJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ESTP, new ESTP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.INFJ, new INFJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.INFP, new INFP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.INTJ, new INTJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.INTP, new INTP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ISFJ, new ISFJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ISFP, new ISFP_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ISTJ, new ISTJ_AffectLevels().GetLevels());
        printTypeAffectCounts(MBPT_Enum.ISTP, new ISTP_AffectLevels().GetLevels());
    }

    private void Hashtable countAffects(ArrayList affectTimelineList)
    {
        Hashtable counts = new Hashtable();
        
        for (int i = 0; i < affectTimelineList.size(); i++) {
            Object[] entry = (Object[])affectTimelineList.get(i);
            Integer affect = (Integer)entry[2];
            
            Integer count = (Integer)counts.get(affect);
            if (count == null) {
                counts.put(affect, new Integer(1));
            } else {
                counts.put(affect, new Integer(count.intValue() + 1));
            }
        }
        
        return counts;
    }

    private void printTypeAffectCounts(String type, ArrayList affectTimelineList) {
        System.out.println(type + " Affects:");
        System.out.println("Total affects: " + affectTimelineList.size());
        
        Hashtable counts = countAffects(affectTimelineList);
        
        Enumeration affects = counts.keys();
        while (affects.hasMoreElements()) {
            Integer affect = (Integer)affects.nextElement();
            try {
                System.out.println("  " + AffectEnum.GetName(affect.intValue()) + 
                    ": " + counts.get(affect));
            } catch (Exception e) {
                System.out.println("  Affect " + affect + ": " + counts.get(affect));
            }
        }
        System.out.println();
    }

    public void StartGrabbingValues()
    { 
        ((DilatedClock)this.timer).setDilation(100d);
        postEvent(nac.ire.post()); //init reservoir
        mutex.threadWait();
    
        postEvent(nac.sce.post()); //set cursors
        mutex.threadWait();
        ((DilatedClock)this.timer).setDilation(1d);
     
        if (bDebug)
        {
            System.out.println("StartGrabbingValues: Number of cursors: " + GetNumberOfCursors());
        }
     
        postEvent(nac.grve.post()); //grabs values
    }

    public double GetReservoirValue() throws NoSuchMethodException
    {
        String NEON_PARAMETER = "neon_parameter";
           
        long lTime = this.timer.getTime();
            
        ValueCalculator vc = Configuration.getValueCalculator(this.getId(), "NeonAffectAgent", NEON_PARAMETER);
        double v = vc.getValueDoubleAt(lTime);
        System.out.println("PosNegEmotion's "+NEON_PARAMETER+" value: " + v + "\n");
        
        return v;
    }

    public void SetMappedAffect(int iAffect1)
    {
        iMappedAffect = iAffect1;       
    }

    public void SetEmotionValue(double dValue1)
    {
        emotionCursorVar.SetValue(dValue1);        
    }

    public void AddAffectHistoryValue(AffectHistoryVar item)
    {
        affectHistoryCursorVar.SetValue(item);
    }

    public void AddPositiveEmotion(int iAffect, double dAmount)
    {        
        try
        {   
            emotionMutex.acquire();
            
            if (bDebug)
            {
                System.out.println("Inside AddPositiveEmotion."); 
            }
            
            CreateCursorAcks();
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AddPositiveEmotion: iAffect: " + Integer.toString(iAffect) + " dAmount " + Double.toString(dAmount));
            }
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent: before call to MapAffect.");
            }
        
            postEvent(nac.mae.post(iAffect, dAmount)); //map affect to reservoir
            mutex4.threadWait();
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent: after call to MapAffect.");
            }   
        
            postEvent(nac.aee.post("NeonAffectReservoir", dAmount, true)); //add value to reservoir        
            mutex4.threadWait(); 
        }
        catch (Exception e)
        {
            
        }
        finally
        {       
            emotionMutex.release();
        }
    }

    public void AddNegativeEmotion(int iAffect, double dAmount)
    {       
        try
        {   
            emotionMutex.acquire();
            
            CreateCursorAcks();
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AddNegativeEmotion: iAffect: " + Integer.toString(iAffect) + " dAmount " + Double.toString(dAmount));
            }
        
            if (dAmount >= 0)
            {
                dAmount *= -1;  
            }
        
            postEvent(nac.mae.post(iAffect, dAmount)); //map affect to reservoir
            mutex4.threadWait(); 
        
            postEvent(nac.aee.post("NeonAffectReservoir", dAmount, true));  //add value to reservoir
            mutex4.threadWait();
        }
        catch (Exception e)
        {
            
        }    
        finally
        {        
            emotionMutex.release();    
        }
    }

    public void AddEmotionDirect(int iAffect) throws Exception
    {        
        try
        {
            emotionMutex.acquire();
            
            if (bDebug)
            {
                System.out.println("Inside AddEmotionDirect"); 
            }
            
            CreateCursorAcks();
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AddNegativeEmotionDirect: iAffect: " + Integer.toString(iAffect));
            }
                    
            int iLevel = GetLevel(iAffect);
            double dMeanAmount = GetMeanAffect(iLevel);
        
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AddNegativeEmotionDirect: dAmount: " + Double.toString(dMeanAmount));
            }
        
            postEvent(nac.saee.post(iAffect)); //set beliefsets        
            mutex4.threadWait();
        
            postEvent(nac.aee.post("NeonAffectReservoir", dMeanAmount, false));  //add value to reservoir
            mutex4.threadWait();
        }
        catch (Exception e)
        {
            
        }
        finally
        {        
            emotionMutex.release();
        }
    }

    private double GetMeanAffect(int iLevel) throws Exception
    {
        return LevelClassifier.GetLevelMean(iLevel);        
    }

    public int GetAffectFromTimeline(int iAffect1, int iLevel1)
    {   
        if (bDebug)
        {
            System.out.println("NeonAffectAgent.GetAffectFromTimeline(): iAffect1: " + Integer.toString(iAffect1) + " iLevel: " + Integer.toString(iLevel1));
        }
        
        int iTimeline = GetTimeline(iAffect1, iLevel1);
        
        if (bDebug)
        {
            System.out.println("NeonAffectAgent.GetAffectFromTimeLine(): iTimeline: " + Integer.toString(iTimeline));
        }
        
        int iAffect = GetAffect(iLevel1, iTimeline);
        
        if (iAffect == -1)
        {
            iTimeline = 1;            
        }
        
        if (bDebug)
        {
            System.out.println("NeonAffectAgent.GetAffectFromTimeLine(): iAffect: " + Integer.toString(iAffect));            
        }
        
        return iAffect;
    }

    private int GetTimeline(int iAffect1, int iLevel1)
    {
        for (int i = 0; i < affectTimelineList.size(); i++)
        {
            Object[] items = (Object[])affectTimelineList.get(i);
            
            int iTimeline = (int)items[0];
            int iLevel = (int)items[1];
            int iAffect = (int)items[2];
         
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetTimeLine(): iAffect: " + Integer.toString(iAffect) + " iLevel: " + Integer.toString(iLevel));
            }
            
            if (iAffect == iAffect1)
            {                
                return iTimeline;                
            }            
        }
        
        return -1;        
    }

    public int GetOrigLevel(int iAffect1)
    {
        for (int i = 0; i < origAffectTimelineList.size(); i++)
        {
            Object[] items = (Object[])origAffectTimelineList.get(i);
            
            int iTimeline = (int)items[0];
            int iLevel = (int)items[1];
            int iAffect = (int)items[2];
         
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetOrigLevel(): iAffect: " + Integer.toString(iAffect) + " iLevel: " + Integer.toString(iLevel));
            }
            
            if (iAffect == iAffect1)
            {                
                return iLevel;                
            }            
        }
        
        return -1;        
    }

    private int GetLevel(int iAffect1)
    {
        for (int i = 0; i < affectTimelineList.size(); i++)
        {
            Object[] items = (Object[])affectTimelineList.get(i);
            
            int iTimeline = (int)items[0];
            int iLevel = (int)items[1];
            int iAffect = (int)items[2];
         
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetLevel(): iAffect: " + Integer.toString(iAffect) + " iLevel: " + Integer.toString(iLevel));
            }
            
            if (iAffect == iAffect1)
            {                
                return iLevel;                
            }            
        }
        
        return -1;        
    }

    private int GetAffect(int iLevel1, int iTimeline1)
    {       
        if (bDebug)
        {
            System.out.println("NeonAffectAgent.GetAffect(): iLevel1: " + Integer.toString(iLevel1) + " iTimeline1: " + Integer.toString(iTimeline1));
        }
        
        for (int i = affectTimelineList.size()-1; i >= 0; i--)
        {
            Object[] items = (Object[])affectTimelineList.get(i);
            
            int iTimeline = (int)items[0];
            int iLevel = (int)items[1];
            int iAffect = (int)items[2];
         
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetAffect(): iLevel: " + Integer.toString(iLevel) + " iTimeline: " + Integer.toString(iTimeline));
            }
            
            if (iLevel == iLevel1 && iTimeline == iTimeline1)
            {                
                return iAffect;
            }
        }
        
        return -1;        
    }

    public void AddBehavior(String strBehaviorName)
    {
        Object[] items = new Object[2];
        items[0] = (Object)strBehaviorName;
        items[1] = (Object)System.currentTimeMillis(); //will be after affect history time
        
        behaviorList.add((Object)items); 
    }

    public void ClearBehaviors()
    {     
        behaviorList = new ArrayList();
    }

    public NeonAffectAgent GetAgent()
    {
        return (NeonAffectAgent)getAgent();
    }

    public void IncrementNumberOfCursors()
    {   
        mutex5.threadWait();
    
        try
        {        
            iNumberOfCursors++;
        }
        finally
        {        
            mutex5.signal();
        }
    }

    public int GetNumberOfCursors()
    {   
        mutex5.threadWait();
        
        try
        {
            return iNumberOfCursors;
        }
        finally
        {
            mutex5.signal();
        }
    }

    /*
     * Level Cursor
     */
    public void SetCursorAck(String strCursorType1, int iLevel1, boolean bValue1)
    {
        mutex5.threadWait();
        
        try
        {
            ackCursorVar.SetAck(strCursorType1, new AckVar(strCursorType1, iLevel1, -1, -1, bValue1));
        }
        finally
        {        
            mutex5.signal();
        }
    }

    /*
     * AffectRegulation/Extreme Cursor
     */
    public void SetCursorAck(String strCursorType1, int iStartLevel1, int iEndLevel1, boolean bValue1)
    {    
        mutex5.threadWait();
       
        try
        {
            ackCursorVar.SetAck(strCursorType1, new AckVar(strCursorType1, -1, iStartLevel1, iEndLevel1, bValue1));
        }
        finally
        {        
            mutex5.signal();
        }
    }

    /*
    public synchronized boolean GetCursorAck(String strCursorType1)
    {
        return (boolean)cursorAcks.get((Object)strCursorType1);
    }
    */
    
    public void SetBehavior(String strBehavior1)
    {
        strBehavior = strBehavior1;        
    }

    public String GetBehavior()
    {
        return strBehavior;        
    }

    public void SetAffectHistoryItems(ArrayList items1)
    {
        mutex5.threadWait();
         
        try
        {
            if (bDebug)
            {
                System.out.println("Inside NeonAffectAgent.SetAffectHsitoryItems size: " + Integer.toString(items1.size()));
            }
        
            affectHistoryItems = items1;
        }
        finally
        {        
            mutex5.signal();
        }
    }

    public ArrayList GetAffectHistoryItems()
    {        
        if (bDebug)
        {
            System.out.println("Inside NeonAffectAgent.GetAffectHsitoryItems");                
        }
        
        postEvent(nac.gahe.post());
        mutex4.threadWait(); //which mutex?
        
        if (bDebug)
        {
            System.out.println("Leaving NeonAffectAgent.GetAffectHistoryItems");                
        }
        
        return affectHistoryItems;
    }

    public Object[] GetAffectHistoryBehaviors()
    {
        Object[] items = new Object[2];
     
        try
        {
            ArrayList affectHistory = GetAffectHistoryItems();
            
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetAffectHistoryBehaviors affect history sise: " + Integer.toString(affectHistory.size()) + " behavior size: " + Integer.toString(behaviorList.size()));                
            }
            
            items[0] = (Object)affectHistory;
            items[1] = (Object)behaviorList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return items;
    }

    public void Wait(double dValue1)
    {
        postEvent(wc.we.post(dValue1));        
        mutex.threadWait();
    }

}
