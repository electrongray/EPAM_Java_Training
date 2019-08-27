package vegetables;

public abstract class Vegetable {
    protected int weight;
    protected int calorificValue;

    protected Vegetable(int weight, double colorValForGram) {
        this.weight = weight;
        this.calorificValue = (int) (weight * colorValForGram);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalorificValue() {
        return calorificValue;
    }

    public void setCalorificValue(int calorificValue) {
        this.calorificValue = calorificValue;
    }
}