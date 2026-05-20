package NeonAffect;

/**
 * A selected plan entry: pairs a plan name with its formula.
 * Replaces the old {@code Object[]} tuples.
 */
public class SelectedPlan implements java.io.Serializable {

    private final String planName;
    private final String formula;

    public SelectedPlan(String planName, String formula) {
        this.planName = planName;
        this.formula = formula;
    }

    public String GetPlanName() { return planName; }
    public String GetFormula()  { return formula; }
}
