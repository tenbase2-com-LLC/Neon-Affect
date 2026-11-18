package NeonAffect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlanUtils {

    private static final Pattern UPPERCASE = Pattern.compile("[A-Z]");

    public static String InsertSpaces(String strPlanName) {
        var str = strPlanName.replace("Plan", "");
        var out = new StringBuilder(str);
        Matcher m = UPPERCASE.matcher(str);
        int extraFeed = 0;
        while (m.find()) {
            if (m.start() != 0) {
                out.insert(m.start() + extraFeed, " ");
                extraFeed++;
            }
        }
        return out.toString().trim();
    }

    /**
     * The name a plan is shown as when it is offered to a judge (LLM or otherwise).
     * This is the single definition of the prompt-side name transform; response
     * matching must reproduce it exactly, so both sides call this method.
     *
     * @param strBareName     plan name with {@link Constants#NEON_NAMESPACE} already stripped
     * @param strEmotionLower the emotion, lower-cased, as the prompt uses it
     */
    public static String DisplayName(String strBareName, String strEmotionLower) {
        String str = strBareName.replace(strEmotionLower, "").trim();
        return InsertSpaces(str);
    }

    /**
     * Loose key for matching a name a judge echoed back against a name we sent.
     * Ignores case, spacing and punctuation, so "Clench Fists", "clench fists"
     * and "ClenchFists" all match.
     */
    public static String NormaliseName(String strName) {
        if (strName == null) return "";
        return strName.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    /**
     * Parses a percentage such as "35%" or " 35 ".
     *
     * @return the value, or -1 if nothing usable was present. -1 is deliberately
     *         distinct from a legitimate 0 so an unparseable row can be discarded
     *         rather than silently treated as a real score of zero.
     */
    public static int ParsePercentage(String strPercentage) {
        if (strPercentage == null) return -1;
        String strDigits = strPercentage.replaceAll("[^0-9]", "");
        if (strDigits.isEmpty()) return -1;
        try {
            return Integer.parseInt(strDigits);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static boolean ContainsCorrectPlan(String strPlanName) {
        return !strPlanName.contains("WaitLibrary")
            && !strPlanName.contains("DebugLibrary")
            && !strPlanName.contains("SetFormulaLibrary")
            && !strPlanName.contains("SetPlanContext")
            && !strPlanName.contains("GetBehavior")
            && !strPlanName.contains("GetPlanFormulas")
            && !strPlanName.contains("GetSelectedPlans")
            && !strPlanName.contains("SetFormulaPlan")
            && !strPlanName.contains("GetFormulasPlan");
    }
}
