package Behavioral_Pattern.Strategy.Store.strategy;

import Behavioral_Pattern.Strategy.Store.Nostrategy.Product;
import Behavioral_Pattern.Strategy.Store.strategy.Counter.CounterStrategy;

import java.util.ArrayList;
import java.util.List;

// function ใน class store ยาวจัด
public class Store {
    private List<Behavioral_Pattern.Strategy.Store.Nostrategy.Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, String type, double price, int qty) {
        products.add(new Behavioral_Pattern.Strategy.Store.Nostrategy.Product(name, type, price, qty));
    }

    public int countProduct(CounterStrategy counter) {
        // can actually use return products.size()
        // but just for demonstrating
        int count = 0;
        for (Product prod : products) {
            count += 1;
        }
        return count;
    }
    // นับจำนวนสินค้าทั้งหมดที่มีเหลืออยู่ในสต็อค

    }
