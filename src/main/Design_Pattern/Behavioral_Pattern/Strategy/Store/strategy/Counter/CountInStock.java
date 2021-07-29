package Behavioral_Pattern.Strategy.Store.strategy.Counter;

import Behavioral_Pattern.Strategy.Store.Nostrategy.Product;

public class CountInStock implements CounterStrategy {

    @Override
    public int count(Product product) {
        if (product.getQuantity()>0) return 1;
        return 0;
    }
}
