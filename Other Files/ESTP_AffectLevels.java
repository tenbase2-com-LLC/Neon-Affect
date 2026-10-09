
package NeonAffect;

import java.util.ArrayList;
import java.util.List;

public class ESTP_AffectLevels
{

    public ESTP_AffectLevels()
    {
        // Level -6 (Most extreme negative states - ESTP focus on action blocked and Ni-grip premonitions of the inescapable)
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.FEEBLE)); // Se body or capacity failing
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.RAGE)); // Se-Ti explosion
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.TERROR)); // Ni grip sudden catastrophic premonition
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.TORMENTED)); // Ni grip
        affectTimelineList.add(new AffectLevel(-1, -6, AffectEnum.POWERLESS)); // Se blocked with no move left [level representative]

        // Level -5 (Very intense negative states - ESTP focus on restriction by rules and sudden dark foreboding)
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.ABANDONED)); // Fe left alone by those relied on (new)
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.ANGUISH)); // Fe depth
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.BETRAYED)); // Fe trust broken by someone close (new)
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DEFIANT)); // Se pushback against imposed rules
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DEPRESSED)); // Ni shadow when stuck without outlet
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DEVASTATION)); // Fe impact
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DISTRESSED)); // Se pressure
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.DREAD)); // Ni grip dark sense of hidden threat
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.FRUSTRATION)); // Se action blocked by red tape
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.GRIEF)); // Fe loss felt hard then pushed through
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.HUMILIATION)); // Fe public loss of face in competition
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.IMPATIENCE)); // Se-Ti frustration
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.PAIN)); // Se distress
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.PANIC)); // Se overwhelm
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.SEXUALLY_EXCITED)); // Se intensity
        affectTimelineList.add(new AffectLevel(-1, -5, AffectEnum.INHIBITED)); // Se reined in by rules and restriction [level representative]

        // Level -4 (Strong negative states - ESTP focus on hot anger and defeat and deadening routine)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.AGGRESSIVE)); // Se force
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.ARROGANT)); // Ti inflation
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.BORED)); // Se deadened by routine and paperwork
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.CONTEMPT)); // Ti dismissal of the slow and timid
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DEFEATED)); // Ti losing the contest stings
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DESPERATION)); // Se urgency with no move left
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.DOMINEERING)); // Se pushing others around
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.EXASPERATED)); // Ti patience exhausted (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.HEARTBROKEN)); // Fe loss of a cherished bond (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.HURT)); // Fe wounded by another (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.HYSTERIA)); // Se panic
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.MACABRE)); // Ni shadow
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.OBSESSED)); // Ti fixation that breaks once action resumes
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.PITY)); // Fe judgment
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.SCORN)); // Ti cutting dismissal
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.SHAME)); // Fe whole self judged bad (new)
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.STUNNED)); // Se shock
        affectTimelineList.add(new AffectLevel(-1, -4, AffectEnum.ANGRY)); // Se hot anger that flares and passes [level representative]

        // Level -3 (Moderate negative states - ESTP focus on restless itch for action and short-lived setbacks)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.BITTERNESS)); // Ti sourness rarely held long
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.BURDENED)); // Ti weighed down by obligations
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DENIAL)); // Ti brushes off what it will not face
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DESPAIR)); // Ni darkness rarely sustained
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISCONTENTED)); // Ti frustration
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISCOURAGED)); // Ti setback quickly shaken off
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISGUST)); // Se aversion
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.DISILLUSIONED)); // Ni ideals collapse (new)
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.EGOTISTICAL)); // Ti pride
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.ENVY)); // Fe comparison
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.FEAR)); // Ni anxiety
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.INJUSTICE)); // Ti unfair play
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.INSECURE)); // Fe doubt under a confident surface
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.OVERWHELMED)); // Se overload usually handled on the fly
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.REGRET)); // Fe brief look back before moving on
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.REJECTED)); // Fe hurt
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.SUBDUED)); // Se forced to tone it down
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.TENSE)); // Se stress
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.VENGEFUL)); // Se payback urge that soon fades
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.WARINESS)); // Ni suspicion of hidden motives
        affectTimelineList.add(new AffectLevel(-1, -3, AffectEnum.RESTLESS)); // Se unable to settle (new) [level representative]

        // Level -2 (Mild negative states - ESTP focus on passing irritations shrugged off quickly)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.ANNOYANCE)); // Se irritation
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.ANXIETY)); // Ni stress
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.APPALLED)); // Ti little concern for propriety
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.AWKWARD)); // Fe socially out of step (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.CONFUSION)); // Ti muddle
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.CONTROLLING)); // Se urge to steer less than to act
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.DISAPPOINTMENT)); // Ti standards
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.DRAINED)); // Fe exhausted from giving (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.EMBARRASSED)); // Fe laughs off a gaffe
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.FLUSTERED)); // Se cool under pressure
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.GUILT)); // Fe conscience lightly felt
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.INDIFFERENCE)); // Se disengagement
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.IRRITATION)); // Se quick flash of temper
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.JEALOUSY)); // Fe comparison
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.LONELY)); // Fe isolation
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.REMORSE)); // Fe guilt soon left behind
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.RESENTMENT)); // Ti grudge that does not last
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.SERIOUS)); // Ti enforced gravity chafes
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.TIMID)); // Fe hesitation
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.TROUBLED)); // Ti concern
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.UNAPPRECIATED)); // Fe efforts go unrecognised (new)
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.VIGOROUS)); // Se push
        affectTimelineList.add(new AffectLevel(-1, -2, AffectEnum.UPSET)); // Se brushes off and moves on (added: was missing) [level representative]

        // Level -1 (Slight negative states - ESTP focus on fleeting low moods rarely dwelt on)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.APPREHENSIVE)); // Ni unease about what is coming (new)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.CONFLICTED)); // Ti-Fe tension
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.DISSATISFIED)); // Ti standards
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.DOUBT)); // Ti acts first and doubts little
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.FATIGUED)); // Se drain
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.GUARDED)); // Ni holding back to avoid hurt (new)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.HUMBLED)); // Ti lesson
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.MEEK)); // Fe submission
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.MOODY)); // Fe fluctuation
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.RESIGNATION)); // Ti acceptance
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.SAD)); // Fe brief sadness soon shaken off
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.SHY)); // Fe reserve
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.VULNERABILITY)); // Fe exposure
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.WISTFUL)); // Ni longing for the unreachable (new)
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.WORRY)); // Ni future rarely on the mind
        affectTimelineList.add(new AffectLevel(-1, -1, AffectEnum.LISTLESS)); // Se low energy between stimuli [level representative]

        // Level 1 (Slight positive states - ESTP focus on quiet calm and duty barely register)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.ACCEPTANCE)); // Fe harmony
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.ADMIRATION)); // Fe appreciation
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.CONCENTRATING)); // Ti focus
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.DIGNIFIED)); // Ti propriety matters little
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.KIND)); // Fe warmth
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.PATIENCE)); // Ti patience in short supply
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.PEACEFULNESS)); // Ti-Fe calm is not the goal
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.REASSURED)); // Fe doubt eased by another (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.RESPONSIBLE)); // Ti duty lightly held
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.SELF_SATISFIED)); // Ti content
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.SYMPATHY)); // Fe feeling for another's trouble (new)
        affectTimelineList.add(new AffectLevel(-1, 1, AffectEnum.RELIEF)); // Se tension released back to action [level representative]

        // Level 2 (Mild positive states - ESTP focus on easy amusement and readiness for what comes next)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.ALERT)); // Se sharp tactical awareness
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.ANTICIPATION)); // Se ready for the next move
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.BELONGING)); // Fe accepted by the group (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.COOPERATIVE)); // Fe harmony
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.DESIRE)); // Se wanting
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.DEVOTED)); // Ti long-term dedication is not the draw
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.EMPATHY)); // Fe reads people more than feels with them
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.HOPEFULNESS)); // Ni little thought for the long term
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.LONGING)); // Se wants now rather than pines
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.NOSTALGIA)); // Ni fondness for the past (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.PLEASED)); // Se satisfaction
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.PURPOSEFUL)); // Ti acting toward meaning (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.SUPPORTED)); // Fe backed by others (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.TENDERNESS)); // Fe gentle protective warmth (new)
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.THANKFUL)); // Fe gratitude
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.VALUED)); // Fe worth
        affectTimelineList.add(new AffectLevel(-1, 2, AffectEnum.AMUSED)); // Se finding something funny (new) [level representative]

        // Level 3 (Moderate positive states - ESTP focus on playful charm and getting into the action)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.ACTIVATED)); // Se energised and ready to go
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.ADORATION)); // Fe devotion less central
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.AFFECTIONATE)); // Fe warmth shown lightly
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.AROUSED)); // Se sensation heightened
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.CAPABLE)); // Ti competence
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.COMPERSION)); // Fe joy in another's joy (new)
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.CONNECTEDNESS)); // Fe bond through shared action
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.DETERMINATION)); // Ti drive to win now
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.FRIENDLY)); // Fe easy social charm
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.GRATITUDE)); // Fe appreciation
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.HAPPY)); // Se-Fe joy
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.INSPIRED)); // Se sparked by a live opportunity
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.INTERESTED)); // Se hooked by something new
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.LOYALTY)); // Fe loyal to the crew more than the institution
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.LUCKY)); // Se riding a hot streak
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PRIDE)); // Ti achievement
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.SATISFACTION)); // Ti fulfillment
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.TRUST)); // Fe bonding
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.USEFUL)); // Ti contribution
        affectTimelineList.add(new AffectLevel(-1, 3, AffectEnum.PLAYFUL)); // Se light teasing spontaneity (new) [level representative]

        // Level 4 (Strong positive states - ESTP focus on confident engagement with novelty and the present)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.AMAZEMENT)); // Se wonder
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.CHERISHED)); // Fe deeply valued by another (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.COMPASSION)); // Fe practical care
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.CURIOUS)); // Se drawn to novelty
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.ELEVATION)); // Fe uplifted by human goodness (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.INFLUENTIAL)); // Ti-Fe sway over the room
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.INTIMACY)); // Fe mutual closeness and openness (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.IN_LOVE)); // Fe passion of the moment
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.JOYFUL)); // Se delight in the action
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.LOVE)); // Fe love felt in the present
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.MASTERFUL)); // Ti skill shown in action
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.MOVED)); // Fe touched in the moment
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.ONENESS)); // Fe union with something larger (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.PROTECTIVE)); // Fe drive to keep others safe (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.SERENITY)); // Ni deep untroubled calm (new)
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.SMUGNESS)); // Ti pride after a win
        affectTimelineList.add(new AffectLevel(-1, 4, AffectEnum.CONFIDENCE)); // Se-Ti sure footing in the moment [level representative]

        // Level 5 (Very intense positive states - ESTP focus on daring risk and adrenaline)
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.ADMIRED)); // Fe applause for a bold play
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.CAREFREE)); // Se living fully in the moment
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.EAGERNESS)); // Se drive
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.ELATION)); // Se adrenaline high
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.EUPHORIA)); // Se peak
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.FASCINATED)); // Se discovery
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.IMPRESSED)); // Se admiration
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.LUST)); // Se physical passion
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.POWERFUL)); // Se-Ti force
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.SURPRISED)); // Se delight
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.WANDERLUST)); // Se adventure
        affectTimelineList.add(new AffectLevel(-1, 5, AffectEnum.BOLD)); // Se daring leap into risk [level representative]

        // Level 6 (Most extreme positive states - ESTP focus on thrill of victory and total freedom of action)
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.AWE)); // Se amazement
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.BLISS)); // Se effortless happiness (new)
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.EMPOWERED)); // Ti able to effect change (new)
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.ENJOYMENT)); // Se pleasure
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.EXCITED)); // Se thrill of the new and the risky
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.FEARLESSNESS)); // Se no fear of the risk
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.FREE)); // Se total freedom of action
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.MIGHTY)); // Se force
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.STRONG)); // Se-Ti power
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.WONDER)); // Se wonder
        affectTimelineList.add(new AffectLevel(-1, 6, AffectEnum.TRIUMPHANT)); // Ti-Se thrill of winning [level representative]
    }

    public ArrayList<AffectLevel> GetLevels()
    {
        return affectTimelineList;   
    }
    
    private final ArrayList<AffectLevel> affectTimelineList = new ArrayList<>();
}
