package Behavioral_Pattern.Strategy.Store.strategy.Counter;

import Behavioral_Pattern.Strategy.Store.Nostrategy.Product;

public class CountQuantity implements CounterStrategy {

    @Override
    public int count(Product product) {
        return product.getQuantity();
    }
}
