package PizzeriaPalmetto.src;

import java.util.*;

public class Attributes {

    public static class AttributesPizza {

        public String orderNumber;
        public String clientNumber;
        public String pizzaName;
        public String quantityPizza;
        public String typePizza;
    }

    public static class AttributesCreator {
        Builder builder = new Builder();

        public AttributesPizza createAttributes(String orderNumber,
                                                String clientNumber,
                                                String pizzaName,
                                                String quantityPizza,
                                                String typePizza) {
            builder.create();
            builder.setOrderNumber(orderNumber);
            builder.setClientNumber(clientNumber);
            builder.setPizzaName(pizzaName);
            builder.setQuantityPizza(quantityPizza);
            builder.setTypePizza(typePizza);
            return builder.getAttributesPizza();
        }

    }

    public static class Builder {
        public AttributesPizza attributesPizza;

        public void create() {
            attributesPizza = new AttributesPizza();
        }

        public void setOrderNumber(String orderNumber) {
            String string = "000";
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            System.out.println("inputString --->" + inputString);
            if (inputString.length() >= 0) {
                StringBuilder sb = new StringBuilder();
                while (sb.length() < string.length() - inputString.length()) {
                    sb.append(string);
                }
                String idClient = string + inputString;
                System.out.println("idClient------->>" + idClient);
                ArrayList arrayIdOrder = new ArrayList(Collections.singleton(idClient));
                System.out.println("arrayIdClient-->>>" + arrayIdOrder);

                this.attributesPizza.orderNumber = orderNumber;
                System.out.println("arrayIdOrder" + arrayIdOrder);
                System.out.println("orderNumber" + orderNumber);
            }
        }

        public void setClientNumber(String clientNumber) {
            String string = "000";
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
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

                this.attributesPizza.clientNumber = clientNumber;
                System.out.println("arrayIdClient" + arrayIdClient);
                System.out.println("orderNumber" + clientNumber);
            }
        }

        public void setPizzaName(String pizzaName) {
            String string = "Client_name_";
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            System.out.println("inputString --->" + inputString);
            if (inputString.length() >= 0) {
                StringBuilder sb = new StringBuilder();
                while (sb.length() < string.length() - inputString.length()) {
                    sb.append(string);
                }
                String idPizzaName = string + inputString;
                System.out.println("idClient------->>" + idPizzaName);
                ArrayList arrayIdPizzaName = new ArrayList(Collections.singleton(idPizzaName));
                System.out.println("arrayIdClient-->>>" + arrayIdPizzaName);
                this.attributesPizza.pizzaName = pizzaName;
                System.out.println("arrayIdPizzaName" + arrayIdPizzaName);
                System.out.println("pizzaName " + pizzaName);
            }
        }

        public void setQuantityPizza(String quantityPizza) {

            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            int pizzaQuantity = Integer.parseInt(inputString);
            System.out.println("pizzaQuantity---->>" + pizzaQuantity);
            List arrayQuantityPizza = new ArrayList(pizzaQuantity);
            Iterator iterator = arrayQuantityPizza.iterator();
            arrayQuantityPizza.add(pizzaQuantity);
            System.out.println(arrayQuantityPizza);
            arrayQuantityPizza = Collections.singletonList(pizzaQuantity);
            this.attributesPizza.quantityPizza = quantityPizza;
            System.out.println("arrayQuantityPizza" + arrayQuantityPizza);
            System.out.println("quantityPizza" + quantityPizza);
        }

        public void setTypePizza(String typePizza) {

            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            System.out.println("Insert Pizza Type: ");
            int pizzaType = Integer.parseInt(inputString);
            System.out.println("pizzaType---->>" + pizzaType);
            List arrayPizzaType = new ArrayList(pizzaType);
            Iterator iterator = arrayPizzaType.iterator();
            arrayPizzaType.add(pizzaType);
            System.out.println(arrayPizzaType);
            arrayPizzaType = Collections.singletonList(arrayPizzaType);
            this.attributesPizza.typePizza = typePizza;
            System.out.println("arrayPizzaType" + arrayPizzaType);
            System.out.println("typePizza" + typePizza);
        }

        public AttributesPizza getAttributesPizza() {
            return this.attributesPizza;
        }
    }
}
