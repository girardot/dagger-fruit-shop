package model.discount;

import model.FruitOrder;

public class PercentageDiscountFunction extends DiscountFunction {

    private Double percentage;

    public PercentageDiscountFunction(Double percentage) {
        this.percentage = percentage;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public Double apply(FruitOrder fruitOrder, Double price) {
        return price - price * percentage;
    }

}
