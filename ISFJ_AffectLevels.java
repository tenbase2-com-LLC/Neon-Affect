
package NeonAffect;

import java.util.*;

public class ISFJ_AffectLevels
{

    public ISFJ_AffectLevels()
    {
        // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.BITTERNESS });
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OVERWHELMED });
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RESENTMENT });
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Si-Fe overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Si processing loss
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Si-Fe loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Si overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Fe social pain
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Si fixation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Fe suppression break
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Fe shadow
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Fe rejection

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Si resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Fe-Si processing
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fe depth
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Si memory
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Fe shadow
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Fe betrayal
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Si reflection
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Si weakness
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Fe pressure
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Si setback
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.IMPATIENCE });     // Fe frustration
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.SEXUALLY_EXCITED });// Si discomfort
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Ne grip

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.EGOTISTICAL });
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ne catastrophizing
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Fe hopelessness
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fe guilt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Fe frustration
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Si shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Fe stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fe doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Fe shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Ne panic
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });    // Ti block
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fe condescension
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Fe resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fe values violated
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ne shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.UPSET });          // Fe disturbance

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ne worry
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fe responsibility
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ne anticipation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Fe rejection
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Si disruption
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fe shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Si-Fe stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Si caution
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fe wound
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Ti failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Fe dissatisfaction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fe comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Ne pressure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Fe violation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });      // Fe irritation

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INDIFFERENCE });
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Fe concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Ti uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Si-Ne tension
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Si protection
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Fe restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT }); // Fe letdown
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Fe hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fe processing
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ne stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fe insecurity
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Si concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fe isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Ti push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Ne understimulation

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Si focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fe exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Si acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Fe friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Ti tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fe submission
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Fe reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Si drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fe fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Fe lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Fe standards
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Ne low
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Si weight

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Si focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });      // Fe harmony
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Si comfort
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Si awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fe warmth
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Ne possibility
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Si engagement
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });      // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });           // Ne fortune
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Ti contentment
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.PEACEFULNESS });    // Si tranquility

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Fe worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Si propriety
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Ti drive
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Si duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Ne curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fe warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fe gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Fe satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Ne spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fe wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Si sensation
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Fe harmony
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Ti competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Fe service
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Fe connection
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Si contentment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Si steadiness
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Ti achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Fe contentment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ne optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fe yearning
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Fe delight
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Ne release
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Ne interest

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Ti assurance
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Si-Fe dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Ti assertion
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fe bonding
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fe warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Ne wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Fe joy
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Ne enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Fe passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Si-Fe commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });     // Fe guidance
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Ti expertise
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fe care
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Si appreciation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fe devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Fe bliss
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Ne anticipation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Ne exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Ti confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fe touched
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Ne delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fe affection
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Ne release
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });        // Ti strength
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Ne wonder

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Ti confidence
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Ti power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Fe-Ti victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Ne wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Fe validation
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Ne amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Fe fulfillment
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fe devotion
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.SMUGNESS });        // Ti pride
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
