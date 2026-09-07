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
