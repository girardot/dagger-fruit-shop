package app;

import model.FruitOrder;

import javax.inject.Inject;
import java.util.List;

public class FruitShop {

    @Inject
    public FruitShop() {
    }

    public double computePrices(List<FruitOrder> fruitOrders) {
        return fruitOrders.stream().mapToDouble(FruitOrder::getPrice).sum();
    }

}
