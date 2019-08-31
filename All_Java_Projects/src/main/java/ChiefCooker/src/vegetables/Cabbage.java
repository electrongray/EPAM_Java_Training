package ChiefCooker.src.vegetables;

public class Cabbage extends vegetables.Vegetable {

    public final static double CALORIFIC_VAL_1GR = 0.27;
    public final static String COLOR = "Green";
    private int leavesCount;

    public Cabbage(int weight, int leavesCount) {
        super(weight, CALORIFIC_VAL_1GR);
        this.leavesCount = leavesCount;
    }

    public int getLeavesCount() {
        return leavesCount;
    }

    public void setLeavesCount(int leavesCount) {
        this.leavesCount = leavesCount;
    }

    @Override
    public String toString() {
        return COLOR + " cabbage, weight: "
                + weight + " gram, leaves count: "
                + leavesCount + ", calorific value: "
                + calorificValue + " k_cal.";
    }
}