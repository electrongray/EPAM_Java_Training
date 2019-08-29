package vegetables;

import java.util.Comparator;

public class Salad {

    private Vegetable[] ingredients;
    private int currentIndex = 0;
    private final static int DEFAULT_CAPACITY = 10;

    public Salad(int saladCapacity) {
        this.ingredients = new Vegetable[saladCapacity];
    }

    public Salad() {
        this(DEFAULT_CAPACITY);
    }

    public Vegetable[] getIngredients() {
        return ingredients;
    }

    /**
     * Returns total value of calories in this salad.
     *
     */
    public int getOverallCalorificValue() {
        int total = 0;
        for (Vegetable vegetable : ingredients) {
            if (vegetable == null)
                break;
            total += vegetable.getCalorificValue();
        }
        return total;
    }

    /**
     * Adds ingredient to salad. Returns true if succeed, and false if salad is
     * full.
     *
     */
    public boolean addIngredient(Vegetable ingredient) {
        if (currentIndex < ingredients.length) {
            ingredients[currentIndex] = ingredient;
            currentIndex++;
            return true;
        } else
            return false;
    }

    /**
     * Removes ingredient from salad. Returns true if succeed, and false id
     * salad is empty.
     *
     */
    public boolean removeIngredient() {
        if (currentIndex >= 0) {
            ingredients[currentIndex] = null;
            currentIndex--;
            return true;
        } else
            return false;
    }

    /**
     * Returns first-to-find ingredient, which suits inserted conditions.
     *
     * @param fromCalorificValue
     *            - lower value, inclusive
     *@param toCalorificValue
     *            - higher value, inclusive
     * @return
     */
    public Vegetable getIngredient(int fromCalorificValue, int
            toCalorificValue) {
        for (Vegetable vegetable : ingredients) {
            if (vegetable == null)
                break;
            if (vegetable.getCalorificValue() >= fromCalorificValue
                    && vegetable.getCalorificValue() <=
                    toCalorificValue) {
                return vegetable;
            }
        }
        return null;
    }

    /**
     * Sorts this salad by ingredients weight, ascending.
     */
    public void sortIngredients() {
        for (int i = 0; i < currentIndex; i++) {
            int minIndex = i;
            for (int j = i; j < currentIndex; j++) {
                if (ingredients[j].getWeight() < ingredients
                        [minIndex].getWeight()) {
                    minIndex = j;
                }
            }
            Vegetable temp = ingredients[i];
            ingredients[i] = ingredients[minIndex];
            ingredients[minIndex] = temp;
        }
    }

    /**
     * Sorts this salad according to the order induced by the specified
     * {@link Comparator}.
     *
     * @param comp
     */
    public void sortIngredients(Comparator<Vegetable> comp) {
        for (int i = 0; i < currentIndex; i++) {
            int minIndex = i;
            for (int j = i; j < currentIndex; j++) {
                if (comp.compare(ingredients[j], ingredients
                        [minIndex]) > 0) {
                    minIndex = j;
                }
            }
            Vegetable temp = ingredients[i];
            ingredients[i] = ingredients[minIndex];
            ingredients[minIndex] = temp;
        }
    }
}