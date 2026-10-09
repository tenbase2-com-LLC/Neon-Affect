package NeonAffect;

/**
 * Turns a described situation into a 24-dimension appraisal vector.
 *
 * <p>This is the step the system did not have. {@link AppraisalUtils#GetAppraisalType}
 * takes 24 floats and matches them against per-personality prototypes, but
 * nothing produced those floats - every caller had to supply them by hand.</p>
 *
 * <p>An interface rather than a single class because the two implementations
 * differ in a way that matters at development time, not just in wiring:
 * {@link OpenAIAppraisalSource} costs money and needs a network, and
 * {@link ScriptedAppraisalSource} costs nothing and is deterministic. Appraisal
 * work means running the classifier hundreds of times over the same handful of
 * situations while tuning prototypes, and paying per call for that is the kind
 * of friction that stops the tuning happening.</p>
 *
 * <p>It is also the seam to move the network call behind if
 * {@code OpenAIClassLibrary} ever gains a {@code DetermineAppraisal} method:
 * only the implementation changes, not {@link AppraisalClassifier} or anything
 * downstream of it.</p>
 */
public interface IAppraisalSource {

    /**
     * @param situation       free text describing what happened, from the
     *                        appraising agent's point of view
     * @param personalityType four-letter MBTI code, e.g. {@code "INFJ"}. Passed
     *                        because appraisal is not observer-independent -
     *                        the same event is a challenge to one type and a
     *                        threat to another, and that difference belongs in
     *                        the vector rather than being applied afterwards.
     * @return an appraisal with all 24 dimensions in 0.0-1.0
     * @throws Exception if the appraisal could not be produced. Deliberately
     *                   not a fabricated neutral vector: a vector of 0.5s is
     *                   indistinguishable from a real appraisal downstream and
     *                   would be classified with full confidence.
     */
    AffectAppraisal DetermineAppraisal(String situation, String personalityType)
        throws Exception;
}
