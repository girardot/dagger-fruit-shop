package app;

import dagger.ObjectGraph;
import model.Fruit;
import model.FruitOrder;
import provider.FruitShopModule;

import javax.inject.Inject;

import static com.google.common.collect.Lists.newArrayList;

public class FruitShopApp implements Runnable {

    @Inject
    public FruitShop fruitShop;

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new FruitShopModule());
        FruitShopApp fruitShopApp = objectGraph.get(FruitShopApp.class);
        fruitShopApp.run();
    }

    public void run() {
        System.out.println(fruitShop.computePrices(newArrayList(new FruitOrder(3, Fruit.CHERRY))));
    }

}
