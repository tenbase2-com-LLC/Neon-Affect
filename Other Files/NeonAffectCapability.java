/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:30 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;

import aos.jack.jak.event.PlanChoice;
import aos.jack.util.thread.Semaphore;

/**
 * 
 */
public capability NeonAffectCapability extends Capability {
    #has capability AffectAppraisalCapability aac;
    #has capability Timeline1Capability timeline1Cap;
    #has capability Timeline2Capability timeline2Cap;
    #has capability Timeline3Capability timeline3Cap;
    #has capability Timeline4Capability timeline4Cap;
    #has capability Timeline5Capability timeline5Cap;
    #has capability Timeline6Capability timeline6Cap;
    #has capability Timeline7Capability timeline7Cap;
    #has capability Timeline8Capability timeline8Cap;
    #has capability Timeline9Capability timeline9Cap;
    #has capability Timeline10Capability timeline10Cap;
    #has capability Timeline11Capability timeline11Cap;
    #has capability Timeline12Capability timeline12Cap;
    #has capability Timeline13Capability timeline13Cap;
    #has capability Timeline14Capability timeline14Cap;
    #has capability Timeline15Capability timeline15Cap;
    #has capability Timeline16Capability timeline16Cap;
    #has capability Timeline17Capability timeline17Cap;
    #has capability Timeline18Capability timeline18Cap;
    #has capability Timeline19Capability timeline19Cap;
    #has capability Timeline20Capability timelinst20Cap;
    #handles event Level3PosAffectEvent;
    #posts event Level3PosAffectEvent ev2;
    #handles event Level4PosAffectEvent;
    #posts event Level4PosAffectEvent ev15;
    #handles event Level5PosAffectEvent;
    #posts event Level5PosAffectEvent ev16;
    #handles event Level6PosAffectEvent;
    #posts event Level6PosAffectEvent ev5;
    #handles event Level2PosAffectEvent;
    #posts event Level2PosAffectEvent ev6;
    #handles event Level4NegAffectEvent;
    #posts event Level4NegAffectEvent ev7;
    #handles event Level3NegAffectEvent;
    #posts event Level3NegAffectEvent ev17;
    #handles event Level1PosAffectEvent;
    #posts event Level1PosAffectEvent ev11;
    #handles event Level1NegAffectEvent;
    #posts event Level1NegAffectEvent ev12;
    #handles event Level5NegAffectEvent;
    #posts event Level5NegAffectEvent ev13;
    #handles event Level6NegAffectEvent;
    #posts event Level6NegAffectEvent ev14;
    #handles event SetAffectEnumEvent;
    #posts event SetAffectEnumEvent saee;
    #handles event MapAffectEvent;
    #posts event MapAffectEvent mae;
    #handles event SetPlanContextEvent;
    #posts event SetPlanContextEvent spce;
    #handles event InitReservoirEvent;
    #posts event InitReservoirEvent ire;
    #handles event GrabReservoirValueEvent;
    #posts event GrabReservoirValueEvent grve;
    #handles event AddEmotionEvent;
    #posts event AddEmotionEvent aee;
    #handles event SetCursorsEvent;
    #posts event SetCursorsEvent sce;
    #handles event SetAffectCursorsEvent;
    #posts event SetAffectCursorsEvent sace;
    #handles event SetLevelCursorsEvent;
    #posts event SetLevelCursorsEvent slce;
    #handles event AddAffectHistoryEvent;
    #posts event AddAffectHistoryEvent aahe;
    #handles event SetExtremeLevelCursorsEvent;
    #posts event SetExtremeLevelCursorsEvent selcse;
    #handles event SetExtremeLevelCursorEvent;
    #posts event SetExtremeLevelCursorsEvent selce;
    #handles event AddLevelsEvent;
    #posts event AddLevelsEvent ale;
    #handles event LevelCursorEvent;
    #posts event LevelCursorEvent lce;
    #handles event SetPersonalityTypeEvent;
    #posts event SetPersonalityTypeEvent spte;
    #handles event GetAffectHistoryEvent;
    #posts event GetAffectHistoryEvent gahe;
    #handles event ClearAffectHistoryEvent;
    #posts event ClearAffectHistoryEvent cahe;
    #handles event AddAppraisalCriteriaEvent;
    #posts event AddAppraisalCriteriaEvent aace;
    #uses plan SetAffectEnumPlan;
    #uses plan MapAffectPlan;
    #uses plan SetCursorsPlan;
    #uses plan InitReservoirPlan;
    #uses plan GrabReservoirValuePlan;
    #uses plan AddEmotionPlan;
    #uses plan Level1PosAffectPlan;
    #uses plan Level2PosAffectPlan;
    #uses plan Level3PosAffectPlan;
    #uses plan Level4PosAffectPlan;
    #uses plan Level5PosAffectPlan;
    #uses plan Level6PosAffectPlan;
    #uses plan Level1NegAffectPlan;
    #uses plan Level2NegAffectPlan;
    #uses plan Level3NegAffectPlan;
    #uses plan Level4NegAffectPlan;
    #uses plan Level5NegAffectPlan;
    #uses plan Level6NegAffectPlan;
    #uses plan AddAffectHistoryPlan;
    #uses plan IncreasingNegativeLevelPlan;
    #uses plan IncreasingPositiveLevelPlan;
    #uses plan DecreasingNegativeLevelPlan;
    #uses plan DecreasingPositiveLevelPlan;
    #uses plan SameLevelPlan;
    #uses plan AddLevelsPlan;
    #uses plan ExtremeLevelsAffectPlan;
    #uses plan ExtremeLevelAffectPlan;
    #uses plan LevelCursorPlan;
    #uses plan CursorPlanChoicePlan;
    #uses plan SetPersonalityTypePlan;
    #uses plan GetAffectHistoryPlan;
    #uses plan ClearAffectHistoryPlan;
    #uses plan AddAppraisalCriteriaPlan;
    #imports data Emotion emotion();
    #imports data PlanContextName planContextName();
    #imports data AffectType affectType();
    #imports data NA_Debug debug();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data Semaphore mutex3();
    #imports data Semaphore mutex4();
    #imports data Semaphore mutex6();
    #imports data Behavior behaviorName();
    #imports data Expectancy expectancy();
    #imports data Outcome outcome();
    #imports data Appraisals appraisals();
    #imports data Appraisals appraisalSims();
    #imports data PersonalityType personalityType();
    #private data AffectTypePrev affectTypePrev();
    #private data AffectHistory affectHistory();
    #private data Levels levels();
    #private data CancelPlan cancelINLPlan(false);
    #private data CancelPlan cancelIPLPlan(false);
    #private data CancelPlan cancelDNLPlan(false);
    #private data CancelPlan cancelDPLPlan(false);
    #private data CancelPlan cancelSameLevelPlan(false);

}
