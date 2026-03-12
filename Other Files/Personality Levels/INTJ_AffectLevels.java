
package NeonAffect;

import java.util.*;

public class INTJ_AffectLevels
{

    public INTJ_AffectLevels()
    { 
        
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });         // Loss of strategic control
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });      // System failure
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });        // Complete loss of control

        // Level -5 (Very intense negative states)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });           // Of strategic failures
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEPRESSED });        // When vision fails
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DESPAIR });          // Loss of future vision
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });      // Plan collapse
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FRUSTRATION });      // With ineffective systems
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });            // Loss of control

        // Level -4 (Strong negative states)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGUISH });          // Failed implementation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.BORED });            // Lack of challenge
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONFUSION });        // Strategic uncertainty
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTEMPT });         // For inefficiency
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPERATION });      // For control
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISCOURAGED });      // By implementation failures
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISTRESSED });       // By incompetence
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DOUBT });            // In strategic vision
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FEEBLE });           // In execution
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });         // When plans collapse
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });        // Strategic interference
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });         // About leadership
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RAGE });             // At incompetence
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.SCORN });            // For inefficiency
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });           // Of strategic failure
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TORMENTED });        // By inability to execute

        // Level -3 (Moderate negative states)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANGRY });            // At incompetence
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });        // With inefficiency
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANXIETY });          // About execution
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });         // By poor planning
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.BITTERNESS });       // At interference
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.CONFLICTED });       // About strategy
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });         // By circumstances
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFIANT });          // Against interference
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISAPPOINTMENT });   // In execution
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });     // With progress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });          // At incompetence
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });            // Of failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });             // Of losing control
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });        // By chaos
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GRIEF });            // For lost opportunities
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });            // Over strategic errors
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.HUMILIATION });      // From failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.IMPATIENCE });       // With slow progress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.LONELY });           // In leadership
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.PAIN });             // From failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REGRET });           // Over missed opportunities
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });         // For vision
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REMORSE });          // Over mistakes
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.RESENTMENT });       // Of interference
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.STUNNED });          // By failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });            // During execution
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TROUBLED });         // By setbacks
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.UPSET });            // By interference
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.VENGEFUL });         // Against saboteurs
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WARINESS });         // Of incompetence
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WORRY });            // About execution

        // Level -2 (Mild negative states)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.AGGRESSIVE });       // In pursuit of goals
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ARROGANT });         // Due to capability
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BURDENED });         // By responsibility
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONTROLLING });      // Natural state
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISSATISFIED });     // With progress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOMINEERING });      // In leadership
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EGOTISTICAL });      // About ability
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EMBARRASSED });      // By inefficiency
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ENVY });             // Of better execution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.FATIGUED });         // From planning
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INHIBITED });        // By others
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.IRRITATION });       // With inefficiency
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });         // Of others' success
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LISTLESS });         // Without goals
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MACABRE });          // Strategic consideration
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MOODY });            // When blocked
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.PITY });             // For incompetence
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });              // At inefficiency
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SEXUALLY_EXCITED }); // Controlled expression
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SHY });              // In social settings
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });          // When planning
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });            // In uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });         // In execution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VULNERABILITY });    // When unprepared

        // Level -1 (Slight negative states)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.ACCEPTANCE });       // Of limitations
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });          // By complexity
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.INDIFFERENCE });     // To irrelevance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });             // When strategic
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });      // To constraints
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });          // Default state

        // Level 1 (Slight positive states)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });              // When strategic

        // Level 2 (Mild positive states)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });           // By potential
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });       // When beneficial
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });         // In control
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.EMPATHY });           // Strategic use
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });          // When useful
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.LUCKY });             // Good planning
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });      // In control
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RELIEF });            // After success
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.SELF_SATISFIED });    // With execution
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });          // For competence

        // Level 3 (Moderate positive states)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ACTIVATED });         // By challenge
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ADORATION });         // Of excellence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.AFFECTIONATE });      // When successful
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ALERT });             // To opportunity
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ANTICIPATION });      // Of success
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });          // When in control
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.COMPASSION });        // When strategic
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.DESIRE });            // For achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });         // For competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });             // With progress
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });       // In strategy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.IN_LOVE });           // With potential
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });            // In success
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LUST });              // For power
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });          // Strategic
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PLEASED });           // With execution
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.RESPONSIBLE });       // Natural state
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });             // In competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.VALUED });            // For capability

        // Level 4 (Strong positive states)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ADMIRATION });         // For competence
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ADMIRED });           // For competence
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });              // In execution
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CAPABLE });           // In implementation
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONCENTRATING });     // On strategy
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DETERMINATION });     // To succeed
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.FEARLESSNESS });      // In execution
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INFLUENTIAL });       // Through competence
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INSPIRED });          // By potential
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LONGING });           // For perfection
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOVE });              // Of mastery
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOYALTY });           // To vision
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.MOVED });             // By excellence
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.PRIDE });             // In achievement
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SATISFACTION });      // With execution
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SMUGNESS });          // In capability
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SURPRISED });         // By efficiency
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.USEFUL });            // Through strategy
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.WANDERLUST });        // For opportunity

        // Level 5 (Very strong positive states)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.AMAZEMENT });         // At perfection
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CONFIDENCE });        // In vision
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CURIOUS });           // About potential
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.DEVOTED });           // To goals
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });         // For implementation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ELATION });           // At success
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EXCITED });           // By opportunity
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });              // In control
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });         // By mastery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INTERESTED });        // In potential
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MIGHTY });            // In execution
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });          // In control
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.STRONG });            // In capability

        // Level 6 (Most extreme positive states)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.FASCINATED });        // Strategic insights
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });               // At perfection
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.CONNECTEDNESS });     // To vision
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });         // Of mastery
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.EUPHORIA });          // Perfect execution
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MASTERFUL });         // Complete control
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });        // Strategic victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });            // At achievement
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
