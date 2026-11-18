/*******************************************************************
 * Created by the JDE: Wed Nov 18 09:22:18 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

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
    #handles event CursorPlanChoiceEvent;
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
    private NeonAffectDeciderAgent affectDeciderAgent = null;
    private NeonInteractionComputeAgent interactionComputeAgent = null;
    private NeonPlanSelectorAgent planSelectorAgent = null;
    public static int iMaxNegLevel = -6;
    public static int iMaxPosLevel = 6;
    private boolean bDebug = true;
    //mixed emotions: one cursor variable per reservoir (see DualReservoir)
    public EmotionCursorVar emotionCursorVarPos = new EmotionCursorVar();
    public EmotionCursorVar emotionCursorVarNeg = new EmotionCursorVar();
    //serialises LevelCursorPlan: a positive and a negative cursor can now fire together
    public aos.jack.util.thread.Semaphore levelLock = new aos.jack.util.thread.Semaphore();
    private int iPositiveAffect = -1;
    private int iNegativeAffect = -1;
    private String strCoEmotion = "";
    private String strAssignedChannel = null;
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
    private PathologyResult lastPathologyResult = null;
    private EmotionPatternResult lastEmotionPatternResult = null;
    private TrajectoryAnalysisResult lastTrajectoryAnalysis = null;
    private AffectDynamicsParams lastDynamicsParams = null;
    private PathologyResult lastPathologyResultPositive = null;
    private PathologyResult lastPathologyResultNegative = null;
    private EmotionPatternResult lastEmotionPatternResultPositive = null;
    private EmotionPatternResult lastEmotionPatternResultNegative = null;
    private TrajectoryAnalysisResult lastTrajectoryAnalysisPositive = null;
    private TrajectoryAnalysisResult lastTrajectoryAnalysisNegative = null;
    #uses taskmanager CatMan(this);

    public void Init()
    {
        this.timer = new DilatedClock(1d, this.timer);
        this.timer.setTime(0L);
        
        ackCursorVar = new AckCursorVar(cursorAcks);

        mutex5.signal();

        //JACK semaphores start locked; open the level lock once
        levelLock.signal();

        //AddAffectAppraisalCriteria();

        //personality type, timelines, cursors and reservoir polling - callers no longer
        //have to call PostInit() themselves. It runs on its own thread: Init() is called
        //from the constructor, and JACK does not process this agent's events until the
        //constructor returns, so waiting for PostInit's events here would block forever.
        //The Add...Emotion methods wait for it (AwaitStarted).
        Thread starter = new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    PostInit();
                }
                finally
                {
                    started.countDown();
                }
            }
        }, "NeonAffect-PostInit");
        starter.start();
    }

    //PostInit() has finished (see Init)
    private final java.util.concurrent.CountDownLatch started = new java.util.concurrent.CountDownLatch(1);

    public void AwaitStarted()
    {
        try
        {
            started.await();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    private void CreateAgents()
    {       
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

    //called once, from Init()
    private void PostInit()
    {
        SetPersonalityType();
        CreateAffectMapping(strPersonalityType);
        StartGrabbingValues();

        //start-up decay rates: the personality type, no emotion yet
        DecayRates.Apply(this.getId(), true, -1, strPersonalityType, this.timer.getTime(), bDebug);
        DecayRates.Apply(this.getId(), false, -1, strPersonalityType, this.timer.getTime(), bDebug);
    }

    public ThreadPool GetPlanContextThreadPool()
    {
        return pctp;        
    }

    //reads mbti_personality_type from cojack_cognitive.xml - a direct call (this was the
    //SetPersonalityTypeEvent/SetPersonalityTypePlan round trip)
    public void SetPersonalityType()
    {
        try
        {
            String strType = new CoJACKConfigParserXML.parser(Constants.COJACK_COGNITIVE_PATH).GetMBTIPersonalityType("NeonAffectGroup");
            personalityType.add(0, strType);
            SetPersonalityType(strType);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
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
            AffectLevel entry = (AffectLevel)affectTimelineList.get(i);
            Integer affect = entry.affect();
            
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

        //init reservoirs: a direct call (this was the InitReservoirEvent/InitReservoirPlan
        //round trip, whose plan only read the value); reading instantiates both moderators
        try
        {
            GetReservoirValue();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }

        postEvent(nac.sce.post()); //set cursors
        mutex.threadWait();
        ((DilatedClock)this.timer).setDilation(1d);
     
        if (bDebug)
        {
            System.out.println("StartGrabbingValues: Number of cursors: " + GetNumberOfCursors());
        }
     
        postEvent(nac.grve.post()); //grabs values
    }

    //net intensity (positive + negative reservoir), for callers that want one number
    public double GetReservoirValue() throws NoSuchMethodException
    {
        return GetPositiveReservoirValue() + GetNegativeReservoirValue();
    }

    public double GetPositiveReservoirValue() throws NoSuchMethodException
    {
        double v = DualReservoir.Positive(this.getId(), this.timer.getTime());
        if (bDebug)
        {
            System.out.println("Positive reservoir value: " + v);
        }
        return v;
    }

    public double GetNegativeReservoirValue() throws NoSuchMethodException
    {
        double v = DualReservoir.Negative(this.getId(), this.timer.getTime());
        if (bDebug)
        {
            System.out.println("Negative reservoir value: " + v);
        }
        return v;
    }

    //the value the reservoir of dAmount's sign will have once dAmount is added
    public double PredictReservoirValue(double dAmount) throws NoSuchMethodException
    {
        double dOwn = (dAmount > 0) ? GetPositiveReservoirValue() : GetNegativeReservoirValue();
        double dOpposite = (dAmount > 0) ? GetNegativeReservoirValue() : GetPositiveReservoirValue();
        double k = DualReservoir.Inhibition(this.getId(), this.timer.getTime());
        double r = Math.min(Math.abs(dOpposite), k * Math.abs(dAmount));
        return dOwn + dAmount - Math.signum(dAmount) * r;
    }

    //the current emotion on each side, -1 when that side has none
    public synchronized void SetSideAffect(int iAffect1)
    {
        int iLevel = GetLevel(iAffect1);
        if (iLevel > 0)
        {
            iPositiveAffect = iAffect1;
        }
        else if (iLevel < 0)
        {
            iNegativeAffect = iAffect1;
        }

        //the side's decay rate follows its new emotion (and the personality type)
        if (iLevel != 0)
        {
            DecayRates.Apply(this.getId(), iLevel > 0, iAffect1, strPersonalityType, this.timer.getTime(), bDebug);
        }
    }

    public synchronized int GetPositiveAffect()
    {
        return iPositiveAffect;
    }

    public synchronized int GetNegativeAffect()
    {
        return iNegativeAffect;
    }

    //the other emotion of a mixed response, for the judge ("" when not mixed)
    public synchronized void SetCoEmotion(String strCoEmotion1)
    {
        strCoEmotion = (strCoEmotion1 == null) ? "" : strCoEmotion1;
    }

    public synchronized String GetCoEmotion()
    {
        return strCoEmotion;
    }

    //a channel fixed in advance for the next InteractionPlan (mixed responses); taken once
    public synchronized void SetAssignedChannel(String strChannel1)
    {
        strAssignedChannel = strChannel1;
    }

    public synchronized String TakeAssignedChannel()
    {
        String str = strAssignedChannel;
        strAssignedChannel = null;
        return str;
    }

    public void SetMappedAffect(int iAffect1)
    {
        iMappedAffect = iAffect1;
        SetSideAffect(iAffect1);
    }

    //one value per reservoir; each cursor variable wakes only its own six level cursors
    public void SetEmotionValues(double dPositive1, double dNegative1)
    {
        boolean bPosChanges = emotionCursorVarPos.LevelChanges(dPositive1);
        boolean bNegChanges = emotionCursorVarNeg.LevelChanges(dNegative1);

        //LevelCursorPlan's AckCursor waits until every cursor has reported since the last
        //added emotion. A side whose level did not change is not woken, so report its six
        //cursors here, from its current value, rather than leave the count short.
        if (bPosChanges && !bNegChanges)
        {
            AckSide(false, dNegative1);
        }
        else if (bNegChanges && !bPosChanges)
        {
            AckSide(true, dPositive1);
        }

        emotionCursorVarPos.SetValue(dPositive1);
        emotionCursorVarNeg.SetValue(dNegative1);
    }

    private void AckSide(boolean bPositive, double dValue)
    {
        int iLevel = LevelClassifier.GetLevel(dValue);
        for (int i = 1; i <= 6; i++)
        {
            int iCursorLevel = bPositive ? i : -i;
            String strCursorType = (bPositive ? "LEVEL_CURSOR_POS_" : "LEVEL_CURSOR_NEG_") + Integer.toString(i);
            SetCursorAck(strCursorType, iCursorLevel, iLevel == iCursorLevel);
        }
    }

    public void AddAffectHistoryValue(AffectHistoryVar item)
    {
        affectHistoryCursorVar.SetValue(item);
    }

    public void AddPositiveEmotion(int iAffect, double dAmount)
    {        
        try
        {   
            AwaitStarted();   //PostInit runs on its own thread (see Init)
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
        
            postEvent(nac.aee.post(Constants.NEON_DUAL_RESERVOIR, dAmount, true)); //add value to the positive reservoir       
            mutex4.threadWait(); 
        }
        catch (Exception e)
        {

        }
        finally
        {
            emotionMutex.release();
        }

        DetectPathology();
        DetectEmotionPatterns();
        AnalyzeTrajectory();
    }

    public void AddNegativeEmotion(int iAffect, double dAmount)
    {       
        try
        {   
            AwaitStarted();   //PostInit runs on its own thread (see Init)
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
        
            postEvent(nac.aee.post(Constants.NEON_DUAL_RESERVOIR, dAmount, true));  //add value to the negative reservoir
            mutex4.threadWait();
        }
        catch (Exception e)
        {

        }
        finally
        {
            emotionMutex.release();
        }

        DetectPathology();
        DetectEmotionPatterns();
        AnalyzeTrajectory();
    }

    public void AddEmotionDirect(int iAffect) throws Exception
    {        
        try
        {
            AwaitStarted();   //PostInit runs on its own thread (see Init)
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

            SetSideAffect(iAffect);

            postEvent(nac.aee.post(Constants.NEON_DUAL_RESERVOIR, dMeanAmount, false));  //set the reservoir of the level's sign
            mutex4.threadWait();
        }
        catch (Exception e)
        {

        }
        finally
        {
            emotionMutex.release();
        }

        DetectPathology();
        DetectEmotionPatterns();
        AnalyzeTrajectory();
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
            AffectLevel items = (AffectLevel)affectTimelineList.get(i);
    
            int iTimeline = items.timeline();
            int iLevel = items.level();
            int iAffect = items.affect();
         
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
            AffectLevel items = (AffectLevel)origAffectTimelineList.get(i);
    
            int iTimeline = items.timeline();
            int iLevel = items.level();
            int iAffect = items.affect();
         
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
            AffectLevel items = (AffectLevel)affectTimelineList.get(i);
    
            int iTimeline = items.timeline();
            int iLevel = items.level();
            int iAffect = items.affect();
         
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
            AffectLevel items = (AffectLevel)affectTimelineList.get(i);
    
            int iTimeline = items.timeline();
            int iLevel = items.level();
            int iAffect = items.affect();
         
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
        behaviorList.add(new BehaviorItem(strBehaviorName, System.currentTimeMillis()));
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

    public AffectHistoryBehaviors GetAffectHistoryBehaviors()
    {
        try
        {
            ArrayList affectHistory = GetAffectHistoryItems();
    
            if (bDebug)
            {
                System.out.println("NeonAffectAgent.GetAffectHistoryBehaviors affect history size: " + Integer.toString(affectHistory.size()) + " behavior size: " + Integer.toString(behaviorList.size()));
            }
    
            return new AffectHistoryBehaviors(affectHistory, behaviorList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
        return new AffectHistoryBehaviors(new ArrayList(), new ArrayList());
    }

    public PathologyResult DetectPathology()
    {
        try
        {
            ArrayList affectHistory = GetAffectHistoryItems();

            if (bDebug)
            {
                System.out.println("NeonAffectAgent.DetectPathology: history size: " + Integer.toString(affectHistory.size()) + " type: " + strPersonalityType);
            }

            //mixed emotions: the overall state reads the net track (positive + negative);
            //each valence is also analyzed on its own (see AffectHistoryTracks)
            lastPathologyResult = PathologyDetector.Detect(AffectHistoryTracks.Net(affectHistory), strPersonalityType);
            lastDynamicsParams = lastPathologyResult.GetDynamics();
            lastPathologyResultPositive = PathologyDetector.Detect(AffectHistoryTracks.Positive(affectHistory), strPersonalityType);
            lastPathologyResultNegative = PathologyDetector.Detect(AffectHistoryTracks.Negative(affectHistory), strPersonalityType);

            if (bDebug)
            {
                System.out.println("NeonAffectAgent.DetectPathology: " + lastPathologyResult.toString());
            }

            return lastPathologyResult;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public PathologyResult GetLastPathologyResult()
    {
        return lastPathologyResult;
    }

    public AffectDynamicsParams GetLastDynamicsParams()
    {
        return lastDynamicsParams;
    }

    public EmotionPatternResult DetectEmotionPatterns()
    {
        try
        {
            ArrayList affectHistory = GetAffectHistoryItems();

            if (bDebug)
            {
                System.out.println("NeonAffectAgent.DetectEmotionPatterns: history size: " + Integer.toString(affectHistory.size()) + " type: " + strPersonalityType);
            }

            lastEmotionPatternResult = EmotionPatternDetector.Detect(AffectHistoryTracks.Net(affectHistory), strPersonalityType);
            lastEmotionPatternResultPositive = EmotionPatternDetector.Detect(AffectHistoryTracks.Positive(affectHistory), strPersonalityType);
            lastEmotionPatternResultNegative = EmotionPatternDetector.Detect(AffectHistoryTracks.Negative(affectHistory), strPersonalityType);

            if (bDebug)
            {
                System.out.println("NeonAffectAgent.DetectEmotionPatterns: " + lastEmotionPatternResult.toString());
            }

            return lastEmotionPatternResult;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public EmotionPatternResult GetLastEmotionPatternResult()
    {
        return lastEmotionPatternResult;
    }

    public TrajectoryAnalysisResult AnalyzeTrajectory()
    {
        try
        {
            lastTrajectoryAnalysis = EmotionalTrajectoryAnalyzer.Analyze(
                lastPathologyResult, lastEmotionPatternResult);
            lastTrajectoryAnalysisPositive = EmotionalTrajectoryAnalyzer.Analyze(
                lastPathologyResultPositive, lastEmotionPatternResultPositive);
            lastTrajectoryAnalysisNegative = EmotionalTrajectoryAnalyzer.Analyze(
                lastPathologyResultNegative, lastEmotionPatternResultNegative);

            if (bDebug)
            {
                System.out.println("NeonAffectAgent.AnalyzeTrajectory: " + lastTrajectoryAnalysis.toString());
            }

            return lastTrajectoryAnalysis;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public TrajectoryAnalysisResult GetLastTrajectoryAnalysis()
    {
        return lastTrajectoryAnalysis;
    }

    //mixed emotions: the analyses of each valence on its own
    public PathologyResult GetLastPathologyResult(boolean bPositive)
    {
        return bPositive ? lastPathologyResultPositive : lastPathologyResultNegative;
    }

    public EmotionPatternResult GetLastEmotionPatternResult(boolean bPositive)
    {
        return bPositive ? lastEmotionPatternResultPositive : lastEmotionPatternResultNegative;
    }

    public TrajectoryAnalysisResult GetLastTrajectoryAnalysis(boolean bPositive)
    {
        return bPositive ? lastTrajectoryAnalysisPositive : lastTrajectoryAnalysisNegative;
    }

    public AffectDynamicsParams ComputeCurrentDynamics()
    {
        try
        {
            ArrayList affectHistory = GetAffectHistoryItems();
            lastDynamicsParams = AffectDynamicsCalculator.Compute(AffectHistoryTracks.Net(affectHistory));
            return lastDynamicsParams;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return new AffectDynamicsParams();
    }

    public void Wait(double dValue1)
    {
        postEvent(wc.we.post(dValue1));
        mutex.threadWait();
    }

}


