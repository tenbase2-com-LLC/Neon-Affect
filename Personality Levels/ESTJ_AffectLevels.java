
package NeonAffect;

import java.util.*;

public class ESTJ_AffectLevels
{

    public ESTJ_AffectLevels()
    {
       // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Te explosion
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Unhealthy Te
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Te blocked
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Te fixation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Fi grip
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Te failure
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Fi overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Te judgment
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Fi grip

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Te retaliation
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Si resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Te criticism
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Fi processing
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Ne stress
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Fi depth
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Te powerless
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fi pain
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Te pressure
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Te setback
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.IMPATIENCE });     // Te blocked
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Fi wound
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });     // Fi injury

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.OVERWHELMED });      // Te overload
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Te frustration
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Te grip
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Te force
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ne catastrophe
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Ne panic
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });     // Fi hurt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fi guilt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Te shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Fi hopeless
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });    // Te blocked
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Te resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fi violation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fi doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Te judgment
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Te inflation

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.LISTLESS });         // Te disengagement
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Te rejection
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ne threat
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ne anxiety
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fi processing
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Te urgency
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Te disruption
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Si restriction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fi shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Te stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fi comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fi hurt
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Te offense
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Te failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });    // Te inflation
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Te dissatisfaction

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANNOYANCE });
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.UPSET });            // Fi disturbance
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.MACABRE });          // Fi shadow
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.INDIFFERENCE });     // Si detachment
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fi processing
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Si caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Ne concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Te uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Te unclear
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fi insecurity
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ne stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Te restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT });   // Te standards
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Ne hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fi isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Si concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Te push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Ne understim

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SEXUALLY_EXCITED }); // Si sensation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fi fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Te focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Te friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fi exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Te-Fi tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Si acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Te lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Si drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Fi reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Te submission
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Te standards
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Si weight

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Ne possibility
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Te focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Si comfort
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Te awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Te engagement
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fi expression
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });      // Si stability
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });      // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });           // Ne fortune
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Te content

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PEACEFULNESS });      // Si contentment
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Te worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Te drive
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Si duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Te satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Ne spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Ne curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fi warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fi wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Si propriety
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Te teamwork
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fi gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Si sensation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Te competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Te contribution
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Te achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Te fulfillment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Fi joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fi appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });           // Si reliability
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Si steadiness
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ne optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fi yearning
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fi understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Fi expression
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Ne release
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Ne interest

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Te mastery
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Te assertion
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Fi fulfillment
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Ne wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fi bonding
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fi warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Si dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Ne enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Fi passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });     // Te leadership
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Te expertise
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });        // Te strength
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Te confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Fi peak
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Ne drive
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Si commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Te recognition
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fi devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fi depth
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Ne delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Ne exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fi care
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fi attachment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Ne liberation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Ne discovery

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Te power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Te force
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Te victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.SMUGNESS });        // Te pride
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Ne wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Ne amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Te recognition
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Fi satisfaction
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fi culmination
        
    }
    
    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
