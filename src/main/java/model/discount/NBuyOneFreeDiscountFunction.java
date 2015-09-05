package model.discount;

import model.FruitOrder;

public class NBuyOneFreeDiscountFunction extends DiscountFunction {

    private int quantityToBuy;

    public NBuyOneFreeDiscountFunction(int quantityToBuy) {
        this.quantityToBuy = quantityToBuy;
    }

    public int getQuantityToBuy() {
        return quantityToBuy;
    }

    public void setQuantityToBuy(int quantityToBuy) {
        this.quantityToBuy = quantityToBuy;
    }

    @Override
    public Double apply(FruitOrder fruitOrder, Double price) {
        int freeItemsNumber = fruitOrder.getQuantity() / quantityToBuy;
        return price - freeItemsNumber * fruitOrder.getFruit().getPrice();
    }

}
