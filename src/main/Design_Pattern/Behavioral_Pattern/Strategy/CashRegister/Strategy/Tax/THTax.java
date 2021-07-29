package Behavioral_Pattern.Strategy.CashRegister.Strategy.Tax;

public class THTax implements TaxCalculator {
    public double calculateTax(double purchase) {
        return purchase * 0.07;
    }
}
