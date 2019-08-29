
         class PriceOrder implements Price {

             double priceTomatoPaste = 1.00;
             public double pricePepper = 0.60;
             public double priceGarlic = 0.30;
             public double priceBacon = 1.20;
             public double priceCheese = 1.00;
             public double pricePepperoni = 1.50;
             public double priceOlives = 0.50;
             public double totalAmount;
             public double totalAmount2;
             public double totalAmount3;
             public double quantityPizza2 = 2;
             public double quantityPizza3 = 3;
             public double quantityPizza;
             public double sum;
             public double sum2;
             public double sum3;
             public double sumTotal;

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