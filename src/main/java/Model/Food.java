package Model;

public abstract class Food implements Discountable {
    protected int amount; //количество кг
    protected double price; //цена за кг
    protected boolean isVegetarian; //флаг

    public Food (int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getDiscount() {
        return 0.0;
    }
}

