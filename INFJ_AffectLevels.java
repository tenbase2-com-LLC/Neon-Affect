package NeonAffect;

import java.util.*;

public class INFJ_AffectLevels
{

    public INFJ_AffectLevels()
    {
        // Level -6 (Most extreme negative states)
       affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });         // With others' pain
       affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });      // By world's suffering
       affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });        // To help others

       // Level -5 (Very intense negative states) 
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });           // Of harsh realities
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEPRESSED });        // World's darkness
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DESPAIR });          // Humanity's state
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });      // Others' suffering
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FRUSTRATION });      // Can't help enough
       affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });            // Others' crisis

       // Level -4 (Strong negative states)
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGUISH });          // Others' pain
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.BORED });            // Shallow connection
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONFUSION });        // Others' motives  
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTEMPT });         // For cruelty
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPERATION });      // To understand
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISCOURAGED });      // By apathy
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DISTRESSED });       // Others' conflict
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DOUBT });            // In humanity
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FEEBLE });           // To change things
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });         // Others' chaos
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });        // Social wrongs
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });         // About impact
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RAGE });             // At inhumanity
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.SCORN });            // For cruelty
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });           // Of evil
       affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TORMENTED });        // By suffering

       // Level -3 (Moderate negative states)
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANGRY });            // At injustice
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });        // Surface values
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANXIETY });          // For others
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });         // By insensitivity
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.BITTERNESS });       // At apathy
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.CONFLICTED });       // Inner turmoil
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });         // By reality
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFIANT });          // Against wrong
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISAPPOINTMENT });   // In people
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });     // With superficial
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });          // At cruelty
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });            // Future darkness
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });             // For others
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });        // By conflict
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GRIEF });            // Others' loss
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });            // Not helping more
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.HUMILIATION });      // In exposure
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.IMPATIENCE });       // With shallow
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.LONELY });           // Misunderstood
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.PAIN });             // Others' hurt
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REGRET });           // Not acting
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });         // By society
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REMORSE });          // For inaction
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.RESENTMENT });       // Of callousness
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.STUNNED });          // By cruelty
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });            // Others' stress 
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TROUBLED });         // By darkness
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.UPSET });            // By conflict
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.VENGEFUL });         // For injustice
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WARINESS });         // Of harm
       affectTimelineList.add(new Object[] { -1, -3, AffectEnum.WORRY });            // For others

       // Level -2 (Mild negative states)
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.AGGRESSIVE });       // For justice
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ARROGANT });         // About insight
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BURDENED });         // By others
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONTROLLING });      // For protection
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISSATISFIED });     // With shallow
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOMINEERING });      // To help
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EGOTISTICAL });      // About insight
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.EMBARRASSED });      // By exposure
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ENVY });             // Others' peace
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.FATIGUED });         // By emotion
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INHIBITED });        // By others
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.IRRITATION });       // With shallow
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });         // Of connection
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LISTLESS });         // No meaning
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MACABRE });          // Dark insights
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MOODY });            // Absorbing others
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.PITY });             // For suffering
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });              // World state
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SEXUALLY_EXCITED }); // Deep connection
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SHY });              // With new people
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });          // By others
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });            // In groups
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });         // For causes
       affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VULNERABILITY });    // To others

       // Level -1 (Slight negative states)
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.ACCEPTANCE });       // Of limits
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });          // By insight
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.INDIFFERENCE });     // To shallow
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });             // For peace
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });      // To reality
       affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });          // About life

       // Level 1 (Slight positive states)
       affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });              // Natural state

       // Level 2 (Mild positive states)
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.ADMIRATION });         // Fe appreciation
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });           // By depth
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });       // For harmony
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });         // In purpose
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.EMPATHY });           // Natural state
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });          // To connect
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.LUCKY });             // To help
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });      // In harmony
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RELIEF });            // Others safe
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.SELF_SATISFIED });    // Helping others
       affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });          // For connection

       // Level 3 (Moderate positive states)
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ACTIVATED });         // By meaning
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ADORATION });         // Of goodness
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.AFFECTIONATE });      // With loved ones
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ALERT });             // To needs
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ANTICIPATION });      // Of connection
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });          // In harmony
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.COMPASSION });        // For all
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.DESIRE });            // To help
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });         // For meaning
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });             // In connection
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });       // For humanity
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.IN_LOVE });           // With potential
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });            // In harmony
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LUST });              // For meaning
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });          // With growth
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PLEASED });           // With progress
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.RESPONSIBLE });       // For others
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });             // In goodness
       affectTimelineList.add(new Object[] { -1, 3, AffectEnum.VALUED });            // For insight

       // Level 4 (Strong positive states)
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ADMIRED });           // For wisdom
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });// For truth0

       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CAPABLE });           // Of helping
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONCENTRATING });     // On insight
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DETERMINATION });     // To improve
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.FEARLESSNESS });      // For right
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INFLUENTIAL });       // For good
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.INSPIRED });          // By potential
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LONGING });           // For harmony
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOVE });              // For humanity
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LOYALTY });           // To values
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.MOVED });             // By truth
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.PRIDE });             // In helping
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SATISFACTION });      // In growth
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SMUGNESS });          // About insight
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SURPRISED });         // By depth
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.USEFUL });            // To others
       affectTimelineList.add(new Object[] { -1, 4, AffectEnum.WANDERLUST });        // For meaning

       // Level 5 (Very strong positive states)
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.AMAZEMENT });         // At unity
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CONFIDENCE });        // In truth
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.CURIOUS });           // About depth
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.DEVOTED });           // To growth
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });         // To understand
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ELATION });           // In harmony
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EXCITED });           // By insight
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });              // In truth
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });         // By humanity
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INTERESTED });        // In souls
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MIGHTY });            // In purpose
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });          // To help
       affectTimelineList.add(new Object[] { -1, 5, AffectEnum.STRONG });            // In values

       // Level 6 (Most extreme positive states)
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });               // At unity
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.CONNECTEDNESS });     // Universal
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });         // Of harmony
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.EUPHORIA });          // In oneness
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.FASCINATED });        // By perfect insight
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MASTERFUL });         // Understanding
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });        // Breakthrough
       affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });    
    }

    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
