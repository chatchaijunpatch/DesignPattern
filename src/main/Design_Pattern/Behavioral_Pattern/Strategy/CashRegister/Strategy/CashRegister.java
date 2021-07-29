package Behavioral_Pattern.Strategy.CashRegister.Strategy;

import Behavioral_Pattern.Strategy.CashRegister.Strategy.Tax.TaxCalculator;

public class CashRegister {
    private double purchase;
    private double payment;
    private TaxCalculator taxCal;

    public CashRegister(TaxCalculator taxCal) {
        this.taxCal = taxCal;
        this.purchase = 0;
        this.payment = 0;
    }
    public void recordPurchase(double amount){
        purchase += amount;
    }
    public void calculateTax(){
        purchase = purchase + taxCal.calculateTax(purchase);
    }
    public void enterPayment(double amount){
        payment += amount;
    }
    public  double givechange(){
        double change = payment-purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
