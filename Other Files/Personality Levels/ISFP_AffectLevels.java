
package NeonAffect;

import java.util.*;

public class ISFP_AffectLevels
{

    public ISFP_AffectLevels()    
    {
        // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });    // Se overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Fi depth
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Fi-Ni loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Fi wound
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Fi overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Fi helpless
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Fi fixation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Fi violation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Fi rejection
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Te grip

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Fi trauma
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fi pain
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Se overwhelm
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Fi resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Fi hurt
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Fi reflection
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Fi judgment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Fi betrayed
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Fi defeat
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Te inferior
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });     // Fi hurt
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Fi pressure

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANNOYANCE });      // Se irritation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.IMPATIENCE });     // Se frustration
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Se panic
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Se overwhelm
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Fi hopeless
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });     // Fi betrayal
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Fi violation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fi guilt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fi doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fi judgment
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Te grip
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Te stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });     // Te block
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Se shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Te defense
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Fi resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fi violated
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ni shadow

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });    // Fi inflation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.BURDENED });       // Fi weight
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Fi unease
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.UPSET });          // Fi disturbance
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Se threat
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fi shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ni foreboding
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Fi rejection
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fi shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Se overwhelm
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fi wound
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fi inadequacy
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Se blocked
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Se stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Fi urgency
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Te failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Fi shock

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INDIFFERENCE });   // Fi detachment
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT }); // Fi letdown
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fi sorrow
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Se caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Ni concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Fi uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Se stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Te muddle
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fi comparison
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Fi restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Se hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fi isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Fi concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Se understim

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fi exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fi fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Se friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Fi acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Fi-Te tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Fi reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Te focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fi submission
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Se drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Fi lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Fi unmet
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Se low

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fi warmth
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });       // Fi openness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Fi release
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Se awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Se readiness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.PEACEFULNESS });    // Fi harmony
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Fi content

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.CONCENTRATING });   // Te focus
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.SEXUALLY_EXCITED });// Se arousal
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fi warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Fi satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Fi worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Se-Ni spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Se curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Te duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Fi integrity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fi wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fi gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Se sensation
        
        // Level 3 (Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.ACTIVATED });       // Se energy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.COOPERATIVE });     // Fe harmony
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.INFLUENTIAL });     // Te impact
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Fi joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Fi fulfillment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Fi connection
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Fi authenticity
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ni optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fi yearning
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fi understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Fi peace
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Fi delight
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Se freedom        
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Se wonder        
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Te competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Te service

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DETERMINATION });   // Fi resolve
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.POWERFUL });        // Te strength
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fi warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fi unity
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Fi-Se joy
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Se assurance
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Fi dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Se wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Se courage
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Se enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Se-Fi passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADMIRATION });      // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LUCKY });           // Se fortune
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SMUGNESS });        // Te pride
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.VIGOROUS });        // Se vitality
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fi caring
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Fi commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fi devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Se-Fi bliss
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Se appreciation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Se anticipation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Se exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Se courage
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fi touched
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Se delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fi passion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Se freedom
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Te skill
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Se-Ni insight

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fi ultimate
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Se-Fi wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Se amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Fi validation
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Te strength
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Se-Te power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Te victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Fi fulfillment
    }

    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
