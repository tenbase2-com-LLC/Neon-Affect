
package NeonAffect;

import java.util.*;

public class ENTP_AffectLevels
{

    public ENTP_AffectLevels()
    {
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });         // Trapped in debate loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });      // By missed chances
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });        // To innovate/explore

        // Level -5 (Very intense negative states)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });           // Of stagnation
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEPRESSED });        // No mental stimulation
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DESPAIR });          // Dead-end thinking
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });      // Loss of possibilities
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FRUSTRATION });      // With closed minds
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });            // Trapped in routine

        // Level -4 (Strong negative states)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGUISH });          // Mental stagnation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.BORED });            // Primary fear
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONFUSION });        // Overwhelmed by options
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTEMPT });         // For ignorance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPERATION });      // For stimulation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISCOURAGED });      // By closed systems
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISTRESSED });       // By monotony
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DOUBT });            // In possibilities
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FEEBLE });           // Without challenge
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });         // From restriction
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });        // Intellectual suppression
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });         // About stagnation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RAGE });             // At willful ignorance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.SCORN });            // For closed minds
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });           // Of mediocrity
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TORMENTED });        // By routine

        // Level -3 (Moderate negative states)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANGRY });            // At limitations
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });        // With tedium
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANXIETY });          // About stagnation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });         // By small-mindedness
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.BITTERNESS });       // At missed chances
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.CONFLICTED });       // Too many ideas
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });         // By reality
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFIANT });          // Against convention
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISAPPOINTMENT });   // In others' thinking
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });     // With status quo
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });          // At conformity
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });            // Of routine
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });             // Of boredom
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });        // By details
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GRIEF });            // For lost potential
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });            // About unfinished projects
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.HUMILIATION });      // In debate loss
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.IMPATIENCE });       // With slow minds
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.LONELY });           // Intellectually
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.PAIN });             // Of conformity
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REGRET });           // Unexplored paths
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });         // Ideas dismissed
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REMORSE });          // Abandoned ventures
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.RESENTMENT });       // Of constraints
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.STUNNED });          // By ignorance
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });            // Under structure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TROUBLED });         // By conformity
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.UPSET });            // By closed minds
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.VENGEFUL });         // In argument
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WARINESS });         // Of commitment
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WORRY });            // About potential

        // Level -2 (Mild negative states)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.AGGRESSIVE });       // In debate
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ARROGANT });         // Intellectually
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BURDENED });         // By routine
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONTROLLING });      // Of conversation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISSATISFIED });     // With simplicity
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOMINEERING });      // In discussion
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EGOTISTICAL });      // About ideas
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EMBARRASSED });      // Poor argument
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ENVY });             // Of others' freedom
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.FATIGUED });         // By tedium
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INHIBITED });        // By rules
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.IRRITATION });       // With slow pace
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });         // Of others' wit
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LISTLESS });         // Without challenge
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MACABRE });          // Intellectual play
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MOODY });            // Understimulated
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.PITY });             // For limited minds
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });              // From boredom
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SEXUALLY_EXCITED }); // Mental connection
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SHY });              // Until engaged
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });          // Temporarily
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });            // Before debate
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });         // In argument
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VULNERABILITY });    // In emotion

        // Level -1 (Slight negative states)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.ACCEPTANCE });       // Of reality
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });          // By genius
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.INDIFFERENCE });     // To convention
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });             // Strategically
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });      // To limits
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });          // When needed

        // Level 1 (Slight positive states)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });              // When engaged

        // Level 2 (Mild positive states)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });           // By ideas
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });       // For exploration
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });         // In victory
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.EMPATHY });           // Through insight
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });          // In discussion
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.LUCKY });             // Finding patterns
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });      // In debate
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RELIEF });            // New perspective
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.SELF_SATISFIED });    // Winning point
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });          // For engagement

        // Level 3 (Moderate positive states)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ACTIVATED });         // By challenge
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ADORATION });         // Of brilliance
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.AFFECTIONATE });      // When stimulated
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ALERT });             // To possibilities
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ANTICIPATION });      // Of debate
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });          // In exploration
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.COMPASSION });        // Through understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.DESIRE });            // For knowledge
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });         // For engagement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });             // In discussion
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });       // About possibilities
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.IN_LOVE });           // With potential
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });            // In discovery
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LUST });              // For life
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });          // In debate
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PLEASED });           // With engagement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.RESPONSIBLE });       // When interested
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });             // In potential
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.VALUED });            // For ideas

        // Level 4 (Strong positive states)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ADMIRATION });        // For intellectual brilliance
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ADMIRED });           // For wit
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });              // In debate
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CAPABLE });           // In argument
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONCENTRATING });     // On possibilities
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DETERMINATION });     // To understand
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.FEARLESSNESS });      // In debate
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INFLUENTIAL });       // With ideas
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INSPIRED });          // By concepts
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LONGING });           // For novelty
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOVE });              // Of ideas
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOYALTY });           // To truth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.MOVED });             // By insight
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.PRIDE });             // In wit
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SATISFACTION });      // In debate
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SMUGNESS });          // After victory
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SURPRISED });         // By insight
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.USEFUL });            // Contributing ideas
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.WANDERLUST });        // For knowledge

        // Level 5 (Very strong positive states)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });        // By novel concepts
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.AMAZEMENT });         // At possibilities
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CONFIDENCE });        // In debate
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CURIOUS });           // About everything
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.DEVOTED });           // To ideas
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });         // For challenge
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ELATION });           // In discovery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EXCITED });           // By potential
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });              // To explore
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });         // By brilliance
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INTERESTED });        // In everything
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MIGHTY });            // In debate
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });          // In argument
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.STRONG });            // In discussion

        // Level 6 (Most extreme positive states)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });               // At possibilities
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.CONNECTEDNESS });     // To ideas
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });         // Of debate
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.EUPHORIA });          // In discovery
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MASTERFUL });         // In argument
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });        // Debate victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });            // At potential
    }

    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
