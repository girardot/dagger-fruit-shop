package model.discount;

import model.FruitOrder;

import java.util.function.BiFunction;

public abstract class DiscountFunction implements BiFunction<FruitOrder, Double, Double> {


}
