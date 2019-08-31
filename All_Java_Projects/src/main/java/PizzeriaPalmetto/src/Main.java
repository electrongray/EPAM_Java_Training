package PizzeriaPalmetto.src;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please insert Pizza Name twice: ");
        NamePizzaOrder.NamePizzaDefault namePizDefault =
                new NamePizzaOrder.NamePizzaDefault();
        System.out.println("namePizDefault --> " + namePizDefault.getOrder());

        NamePizzaOrder.NamePizzaClient namePizClient =
                new NamePizzaOrder.NamePizzaClient();
        System.out.println("namePizClient --> " + namePizClient.getOrder());

        System.out.println();
        Ingredient ingredient = new Ingredient();
        Ingredient.IngredientsPeperoniOro ingredientsPeperoniOro =
                new Ingredient.IngredientsPeperoniOro();
        Ingredient.IngredientsMargarita ingredientsMargarita =
                new Ingredient.IngredientsMargarita();
        Ingredient.IngredientsClient ingredientsClient =
                new Ingredient.IngredientsClient();

        System.out.println();
        System.out.println(ingredient.getArray());
        System.out.println();
        System.out.println(ingredientsPeperoniOro.getArray());
        System.out.println();
        System.out.println(ingredientsMargarita.getArray());
        System.out.println();
        System.out.println(ingredientsClient.getArray());

        System.out.println();

        PriceOrder.PriceOrderStandardFull priceStandFull =
                new PriceOrder.PriceOrderStandardFull();
        PriceOrder.PriceOrderCalzoneFull priceCalzFull =
                new PriceOrder.PriceOrderCalzoneFull();
        PriceOrder.PriceOrderSumTotal priceOrderSumTotal =
                new PriceOrder.PriceOrderSumTotal();

        System.out.println();
        System.out.println("Insert Please: Order Number, Client Number," +
                " Pizza Name, Quantity Pizza, Type Pizza");
        System.out.println("For normally passing test, insert \"1\" in any case");
                Attributes.AttributesPizza attributesPizza = new
                        Attributes.AttributesPizza();

        Attributes.AttributesCreator attributesCreator = new
                Attributes.AttributesCreator();

        System.out.println();
        Attributes.AttributesPizza attributesPizza1=
                attributesCreator.createAttributes
                        ("01010","0101","Margarita","2","2");

        System.out.println( "[" + "orderNumber: "+ attributesPizza1.orderNumber
                +"|clientNumber: " + attributesPizza1.clientNumber + "|pizzaName: "
                + attributesPizza1.pizzaName
                + "|quantityPizza: " + attributesPizza1.quantityPizza
                + "|typePizza: " + attributesPizza1.typePizza +"]");

        System.out.println();
        System.out.println("Insert Please: Order Number, Client Number," +
                " Ingredient, Quantity Pizza");
                OrderClient.OrderProperty orderProperty =
                        new OrderClient.OrderProperty();
        OrderClient.OrderCreator orderCreator = new OrderClient.OrderCreator();

        OrderClient.OrderProperty orderProperty3 = orderCreator.createOrder
                ("00001","0001","4","1");
        OrderClient.OrderProperty orderProperty2 = orderCreator.createOrder
                ("10011","7707","4", "3");
        OrderClient.OrderProperty orderProperty1 = orderCreator.createOrder
                ("10001","7707","4", "2");
        System.out.println();

        System.out.println( "orderNumber: " + orderProperty1.orderNumber + "; " +
                "clientNumber: " + orderProperty1.clientNumber + "; " +
                "ingredientClient: " + orderProperty1.ingredientClient + "; " +
                "quantityPizza: " + orderProperty1.quantityPizza);
        System.out.println( "orderNumber: " + orderProperty2.orderNumber + "; " +
                "clientNumber: " + orderProperty2.clientNumber + "; " +
                "1ingredientClient: " + orderProperty2.ingredientClient + "; " +
                "quantityPizza: " + orderProperty2.quantityPizza);
        System.out.println( "orderNumber: " + orderProperty3.orderNumber + "; " +
                "clientNumber: " + orderProperty3.clientNumber + "; " +
                "1ingredientClient: " + orderProperty3.ingredientClient + "; " +
                "quantityPizza: " + orderProperty3.quantityPizza);
        System.out.println();

        System.out.println("PriceOrderStandardFull = " + priceStandFull.getPrice());
        System.out.println("PriceOrderCalzoneFull = " + priceCalzFull.getPrice());
        System.out.println("PriceOrderSumTotal = " + priceOrderSumTotal.getPrice());
        System.out.println();

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z");
        System.out.println("Date: " + dateFormat.format( new Date() ) );

        System.out.println("*********************************");
        System.out.println("--------------------------------");
        System.out.println("Order: "+ orderProperty1.orderNumber);
        System.out.println("Client: " + orderProperty1.clientNumber);
        System.out.println("PizzaName: " + namePizClient.string);
        System.out.println("--------------------------------");
        System.out.println("Pizza Base (Calzone)        "
                +priceCalzFull.pricePizzaBaseCalzone +"€");
        System.out.println("Tomato paste                " +
                priceCalzFull.priceTomatoPaste +"€");
        System.out.println("Pepper                      " +
                priceCalzFull.pricePepper +"€");
        System.out.println("Garlic                      " +
                priceCalzFull.priceGarlic +"€");
        System.out.println("Bacon                       " +
                priceCalzFull.priceBacon +"€");
        System.out.println("--------------------------------");
        System.out.println("Total:                      "+priceCalzFull.getPrice()+
                "€");
        System.out.println("Amount:                     "
                +orderProperty1.quantityPizza );
        System.out.println("--------------------------------");
        System.out.println("*********************************");
        System.out.println("--------------------------------");
        System.out.println("Total amount:               " +
                priceCalzFull.totalAmount2+"€");
        System.out.println("--------------------------------");
        System.out.println("Date: " + dateFormat.format( new Date() ));
        System.out.println("*********************************");
        System.out.println();
        System.out.println("*********************************");
        System.out.println("--------------------------------");
        System.out.println("Order: "+ orderProperty2.orderNumber);
        System.out.println("Client: " + orderProperty2.clientNumber);
        System.out.println("PizzaName: " + namePizDefault.pizzaDefault);
        System.out.println("--------------------------------");
        System.out.println("Pizza Base                  "
                +priceStandFull.pricePizzaBaseStandard +"€");
        System.out.println("Tomato paste                " +
                priceStandFull.pricePepperoni +"€");
        System.out.println("Pepper                      " +
                priceStandFull.priceCheese +"€");
        System.out.println("Garlic                      " +
                priceStandFull.priceOlives +"€");
        System.out.println("Bacon                       " +
                priceStandFull.priceTomatoPaste +"€");
        System.out.println("--------------------------------");
        System.out.println("Total:                      "+priceStandFull.getPrice()+ "€");
        System.out.println("Amount:                     "
                +orderProperty2.quantityPizza );
        System.out.println("--------------------------------");
        System.out.println("*********************************");
        System.out.println("--------------------------------");
        System.out.println("Total amount:               " +
                priceStandFull.totalAmount3+"€");
        System.out.println("--------------------------------");
        System.out.println("*********************************");
        System.out.println("--------------------------------");
        System.out.println("Total total amount:         " +priceOrderSumTotal.getPrice()+"€");
        System.out.println("--------------------------------");
        System.out.println("*********************************");
        System.out.println("Date: " + dateFormat.format( new Date() ));
        System.out.println("*********************************");
    }
}













