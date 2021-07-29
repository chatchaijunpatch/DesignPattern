package Behavioral_Pattern.Strategy.Store.Nostrategy;

public class MainNoStore {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", "Book", 300, 5);
        store.addProduct("Da Vinci Code", "DVD", 120, 0);
        store.addProduct("Python 101", "Book", 200, 10);

        System.out.println("All: "+store.countProductAll());
        System.out.println("If stocked: "+store.countProductInStock());
        System.out.println("Qty: "+store.countProductQuantity());
        System.out.println("Type DVD: "+store.countProductType("DVD"));

    }
}
