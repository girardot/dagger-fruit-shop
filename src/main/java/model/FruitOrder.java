package model;

public class FruitOrder {

    private int quantity;

    private Fruit fruit;

    public FruitOrder(int quantity, Fruit fruit) {
        this.quantity = quantity;
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public Double getPrice() {
        double priceWithoutDiscount = fruit.getPrice() * quantity;
        return applyDiscount(priceWithoutDiscount);
    }

    private Double applyDiscount(double priceWithoutDiscount) {
        return fruit.getDiscountFunction().apply(this, priceWithoutDiscount);
    }

}
