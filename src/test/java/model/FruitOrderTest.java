package model;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import model.discount.NBuyOneFreeDiscountFunction;
import model.discount.PercentageDiscountFunction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static model.Fruit.MANGO;
import static model.Fruit.ORANGE;
import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FruitOrderTest {

    @Test
    public void should_price_orange_order_with_20_percentage_discount() {
        // Given
        ORANGE.setDiscountFunction(new PercentageDiscountFunction(0.2));
        ORANGE.setPrice(1.0);
        FruitOrder fruitOrder = new FruitOrder(5, ORANGE);

        // When
        Double price = fruitOrder.getPrice();

        //Then
        assertThat(price.doubleValue()).isEqualTo(4);
    }

    @Test
    @Parameters({ "3,15", "4,20", "5,20", "6,25", "7,30", "8,35", "9,40", "10,40"})
    public void should_price_mango_order_with_1_free_after_5_discount(int quantity, Double excpectedPrice) {
        // Given
        MANGO.setDiscountFunction(new NBuyOneFreeDiscountFunction(5));
        MANGO.setPrice(5.0);
        FruitOrder fruitOrder = new FruitOrder(quantity, MANGO);

        // When
        Double price = fruitOrder.getPrice();

        //Then
        assertThat(price.doubleValue()).isEqualTo(excpectedPrice);
    }

}