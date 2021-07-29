package Behavioral_Pattern.Strategy.Store.strategy.Counter;

import Behavioral_Pattern.Strategy.Store.Nostrategy.Product;

public class CountAll implements CounterStrategy {

    @Override
    public int count(Product product) {
        return 1;
    }
}
