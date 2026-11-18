package NeonAffect;

/**
 * A single behavior entry: pairs a behavior name with the timestamp
 * when it was recorded.  Replaces the old {@code Object[]} tuples.
 */
public class BehaviorItem {

    private final String behaviorName;
    private final long time;

    public BehaviorItem(String behaviorName, long time) {
        this.behaviorName = behaviorName;
        this.time = time;
    }

    public String GetBehaviorName() { return behaviorName; }
    public long GetTime()           { return time; }
}
