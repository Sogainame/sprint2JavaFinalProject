package Service;

import Model.Food;
import Model.constants.Colour;
import Model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPriceWithoutDiscount() {
        double totalPrice = 0.0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].getPrice() * items[i].getAmount();
        }
        return totalPrice;
    }

    public double totalPriceWithDiscount() {
        double totalPrice = 0.0;
        for (int i = 0; i < items.length; i++) {
            double discount = items[i].getDiscount();
            double priceWithDiscount = items[i].getPrice() * discount;
            totalPrice += priceWithDiscount +items[i].getAmount();
        }
        return totalPrice;
    }

    public double totalVegeterianPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                totalPrice += items[i].getPrice() * items[i].getAmount();
            }
        }
        return totalPrice;
    }

}
