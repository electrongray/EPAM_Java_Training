package PizzeriaPalmetto.src;

import java.util.Scanner;

        import static java.lang.System.*;

public class Ingredient implements Arrays {
    String[] arrayIngredient = new String[]{"Nothing ", "Tomato paste ", "Pepper ",
            "Garlic ", "Bacon ", "Cheese ", "Pepperoni ", "Olives "};

    @Override
    public String getArray() {
        out.println("<--All ingredients-->");
        return arrayIngredient[0] + arrayIngredient[1] +
                arrayIngredient[2] + arrayIngredient[3] +
                arrayIngredient[4] + arrayIngredient[5] +
                arrayIngredient[6] + arrayIngredient[7];

    }

    public static class IngredientsMargarita extends Ingredient {
        @Override
        public String getArray() {

            out.println("<--Ingredients for Margarita-->");
            return arrayIngredient[1] + arrayIngredient[2] + arrayIngredient[3] +
                    arrayIngredient[4] + arrayIngredient[5];
        }
    }

    public static class IngredientsPeperoniOro extends Ingredient {
        @Override
        public String getArray() {
            out.println("<--Ingredients for Pizza PepperoniOro-->");
            return arrayIngredient[1] + arrayIngredient[5] +
                    arrayIngredient[6] + arrayIngredient[7];
        }

    }

    public static class IngredientsClient extends Ingredient {


        @Override
        public String getArray() {
            out.println("<--Ingredients for Pizza Client's-->");
            int iNumbers[] = new int[8];
            int i;
            for (i = 0; i < 8; i++)
                iNumbers[i] = i;
            out.print("Components: ["
                    + iNumbers[0]);
            for (i = 1; i < iNumbers.length; i++)
                out.print("," + iNumbers[i]);
            out.println("]");

            String szLines[] =
                    {
                            " [0]:Nothing",
                            "[1]:Tomato Paste",
                            "[2]:Pepper",
                            "[3]:Garlic",
                            "[4]:Bacon",
                            "[5]:Cheese",
                            "[6]:Pepperoni",
                            "[7]:Olives"

                    };

            out.println(szLines[0]);
            for (i = 1; i < szLines.length; i++)
                out.println(" " + szLines[i]);
            out.println(" Choose, please ingredients for pizza!");
            out.println("And insert your variant in this form:\n ");

            out.print("IngredientsClient: ["
                    + iNumbers[0]);
            for (i = 1; i < iNumbers.length; i++)
                out.print("," + iNumbers[i]);
            out.println("]");
            out.println(" For example: 1,0,3,0,5,0,7,0 --> [1]-> ENTER, [0]->ENTER, [3]->ENTER, ... ");
            out.println("Where -[0]--> It is  refusing of component in any position.");

            Scanner scanner = new Scanner(in);
            String string = scanner.nextLine();
            String string1 = scanner.nextLine();
            String string2 = scanner.nextLine();
            String string3 = scanner.nextLine();
            String string4 = scanner.nextLine();
            String string5 = scanner.nextLine();
            String string6 = scanner.nextLine();
            String string7 = scanner.nextLine();

            for (int j = 0; j <8 ; j++) {
                String[] arrayString = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString[0] = string;
                String[] arrayString1 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString1[1] = string1;
                String[] arrayString2 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString2[2] = string2;
                String[] arrayString3 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString3[3] = string3;
                String[] arrayString4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString4[4] = string4;
                String[] arrayString5 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString5[5] = string5;
                String[] arrayString6 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString6[6] = string6;
                String[] arrayString7 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7"};
                arrayString7[7] = string7;

                if (string.equals(string1) || string.equals(string2) || string.equals(string3) ||
                        string.equals(string4) || string.equals(string5) || string.equals(string6) ||
                        string.equals(string7) || string1.equals(string2) || string1.equals(string3) ||
                        string1.equals(string4) || string1.equals(string5) || string1.equals(string6) ||
                        string1.equals(string7) || string2.equals(string3) || string2.equals(string4) ||
                        string2.equals(string5) || string2.equals(string6) || string2.equals(string7) ||
                        string3.equals(string4) || string3.equals(string5) || string3.equals(string6) ||
                        string3.equals(string7) || string4.equals(string5) || string4.equals(string6) ||
                        string4.equals(string7) || string5.equals(string6) || string5.equals(string7) ||
                        string6.equals(string7)) {
                    out.println("Ingredients REPEAT! Please CHECK and once more!");
                } else {
                    out.println(" Ingredients of Pizza is COMPLETE, Good work!");
                }
            }
            return arrayIngredient[Integer.parseInt(string, 8)] +
                    arrayIngredient[Integer.parseInt(string1, 8)] +
                    arrayIngredient[Integer.parseInt(string2, 8)] +
                    arrayIngredient[Integer.parseInt(string3, 8)] +
                    arrayIngredient[Integer.parseInt(string4, 8)] +
                    arrayIngredient[Integer.parseInt(string5, 8)] +
                    arrayIngredient[Integer.parseInt(string6, 8)] +
                    arrayIngredient[Integer.parseInt(string7, 8)] +
                    (arrayIngredient.length - 1);
        }

    }

}