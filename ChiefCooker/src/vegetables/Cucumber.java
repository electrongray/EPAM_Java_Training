package vegetables;

public class Cucumber extends Vegetable {
    public final static double CALORIFIC_VAL_1GR = 0.15;
    public final static String COLOR = "Green";
    private int footstalkLength;
    private String leavesType;

    public Cucumber(int weight, int footstalkLength, String leavesType) {
        super(weight, CALORIFIC_VAL_1GR);
        this.footstalkLength = footstalkLength;
        this.leavesType = leavesType;
    }

    public int getFootstalkLength() {
        return footstalkLength;
    }

    public void setFootstalkLength(int footstalkLength) {
        this.footstalkLength = footstalkLength;
    }

    public String getLeavesType() {
        return leavesType;
    }

    public void setLeavesType(String leavesType) {
        this.leavesType = leavesType;
    }

    @Override
    public String toString() {
        return COLOR + " cucumber, weight: "
                + weight + " gram, leaves type: "
                + leavesType + ", foots_talk length: "
                + footstalkLength + " mm., calorific value: "
                + calorificValue + " k_cal.";
    }
}
