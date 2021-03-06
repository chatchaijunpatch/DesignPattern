package Behavioral_Pattern.Strategy.Store.strategy;

import Behavioral_Pattern.Strategy.Store.strategy.Counter.CountAll;
import Behavioral_Pattern.Strategy.Store.strategy.Counter.CountInStock;
import Behavioral_Pattern.Strategy.Store.strategy.Counter.CountQuantity;
import Behavioral_Pattern.Strategy.Store.strategy.Counter.CountType;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", "Book", 300, 5);
        store.addProduct("Da Vinci Code", "DVD", 120, 0);
        store.addProduct("Python 101", "Book", 200, 10);

        System.out.println("All: "+store.countProduct(new CountAll()));
        System.out.println("If stocked: "+store.countProduct(new CountInStock()));
        System.out.println("Qty: "+store.countProduct(new CountQuantity()));
        System.out.println("Type DVD: "+store.countProduct(new CountType("DVD")));
    }
}
