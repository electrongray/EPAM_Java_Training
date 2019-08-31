package PizzeriaPalmetto.src;

class PriceOrder implements Price {

             double priceTomatoPaste = 1.00;
             double pricePepper = 0.60;
             double priceGarlic = 0.30;
             double priceBacon = 1.20;
             double priceCheese = 1.00;
             double pricePepperoni = 1.50;
             double priceOlives = 0.50;
             double totalAmount;
             double totalAmount2;
             double totalAmount3;
             double quantityPizza2 = 2;
             double quantityPizza3 = 3;
             double quantityPizza;
             double sum;
             double sum2;
             double sum3;
             double sumTotal;

             @Override
             public double getPrice() {

                 sum = (priceTomatoPaste
                         + pricePepper
                         + priceGarlic
                         + priceBacon
                         + priceCheese
                         + pricePepperoni
                         + priceOlives);
                 totalAmount = quantityPizza * sum;
                 return sum;
             }

             static class PriceOrderStandardFull extends PriceOrder {
                 double pricePizzaBaseStandard = 1.00;

                 @Override
                 public double getPrice() {
                     sum3 = priceOlives
                             + priceCheese
                             + pricePepperoni
                             + priceTomatoPaste
                             + pricePizzaBaseStandard;
                     totalAmount3 = quantityPizza3 * sum3;
                     return super.getPrice()
                             + pricePizzaBaseStandard
                             - priceGarlic
                             - pricePepper
                             - priceBacon;

                 }
             }

             static class PriceOrderCalzoneFull extends PriceOrder {
                 double pricePizzaBaseCalzone = 1.50;

                 @Override
                 public double getPrice() {
                     sum2 = priceTomatoPaste
                             + pricePepper
                             + priceBacon
                             + priceGarlic
                             + pricePizzaBaseCalzone;
                     totalAmount2 = quantityPizza2 * sum2;
                     return super.getPrice()
                             + pricePizzaBaseCalzone
                             - priceCheese
                             - priceOlives
                             - pricePepperoni;
                 }
             }

             public static class PriceOrderSumTotal extends PriceOrder {

                 @Override
                 public double getPrice() {
                     sumTotal = totalAmount2 + totalAmount3;

                     return super.getPrice()*4-priceBacon+priceCheese;
                 }
             }

         }