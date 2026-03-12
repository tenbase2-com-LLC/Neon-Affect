
package NeonAffect;

import java.util.*;

public class ISTJ_AffectLevels
{

    public ISTJ_AffectLevels()
    { 
        // ISTJ Personality Type Affect Mappings
        // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Si-Fi grip
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Si processing loss
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Si-Fi loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Si overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Te failure response
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Si fixation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Te stress reaction
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Unhealthy Te
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Te judgment

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.HYSTERIA });
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Si resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Si-Fi processing
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fi depth
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Si memory
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Te judgment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Fi values violated
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Si reflection
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Loss of Te control
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Te pressure
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Si setback
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.IMPATIENCE });     // Te friction
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.SEXUALLY_EXCITED });// Si discomfort
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Ne grip

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Stressed Te
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Si-Fi loop
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ne catastrophizing
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fi processing
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Te frustration
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Si shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Te stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Si doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Te defense
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });    // Te block
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Te resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fi violation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ne shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.UPSET });          // Fi disturbance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fi judgment

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ne inferior
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fi processing
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ne worry
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Si rejection
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Te disruption
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Si-Te stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Si caution
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Te social concern
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Te failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fi wound
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Si dissatisfaction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fi comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Ne pressure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Si violation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });      // Te irritation

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.OVERWHELMED });
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INDIFFERENCE });
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Ne anxiety
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Si disruption
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Te uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Si protection
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Si restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT }); // Te standards
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Ne hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fi processing
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ne stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fi comparison
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Si concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fi isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Te push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Ne understimulation

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Te focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fi exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Si acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Te friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Si-Ne tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fi reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Si privacy
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Si drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fi fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Si lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Te standards
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Ne low
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Si weight

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Si focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });      // Si stability
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Si comfort
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Te awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fi expression
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Ne possibility
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Te engagement
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });      // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });           // Ne opportunity
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Te contentment

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Te competence
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Si propriety
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Te drive
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Si duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Ne curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fi warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fi gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Si satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Ne spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fi wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Si sensation
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Te teamwork

        // Level 3 (Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Te confidence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Te contribution
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Si reliability
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Si contentment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Si steadiness
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fi understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Te achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Fi joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ne optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fi yearning
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Fi satisfaction
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Ne release
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Ne exploration

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.SMUGNESS });
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Te mastery
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Si dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Te assertion
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fi harmony
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fi expression
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Ne wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Fi fulfillment
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Ne enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Fi passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Si commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });     // Te impact
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Te expertise
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fi depth
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Si appreciation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fi devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Ne peak
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Ne anticipation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Ne exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Te confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fi touched
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Ne discovery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fi devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Ne liberation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });        // Te strength
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Ne engagement

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Te strength
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Te power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Te victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Ne wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Te recognition
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Ne amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Fi fulfillment
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fi culmination       //       
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
