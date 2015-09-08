package app;

import dagger.Component;
import model.Fruit;
import model.FruitOrder;
import provider.FruitShopModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.google.common.collect.Lists.newArrayList;
import static model.Fruit.CHERRY;

public class FruitShopApp {

    @Inject
    public FruitShop fruitShop;

    @Singleton
    @Component(modules = FruitShopModule.class)
    public interface Shop {
        FruitShop fruitShop();
    }

    public static void main(String[] args) {
        Shop shop = DaggerFruitShopApp_Shop.builder().build();
        System.out.println(shop.fruitShop().computePrices(newArrayList(new FruitOrder(3, CHERRY))));
    }

}
