import java.util.Scanner;

public class NamePizzaOrder implements Order {
    String namePizza=" ";
    String pizzaDefault= "Client_Name_№_order";
    String string;

    @Override
    public String getOrder() {

        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            counter++;
            if (string.length() < 4 || string.length() > 20) {
            } else {
                if (string.length() > 3 && string.length() < 21) ;
            }
        }
        return namePizza;
    }
    public static class NamePizzaClient extends NamePizzaOrder{
        public NamePizzaClient() {
        }
        @Override
        public String getOrder() {
            return super.getOrder()+string;
        }
    }
    public static class NamePizzaDefault extends NamePizzaOrder{
        public NamePizzaDefault() {

        }
        @Override
        public String getOrder() {
            return super.getOrder()+ pizzaDefault;
        }

    }
}