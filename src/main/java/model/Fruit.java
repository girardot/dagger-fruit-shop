package model;

import model.discount.DiscountFunction;
import model.discount.NBuyOneFreeDiscountFunction;
import model.discount.PercentageDiscountFunction;

import java.util.function.Function;

public enum Fruit {

    ORANGE(1, new NBuyOneFreeDiscountFunction(3)),
    BANANA(1.5, new PercentageDiscountFunction(0.2)),
    MANGO(3, new PercentageDiscountFunction(0.15)),
    CHERRY(2.5, new NBuyOneFreeDiscountFunction(3));

    private Double price;

    private DiscountFunction discountFunction;

    Fruit(double price, DiscountFunction discountFunction) {
        this.price = price;
        this.discountFunction = discountFunction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DiscountFunction getDiscountFunction() {
        return discountFunction;
    }

    public void setDiscountFunction(DiscountFunction discountFunction) {
        this.discountFunction = discountFunction;
    }

}
