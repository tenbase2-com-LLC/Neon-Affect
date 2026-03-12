
package NeonAffect;

import java.util.*;

public class ESTP_AffectLevels
{

    public ESTP_AffectLevels()
    {
        // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Se-Ti explosion
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Ni grip
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Ti loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Fe overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Se blocked
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Fe wound
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Ti judgment
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Ni shadow
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Se force

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.IMPATIENCE });     // Se-Ti frustration
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Se retaliation
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Se overwhelm
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Fe impact
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Ti resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Se distress
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Ti dismissal
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Fe reflection
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fe depth
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Se pressure
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Se powerless
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });     // Ti resentment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.SEXUALLY_EXCITED });// Se intensity
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Ti blocked

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.OVERWHELMED });      // Se overload
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });        // Ti-Fe violation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Se aggression
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ni catastrophe
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Se panic
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });     // Ti grudge
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fe guilt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Se shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Ni darkness
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Se dominance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Se force
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });     // Ti blocked
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Se resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Ti inflation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ni shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fe judgment
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fe doubt

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Se aversion
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ni anxiety
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ni foreboding
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fe conscience
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Se urgency
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Se confusion
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Se stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Ti failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Se blocked
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fe hurt
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fe comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fe shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Ti shock
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });    // Ti pride
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Ti frustration

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INDIFFERENCE });     // Se disengagement
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANNOYANCE });        // Se irritation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fe processing
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Se caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Ni concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Ti uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ni stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Ti muddle
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fe comparison
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Se restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Fe hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fe isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Ti concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Se understim
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Se push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT });   // Ti standards

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });              // Fe reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fe exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fe fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Se friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Ti acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Ti-Fe tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Ti focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fe submission
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Se drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Ti lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Ti standards
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Se low
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Ti weight

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });        // Fe harmony
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });        // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });             // Se fortune
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Se readiness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Se awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Ti focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Se release
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Se energy
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fe warmth
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Ti content

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });          // Fe gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });      // Ti-Fe harmony
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Se satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Se spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Fe worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Ti drive
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Se curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fe warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Ti duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Se wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Ti integrity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Fe harmony
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Se sensation
        
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Se-Fe joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Ti fulfillment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Ti achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Fe bonding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ni optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Se desire
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fe connection
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Ti calm
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Se delight
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Se freedom
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Se interest
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Ti competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Ti contribution

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Se-Ti strength
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Se courage
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Se thrill
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Se wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fe bonding
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fe warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Ti dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Se enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Se passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });     // Ti-Fe impact
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Ti mastery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });        // Se-Ti force
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Se confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Se peak
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Se drive
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Fe commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Se admiration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fe devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fe touched
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Se delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Se adventure
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fe care
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fe depth
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Se liberation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Se discovery

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Se-Ti power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Se force
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Ti victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.SMUGNESS });        // Ti pride
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Se amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Se wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Fe validation
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Se pleasure
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fe culmination
    }

    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
