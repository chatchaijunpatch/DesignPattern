package Behavioral_Pattern.Strategy.CashRegister.NoStrategy;

public class main {
    public static void main(String[] args) {
        CashRegisterNoStrategyPattern registerNoStrategyPattern = new CashRegisterNoStrategyPattern();
        registerNoStrategyPattern.recordPurchase(60);
        registerNoStrategyPattern.recordPurchase(40);
        registerNoStrategyPattern.calculateTaxThailand();
        registerNoStrategyPattern.enterPayment(200);
        System.out.println(registerNoStrategyPattern.givechange());
    }
}
