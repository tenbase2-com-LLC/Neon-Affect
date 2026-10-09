package NeonAffect;

/**
 * Offline check of the appraisal pipeline. No network, no cost.
 *
 * <pre>
 *   test-appraisal.bat
 * </pre>
 *
 * <p>Runs the four scripted situations across a spread of personality types and
 * prints the affect each one classifies to, together with the margin it was
 * decided by. The point is not that any particular answer is right - that is
 * what prototype tuning is for - but that the pipeline is connected and that
 * the CONFIDENCE column is visible, because that is the column that says
 * whether an answer means anything.</p>
 */
public final class AppraisalSmokeTest {

    private AppraisalSmokeTest() {}

    private static final String[] SITUATIONS = {
        "I made a mistake that cost us the contract",
        "A colleague took credit for my work in front of the team",
        "The building alarm goes off and nobody knows why",
        "I finished the hard part of the project ahead of schedule"
    };

    private static final String[] TYPES = { "INFJ", "ESTP", "INTJ", "ESFJ" };

    public static void main(String[] args) {
        AppraisalClassifier classifier = AppraisalClassifier.scripted(false);
        // The near-tie warnings go to stderr and would interleave with the
        // table; this run prints the confidence for every row instead.
        classifier.setMinConfidence(0.0);

        int ok = 0;
        int failed = 0;
        int nearTies = 0;

        for (String situation : SITUATIONS) {
            System.out.println();
            System.out.println(situation);
            System.out.printf("    %-5s  %-24s %-8s %-8s %-8s %s%n",
                "type", "affect", "score", "margin", "conf", "runner-up");
            for (String type : TYPES) {
                try {
                    AppraisalMatch m = classifier.classifyMatch(situation, type);
                    System.out.printf("    %-5s  %-24s %-8.4f %-8.4f %-7.1f%% %s%s%n",
                        type,
                        AffectEnum.GetName(m.getIndex()),
                        m.getScore(),
                        m.getMargin(),
                        m.getConfidence() * 100.0,
                        AffectEnum.GetName(m.getRunnerUpIndex()),
                        m.isNearTie() ? "   <- NEAR-TIE" : "");
                    if (m.isNearTie()) {
                        nearTies++;
                    }
                    ok++;
                } catch (Exception e) {
                    System.out.printf("    %-5s  FAILED: %s%n", type, e.getMessage());
                    failed++;
                }
            }
        }

        // An unregistered situation must fail loudly rather than return a
        // fabricated vector - that behaviour is the whole point of the scripted
        // source, so it is worth asserting.
        System.out.println();
        try {
            classifier.classify("something nobody registered", "INFJ");
            System.out.println("UNEXPECTED: unregistered situation did not fail");
            failed++;
        } catch (Exception e) {
            System.out.println("unregistered situation correctly refused");
            ok++;
        }

        System.out.println();
        System.out.println(ok + " ok, " + failed + " failed, "
            + nearTies + " near-tie(s) below "
            + (AppraisalMatch.DEFAULT_MIN_CONFIDENCE * 100.0) + "% confidence");
        System.out.println();
        System.out.println("A near-tie is not a test failure. It means the "
            + "prototypes did not separate the");
        System.out.println("candidates, so that row's affect is arbitrary - "
            + "which is worth seeing rather than");
        System.out.println("silently accepting.");

        System.exit(failed == 0 ? 0 : 1);
    }
}
