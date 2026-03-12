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

/**
 * 
 */
public capability InfluentialAffectCapability extends Capability {
    #uses plan AdaptiveLeadershipPlan;
    #uses plan AskQuestionsInfluentialPlan;
    #uses plan AttentiveBodyLanguagePlan;
    #uses plan CharmingDemeanorPlan;
    #uses plan CharmingEloquencePlan;
    #uses plan CommandingPresencePlan;
    #uses plan ConfidentPostureInfluentialPlan;
    #uses plan ConfidentVoiceInfluentialPlan;
    #uses plan EffectiveNegotiationPlan;
    #uses plan EmpatheticUnderstandingPlan;
    #uses plan EmpoweringEncouragmentPlan;
    #uses plan EyeContactInfluentialPlan;
    #uses plan FacialExpressionsInfluentialPlan;
    #uses plan GracefulHandGesutresPlan;
    #uses plan InnovativeThinkingInfluentialPlan;
    #uses plan ListeningIntentlyInfluentialPlan;
    #uses plan PersuasiveSpeechInfluentialPlan;
    #uses plan SmilingInfluentialPlan;
    #uses plan SpeakToInspireInfluentialPlan;
    #uses plan StrategicNetworkingPlan;
    #uses plan StrategicWordChoicePlan;
    #uses plan TrendSettingPlan;
    #uses plan VisionarySolutionsPlan;
    #uses plan SetPlanContextInfluentialPlan;
    #imports data PlanContextName planContextName();
    #imports data Behavior behaviorName();
    #imports data Semaphore mutex();
    #imports data Semaphore mutex2();
    #imports data NA_Debug debug();

}
