package Behavioral_Pattern.Strategy.CashRegister.NoStrategy;
/**
 * ถ้าอยากจะเพิ่มการทำงานหรือการคำนวณ tax ต้องสร้างฟังก์ชั่นเพิ่ม ทำให้ code ยาว มันไม่เฟี้ยว
 *
 *
 *
* */
public class CashRegisterNoStrategyPattern {
    private double purchase;
    private double payment;

    public CashRegisterNoStrategyPattern() {
        purchase = 0;
        payment = 0;
    }
    public void recordPurchase(double amount){
        purchase += amount;
    }
    public void calculateTaxThailand(){
        purchase = purchase + (purchase * 0.07);
    }
    public void calculateTaxNY(){
        if (purchase>100) purchase = purchase + (purchase * 0.08);
    }
    public void calculateTaxCA(){
        purchase = purchase + (purchase*0.075);
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
