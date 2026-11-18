package NeonAffect;

/**
 * Situation text to affect, end to end.
 *
 * <pre>
 *   situation + MBTI type
 *        |  IAppraisalSource            (this is the piece that was missing)
 *        v
 *   AffectAppraisal, 24 dimensions
 *        |  AppraisalUtils.GetAppraisalMatch
 *        v
 *   PersonalityAppraisals.get(type) -> prototypes for that type
 *        |  AffectAppraisalCalculator.GetBestMatch, cosine
 *        v
 *   AppraisalMatch: affect index + the margin it was decided by
 * </pre>
 *
 * <p>This is the class a plan calls. Everything below it already existed; only
 * the first arrow is new.</p>
 */
public class AppraisalClassifier {

    private final IAppraisalSource source;
    private final AppraisalUtils utils = new AppraisalUtils();
    private final boolean bDebug;

    public AppraisalClassifier(IAppraisalSource source, boolean bDebug) {
        if (source == null) {
            throw new IllegalArgumentException("appraisal source is null");
        }
        this.source = source;
        this.bDebug = bDebug;
        this.utils.bDebug = bDebug;
    }

    /**
     * Offline classifier over the built-in scripted vectors. No network, no cost,
     * deterministic - use this while tuning prototypes.
     */
    public static AppraisalClassifier scripted(boolean bDebug) {
        return new AppraisalClassifier(new ScriptedAppraisalSource(bDebug), bDebug);
    }

    /** Live classifier. Needs {@code OPENAI_API_KEY}. */
    public static AppraisalClassifier live(boolean bDebug) {
        return new AppraisalClassifier(new OpenAIAppraisalSource(bDebug), bDebug);
    }

    /**
     * Confidence below which a classification is reported as a near-tie.
     * See {@link AppraisalUtils#minConfidence}.
     */
    public void setMinConfidence(double minConfidence) {
        utils.minConfidence = minConfidence;
    }

    /**
     * Classifies, reporting the winner, the runner-up and the margin.
     *
     * <p>Prefer this to {@link #classify}. With 158 prototypes the top
     * candidates are routinely near-tied, and an index on its own reports a
     * coin-toss and a clear win identically - which is where the implausible
     * classifications come from, not from the appraisal being wrong.</p>
     */
    public AppraisalMatch classifyMatch(String situation, String personalityType)
        throws Exception {

        AffectAppraisal appraisal =
            source.DetermineAppraisal(situation, personalityType);

        if (bDebug) {
            System.out.println("AppraisalClassifier: " + appraisal);
        }

        return utils.GetAppraisalMatch(appraisal, personalityType);
    }

    /**
     * @return the {@link AffectEnum} index of the best-matching affect
     * @throws Exception if the appraisal could not be produced or no affect matched
     */
    public int classify(String situation, String personalityType)
        throws Exception {
        return classifyMatch(situation, personalityType).getIndex();
    }

    /** As {@link #classify}, returning the affect name rather than its index. */
    public String classifyToName(String situation, String personalityType)
        throws Exception {
        return AffectEnum.GetName(classify(situation, personalityType));
    }

    /**
     * The appraisal on its own, without classifying it.
     *
     * <p>Worth having separately: when a classification looks wrong the first
     * question is always whether the appraisal was wrong or the prototypes
     * were, and those two failures need different fixes. Printing the vector
     * answers it directly.</p>
     */
    public AffectAppraisal appraise(String situation, String personalityType)
        throws Exception {
        return source.DetermineAppraisal(situation, personalityType);
    }
}
