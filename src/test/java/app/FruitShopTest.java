package app;

import model.FruitOrder;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static model.Fruit.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class FruitShopTest extends AbstractTest {

    @Inject
    public FruitShop fruitShop;

    @Test
    public void should_get_price() {
        // Given
        List<FruitOrder> fruitOrders = newArrayList(
                new FruitOrder(2, BANANA),
                new FruitOrder(3, CHERRY),
                new FruitOrder(5, MANGO),
                new FruitOrder(3, ORANGE));

        // When
        double price = fruitShop.computePrices(fruitOrders);

        // Then
        // 2*1.5*0.8 + (3*2.5) - (1*2.5) + 5*3*0.85 + 3*1 - 1*1
        assertThat(price).isEqualTo(22.15);
    }

}
