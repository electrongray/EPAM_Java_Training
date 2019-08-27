import java.util.*;

public class OrderClient {

    public static class OrderProperty {

        public String ingredientClient;
        public String orderNumber;
        public String clientNumber;
        public String quantityPizza;
    }

    public static class OrderCreator {

        Builder builder = new Builder();

        public OrderProperty createOrder(String orderNumber,
                                         String clientNumber,
                                         String ingredientClient,
                                         String quantityPizza) {
            builder.create();
            builder.setOrderNumber(orderNumber);
            builder.setClientNumber(clientNumber);
            builder.setQuantityPizza(quantityPizza);
            builder.setIngredientClient(ingredientClient);
            return builder.getOrderProperty();
        }
    }

    public static class Builder {
        public OrderProperty orderProperty;

        public void create(){
            orderProperty = new OrderProperty();
        }

        public void setOrderNumber(String orderNumber) {
                String string = "000";
                Scanner scanner= new Scanner(System.in);
                String inputString= scanner.nextLine();
                System.out.println("inputString --->" + inputString);
                if (inputString.length() >= 0) {
                    StringBuilder sb = new StringBuilder();
                    while (sb.length() < string.length() - inputString.length()) {
                        sb.append(string);
                    }
                    String idOrder = string + inputString;
                    System.out.println("idClient------->>" + idOrder);
                    ArrayList arrayIdOrder = new ArrayList(Collections.singleton(idOrder));
                    System.out.println("arrayIdClient-->>>" + arrayIdOrder);

                this.orderProperty.orderNumber = orderNumber;
                System.out.println("orderNumber " + orderNumber);
                System.out.println("idOrder" + arrayIdOrder);
            }
        }
            public void setClientNumber (String clientNumber) {
                String string = "000";
                Scanner scanner= new Scanner(System.in);
                String inputString= scanner.nextLine();
                System.out.println("inputString --->" + inputString);
                if (inputString.length() >= 0) {
                    StringBuilder sb = new StringBuilder();
                    while (sb.length() < string.length() - inputString.length()) {
                        sb.append(string);
                    }
                    String idClient = string + inputString;
                    System.out.println("idClient------->>" + idClient);
                    ArrayList arrayIdClient = new ArrayList(Collections.singleton(idClient));
                    System.out.println("arrayIdClient-->>>" + arrayIdClient);

                    this.orderProperty.clientNumber = clientNumber;
                    System.out.println("clientNumber" + clientNumber);
                    System.out.println("idClient" + idClient);

                }
            }

            public void setIngredientClient (String ingredientClient) {

                Scanner scanner= new Scanner(System.in);
                String inputString= scanner.nextLine();
                int ingredientQuantity =Integer.parseInt(inputString);
                    System.out.println("ingredientQuantity---->>" +ingredientQuantity);

                    List arrayQuantityIngredient = new ArrayList(ingredientQuantity);
                    arrayQuantityIngredient.add(ingredientQuantity);
                    System.out.println(arrayQuantityIngredient);
                    arrayQuantityIngredient=Collections.singletonList
                            (orderProperty.ingredientClient);
                    this.orderProperty.ingredientClient = ingredientClient;
                    System.out.println("ingredientClient" + ingredientClient);
                    System.out.println("ingredientQuantity" + ingredientQuantity);
                }
        public void setQuantityPizza (String quantityPizza) {

            Scanner scanner= new Scanner(System.in);
            String inputString= scanner.nextLine();
            int pizzaQuantity =Integer.parseInt(inputString);
            System.out.println("pizzaQuantity---->>" + pizzaQuantity);
            List arrayQuantityPizza = new ArrayList(pizzaQuantity);
            arrayQuantityPizza.add(pizzaQuantity);
            System.out.println(arrayQuantityPizza);
            arrayQuantityPizza = Collections.singletonList
                    (orderProperty.quantityPizza);
            this.orderProperty.quantityPizza = quantityPizza;
            System.out.println("quantityPizza" + quantityPizza);
            System.out.println("pizzaQuantity" + pizzaQuantity);
        }


        public OrderProperty getOrderProperty () {
                return this.orderProperty;
            }

        }

    }
