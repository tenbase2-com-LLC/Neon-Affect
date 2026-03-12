
package NeonAffect;

import java.util.*;

public class ESFJ_AffectLevels
{

    public ESFJ_AffectLevels()
    {
        // Level -6 (Overwhelming Negative States)
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.GRIEF });          // Fe loss processing
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.TORMENTED });      // Fe-Si loop
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.HUMILIATION });    // Fe social pain
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DEPRESSED });      // Fe overwhelm
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.POWERLESS });      // Fe helplessness
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.OBSESSED });       // Si fixation
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.RAGE });           // Fe explosion
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.SCORN });          // Fe rejection
        affectTimelineList.add(new Object[] { -1, -6, AffectEnum.DOMINEERING });    // Fe shadow

        // Level -5 (Intense Negative States)
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.OVERWHELMED });   // Fe overwhelm
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DEVASTATION });    // Fe-Si trauma
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.ANGUISH });        // Fe suffering
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PANIC });          // Ne grip
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DENIAL });         // Si resistance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.PAIN });           // Fe hurt
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.REGRET });         // Si memory
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.CONTEMPT });       // Fe judgment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.VENGEFUL });       // Fe betrayal
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISCOURAGED });    // Fe disappointment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.FEEBLE });         // Fe powerless
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.BITTERNESS });     // Fe resentment
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.DISTRESSED });     // Fe disturbance
        affectTimelineList.add(new Object[] { -1, -5, AffectEnum.SEXUALLY_EXCITED });// Si discomfort

        // Level -4 (Strong Negative States)
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.TERROR });         // Ne fear
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.HYSTERIA });       // Fe overwhelm
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DESPAIR });        // Fe hopeless
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.RESENTMENT });     // Fe hurt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ANGRY });          // Fe frustration
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.REMORSE });        // Fe guilt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INSECURE });       // Fe doubt
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.PITY });           // Fe superiority
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.CONTROLLING });    // Fe grip
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.AGGRESSIVE });     // Fe stress
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.FRUSTRATION });    // Fe blocked
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.STUNNED });        // Fe shock
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.ARROGANT });       // Fe inflation
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.DEFIANT });        // Fe resistance
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.INJUSTICE });      // Fe values violated
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.MACABRE });        // Ne shadow
        affectTimelineList.add(new Object[] { -1, -4, AffectEnum.UPSET });          // Fe distress

        // Level -3 (Moderate Negative States)
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FEAR });           // Ne worry
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.GUILT });          // Fe conscience
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DREAD });          // Ne anxiety
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISGUST });        // Fe aversion
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EMBARRASSED });    // Fe shame
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.FLUSTERED });      // Fe disruption
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.REJECTED });       // Fe wound
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ENVY });           // Fe comparison
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.INHIBITED });      // Si restriction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.TENSE });          // Fe stress
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DESPERATION });    // Fe urgency
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DEFEATED });       // Fe failure
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.EGOTISTICAL });    // Fe pride
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.APPALLED });       // Fe shock
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.DISCONTENTED });   // Fe dissatisfaction
        affectTimelineList.add(new Object[] { -1, -3, AffectEnum.ANNOYANCE });      // Fe irritation

        // Level -2 (Mild Negative States)
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SAD });            // Fe sorrow
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WORRY });          // Fe concern
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DOUBT });          // Ti uncertainty
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.WARINESS });       // Si caution
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.JEALOUSY });       // Fe insecurity
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.ANXIETY });        // Ne stress
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.CONFUSION });      // Ti muddle
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.LONELY });         // Fe isolation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.SUBDUED });        // Fe restraint
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TIMID });          // Fe hesitation
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.TROUBLED });       // Fe worry
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.BORED });          // Ne understim
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.VIGOROUS });       // Si push
        affectTimelineList.add(new Object[] { -1, -2, AffectEnum.DISAPPOINTMENT }); // Fe letdown

        // Level -1 (Slight Negative States)
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.INDIFFERENCE }); // Fe disconnection
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.VULNERABILITY });  // Fe exposure
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MOODY });          // Fe fluctuation
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.IRRITATION });     // Fe friction
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.RESIGNATION });    // Si acceptance
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.CONFLICTED });     // Fe-Ti tension
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SHY });            // Fe reserve
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.SERIOUS });        // Si focus
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.MEEK });           // Fe submission
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.FATIGUED });       // Si drain
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.HUMBLED });        // Fe lesson
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.DISSATISFIED });   // Fe standards
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.LISTLESS });       // Ne low
        affectTimelineList.add(new Object[] { -1, -1, AffectEnum.BURDENED });       // Si weight

        // Level 1 (Mild Positive States)
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.KIND });            // Fe warmth
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACCEPTANCE });       // Fe openness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.RELIEF });          // Si comfort
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ALERT });           // Si awareness
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ANTICIPATION });    // Ne possibility
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.PEACEFULNESS });    // Si calm
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.CONCENTRATING });   // Ti focus
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ADMIRATION });      // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.LUCKY });           // Ne fortune
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.ACTIVATED });       // Si energy
        affectTimelineList.add(new Object[] { -1, 1, AffectEnum.SELF_SATISFIED });  // Fe content

        // Level 2 (Moderate Positive States)
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.FRIENDLY });        // Fe warmth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.PLEASED });         // Fe satisfaction
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.VALUED });          // Fe worth
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INSPIRED });        // Ne spark
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.INTERESTED });      // Ne curiosity
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.RESPONSIBLE });     // Si duty
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.COOPERATIVE });     // Fe harmony
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DIGNIFIED });       // Si propriety
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DESIRE });          // Fe wanting
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.THANKFUL });        // Fe gratitude
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.DETERMINATION });   // Ti resolve
        affectTimelineList.add(new Object[] { -1, 2, AffectEnum.AROUSED });         // Si sensation

        // Level 3 (Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HAPPY });           // Fe joy
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.GRATITUDE });       // Fe appreciation
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.SATISFACTION });    // Fe fulfillment
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.TRUST });
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PRIDE });           // Fe achievement
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.HOPEFULNESS });     // Ne optimism
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.LONGING });         // Fe yearning
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.EMPATHY });         // Fe understanding
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.PATIENCE });        // Si steadiness
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.USEFUL });          // Fe service
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAPABLE });         // Ti competence
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.JOYFUL });          // Fe delight
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CAREFREE });        // Ne release
        affectTimelineList.add(new Object[] { -1, 3, AffectEnum.CURIOUS });         // Ne interest

        // Level 4 (Very Strong Positive States)
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AFFECTIONATE });    // Fe warmth
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONNECTEDNESS });   // Fe bonding
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.ELATION });         // Fe joy
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.CONFIDENCE });      // Fe assurance
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.DEVOTED });         // Si dedication
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.AMAZEMENT });       // Ne wonder
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.BOLD });            // Fe assertion
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.EXCITED });         // Ne enthusiasm
        affectTimelineList.add(new Object[] { -1, 4, AffectEnum.LUST });            // Fe passion

        // Level 5 (Intense Positive States)
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.COMPASSION });      // Fe caring
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.LOYALTY });         // Si-Fe commitment
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.ADORATION });       // Fe devotion
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EUPHORIA });        // Fe bliss
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.INFLUENTIAL });     // Fe guidance
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IMPRESSED });       // Fe admiration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.EAGERNESS });       // Ne anticipation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.WANDERLUST });      // Ne exploration
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FEARLESSNESS });    // Fe confidence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MOVED });           // Fe touched
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.SURPRISED });       // Ne delight
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.IN_LOVE });         // Fe affection
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.POWERFUL });        // Fe influence
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FREE });            // Ne liberation
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.MASTERFUL });       // Ti mastery
        affectTimelineList.add(new Object[] { -1, 5, AffectEnum.FASCINATED });      // Ne wonder

        // Level 6 (Peak Positive States)
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.LOVE });            // Fe culmination
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.AWE });             // Ne wonder
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.WONDER });          // Ne amazement
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ADMIRED });         // Fe validation
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.MIGHTY });          // Fe power
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.STRONG });          // Fe strength
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.TRIUMPHANT });      // Fe victory
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.ENJOYMENT });       // Fe fulfillment
        affectTimelineList.add(new Object[] { -1, 6, AffectEnum.SMUGNESS });        // Fe pride        
    }

    public ArrayList GetLevels()
    {
        return affectTimelineList;   
    }
    
    private ArrayList affectTimelineList = new ArrayList();
}
