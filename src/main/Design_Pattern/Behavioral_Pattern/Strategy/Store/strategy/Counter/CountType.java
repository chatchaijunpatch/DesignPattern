package Behavioral_Pattern.Strategy.Store.strategy.Counter;

import Behavioral_Pattern.Strategy.Store.Nostrategy.Product;

public class CountType implements CounterStrategy {
    private String type;
    public CountType(String type){
        this.type = type;
    }
    @Override
    public int count(Product product) {
        if (product.getType().equals(type)) return 1;
        return 0;
    }
}
