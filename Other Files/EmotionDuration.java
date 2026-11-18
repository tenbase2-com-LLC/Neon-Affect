package NeonAffect;

import java.util.HashMap;
import java.util.Map;

/**
 * How long each emotion tends to last, relative to an average emotion (1.0), for the
 * reservoir decay rates (see DecayRates): a reservoir's decay rate is divided by the
 * duration of its current emotion, so an emotion with duration 1.5 fades 1.5x more slowly.
 *
 * <p>The grouping follows research on emotion duration - Verduyn &amp; Lavrijsen (2015),
 * "Which emotions last longest and why", Motivation and Emotion - in which sadness lasted
 * longest, with hatred, joy and despair also among the longest, and shame, surprise, fear,
 * disgust, boredom, being touched, irritation and relief among the shortest. Duration was
 * linked to how important the event is and to rumination. The study covered 27 emotions;
 * the other emotions here are placed with the closest of them. The factors are a modelling
 * choice, ordered by those findings, not values measured in the study. Emotions not listed
 * have duration 1.0.
 */
public final class EmotionDuration {

    private EmotionDuration() {} // non-instantiable

    public static final double LONGEST = 1.5;   // sadness, loss, despair
    public static final double LONG = 1.3;      // hatred, resentment, rumination, worry
    public static final double LASTING = 1.2;   // joy, love, gratitude, hope
    public static final double SHORT = 0.7;     // shame, fear, disgust, boredom, irritation, being touched
    public static final double SHORTEST = 0.6;  // surprise, relief

    private static final Map<Integer, Double> DURATIONS = new HashMap<Integer, Double>();

    private static void put(double d, int... affects) {
        for (int a : affects) {
            DURATIONS.put(Integer.valueOf(a), Double.valueOf(d));
        }
    }

    static {
        // sadness and loss
        put(LONGEST, AffectEnum.SAD, AffectEnum.GRIEF, AffectEnum.DESPAIR, AffectEnum.DEPRESSED,
            AffectEnum.DEVASTATION, AffectEnum.HEARTBROKEN, AffectEnum.LONELY, AffectEnum.ANGUISH,
            AffectEnum.REGRET, AffectEnum.REMORSE, AffectEnum.ABANDONED, AffectEnum.BETRAYED,
            AffectEnum.DISILLUSIONED, AffectEnum.DISCOURAGED, AffectEnum.DEFEATED, AffectEnum.RESIGNATION,
            AffectEnum.HURT, AffectEnum.REJECTED, AffectEnum.BURDENED, AffectEnum.TORMENTED);
        // hatred, resentment and ruminative states
        put(LONG, AffectEnum.BITTERNESS, AffectEnum.RESENTMENT, AffectEnum.VENGEFUL, AffectEnum.CONTEMPT,
            AffectEnum.SCORN, AffectEnum.INJUSTICE, AffectEnum.JEALOUSY, AffectEnum.ENVY, AffectEnum.OBSESSED,
            AffectEnum.WORRY, AffectEnum.ANXIETY, AffectEnum.DREAD, AffectEnum.GUILT, AffectEnum.INSECURE,
            AffectEnum.TROUBLED, AffectEnum.UNAPPRECIATED, AffectEnum.DISSATISFIED, AffectEnum.DISCONTENTED,
            AffectEnum.LONGING, AffectEnum.WISTFUL);
        // joy, love and other lasting positive states
        put(LASTING, AffectEnum.HAPPY, AffectEnum.JOYFUL, AffectEnum.LOVE, AffectEnum.IN_LOVE,
            AffectEnum.ADORATION, AffectEnum.DEVOTED, AffectEnum.CHERISHED, AffectEnum.BELONGING,
            AffectEnum.GRATITUDE, AffectEnum.THANKFUL, AffectEnum.HOPEFULNESS, AffectEnum.PRIDE,
            AffectEnum.SERENITY, AffectEnum.PEACEFULNESS, AffectEnum.CONNECTEDNESS, AffectEnum.TRUST,
            AffectEnum.LOYALTY, AffectEnum.INTIMACY, AffectEnum.NOSTALGIA);
        // shame, fear, disgust, boredom, irritation, being touched
        put(SHORT, AffectEnum.SHAME, AffectEnum.EMBARRASSED, AffectEnum.AWKWARD, AffectEnum.FLUSTERED,
            AffectEnum.FEAR, AffectEnum.PANIC, AffectEnum.TERROR, AffectEnum.HYSTERIA, AffectEnum.DISGUST,
            AffectEnum.APPALLED, AffectEnum.BORED, AffectEnum.IRRITATION, AffectEnum.ANNOYANCE,
            AffectEnum.IMPATIENCE, AffectEnum.EXASPERATED, AffectEnum.MOVED);
        // surprise and relief
        put(SHORTEST, AffectEnum.SURPRISED, AffectEnum.AMAZEMENT, AffectEnum.STUNNED, AffectEnum.RELIEF,
            AffectEnum.AMUSED);
    }

    /** Duration relative to an average emotion; 1.0 for emotions not listed or unknown. */
    public static double Get(int iAffect) {
        Double d = DURATIONS.get(Integer.valueOf(iAffect));
        return (d == null) ? 1.0 : d.doubleValue();
    }
}
