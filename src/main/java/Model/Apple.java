package Model;

import Model.constants.Colour;
import Model.constants.Discount;

public class Apple extends Food {
    private String colour;

     public Apple(int amount, double price, String colour) {
         super(amount, price, true);
         this.colour = colour;
     }
     public String getColour() {
         return colour;
     }

     @Override
     public double getDiscount() {
         if (colour.equals("red")) {
             return Discount.DISCOUNT_APPLE;
         }
         return 0.0;
     }
}
