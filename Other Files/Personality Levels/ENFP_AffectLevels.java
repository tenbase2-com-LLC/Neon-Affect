
package NeonAffect;

import java.util.*;

public class ENFP_AffectLevels
{

    public ENFP_AffectLevels()
    {
        // ENFP Personality Type Affect Mappings
        // Negative Affects (High Intensity to Low)
        
        // Level -6 (Overwhelming Emotional States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });    // Primary ENFP stress response
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Ne-Te loop manifestation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Fi in crisis
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Inferior Si grip
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Deep Fi processing
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Social impact
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Rare but possible
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Critical Ne
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Si grip manifestation

        // Level -5 (Strong Negative Emotions)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Ne catastrophizing
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Fi-Te conflict
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fi processing
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Emotional depth
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Fi sensitivity
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Ne-Si tension
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.IMPATIENCE });     // Te frustration
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });     // Fi disappointment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Rare state
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Critical Ne
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Fi reflection
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Ne blocked
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Si grip

        // Level -4 (Moderate Negative Emotions)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.SMUGNESS });      // Te shadow aspect
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DOMINEERING });   // Te shadow aspect
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ne amplification
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Ne overflow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });     // Te stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fi doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Te expression
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });     // Fi injury
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fi empathy shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fi processing
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Ne shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Fi depth
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Te assertion
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fi values violated
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ne shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Te stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Ne-Te loop
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Te grip

        // Level -3 (Mild Negative Emotions)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });      // Te frustration
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.UPSET });         // Fi disruption
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ne anxiety
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fi comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ne anticipation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fi processing
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Ne pressure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Te overwhelm
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Fi rejection
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });      // Te friction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Fi shock
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fi shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });    // Ne shadow
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Si restriction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fi wound
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Te stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Fi dissatisfaction

        // Level -2 (Subtle Negative Emotions)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fi processing
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Ne caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fi trigger
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Ne spiral
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT }); // Fi letdown
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Ne uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ne stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Ne overwhelm
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Ne understimulated
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Te push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Si dampening
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fi isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Si caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Fi concern

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.INDIFFERENCE });  // Ne disengagement
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fi fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Te friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fi openness
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Si acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Fi growth
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Fi-Te tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Si drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Fi unmet
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Fi reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Te focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Ne low
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fi withdrawal
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Si weight

        // Positive Affects (Low Intensity to High)
        
        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Ne engagement
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });      // Fi peace
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Si comfort
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });      // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Ne stimulation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fi expression
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Te focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Ne awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });           // Ne opportunity
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Fi contentment

        // Level 2 (Moderate Positive Emotions)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });   // Fi inner harmony
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.SEXUALLY_EXCITED }); // Si physical experience
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Fi satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Ne spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Fi worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Te drive
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fi wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Si sensation
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Ne curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fi warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Te reliability
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Fi harmony
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Fi integrity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fi gratitude

        // Level 3 (Strong Positive Emotions)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Ne-Fi joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Fi fulfillment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Fi-Te achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ne optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fi desire
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Fi connection
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Si balance
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fi understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Te confidence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });       // Ne freedom
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Te contribution
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Ne-Fi harmony
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Ne exploration

        // Level 4 (Very Strong Positive Emotions)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Ne-Fi peak
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Ne wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fi unity
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Te-Fi strength
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Fi passion
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fi warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Fi dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Ne courage
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Ne enthusiasm

        // Level 5 (Intense Positive Emotions)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });    // Ne leadership impact
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });       // Te strength expression
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });           // Ne independence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });      // Te mastery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });     // Ne captivation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Ne-Fi bliss
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Ne anticipation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Ne exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Ne-Te confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fi devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fi depth
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Ne delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fi empathy
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Fi commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Ne inspiration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fi passion

        // Level 6 (Peak Positive Emotions)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });           // Fi ultimate feeling
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Ne wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Ne amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Te-Fi power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Ne-Fi joy
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Fi validation
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Te confidence
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Te-Fi victory
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
