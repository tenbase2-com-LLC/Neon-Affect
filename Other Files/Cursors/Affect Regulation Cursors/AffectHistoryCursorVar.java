package NeonAffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class AffectHistoryCursorVar extends Observable {

    private final List<AffectHistoryVar> values = new ArrayList<>();
    private double dLevelVelocity = 0d;

    public void SetValue(AffectHistoryVar item) {
        values.add(item);
        setChanged();
        notifyObservers();
    }

    public List<AffectHistoryVar> GetItems() {
        return values;
    }

    public void SetLevelVelocity(double dValue) {
        dLevelVelocity = dValue;
    }

    public double GetLevelVelocity() {
        return dLevelVelocity;
    }
}
