package NeonAffect;

import java.util.ArrayList;

/**
 * Container that pairs affect history items with behavior items.
 * Replaces the old {@code Object[]} two-element container.
 */
public class AffectHistoryBehaviors {

    private final ArrayList<AffectHistoryVar> affectHistory;
    private final ArrayList<BehaviorItem> behaviorList;

    public AffectHistoryBehaviors(ArrayList<AffectHistoryVar> affectHistory, ArrayList<BehaviorItem> behaviorList) {
        this.affectHistory = affectHistory;
        this.behaviorList = behaviorList;
    }

    public ArrayList<AffectHistoryVar> GetAffectHistory() { return affectHistory; }
    public ArrayList<BehaviorItem>     GetBehaviorList()  { return behaviorList; }
}
