import Model.Food;
import Model.Meat;
import Model.Apple;
import Model.constants.Colour;
import Service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
    }

    Meat meat = new Meat(5, 100);
    Apple redApple = new Apple(10, 50, Colour.RED);
    Apple greenApple = new Apple(8, 60, Colour.GREEN);


    Food[] items = {meat, redApple, greenApple};

    ShoppingCart cart = new ShoppingCart(items);

    System.out.println("Общая сумма товаров без скидки " + cart.totalPriceWithoutDiscount());
    System.out.println("Общая сумма товаров со скидкой " + cart.totalPriceWithDiscount());
    System.out.println("Сумма вегетарианских товаров без скидки: " + cart.totalVegeterianPrice());
}