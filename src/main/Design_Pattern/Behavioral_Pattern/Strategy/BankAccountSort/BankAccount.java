package Behavioral_Pattern.Strategy.BankAccountSort;

public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
