package ChiefCooker.src.vegetables;

public class Carrot extends vegetables.Vegetable {
    public final static double CALORIFIC_VAL_1GR = 0.32;
    public final static String COLOR = "Red";
    private String petalColor;
    private String fruitForm;

    public Carrot(int weight, String petalColor, String fruitForm) {
        super(weight, CALORIFIC_VAL_1GR);
        this.petalColor = petalColor;
        this.fruitForm = fruitForm;
    }

    public String getPetalColor() {
        return petalColor;
    }

    public void setPetalColor(String petalColor) {
        this.petalColor = petalColor;
    }

    public String getFruitForm() {
        return fruitForm;
    }

    public void setFruitForm(String fruitForm) {
        this.fruitForm = fruitForm;
    }

    @Override
    public String toString() {
        return COLOR + " carrot, weight: "
                + weight + " gram, petal color: "
                + petalColor + ", fruit form: "
                + fruitForm + ", calorific value: "
                + calorificValue + " k_cal.";
    }
}
