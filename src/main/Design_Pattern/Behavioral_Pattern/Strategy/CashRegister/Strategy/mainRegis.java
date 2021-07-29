package Behavioral_Pattern.Strategy.CashRegister.Strategy;

import Behavioral_Pattern.Strategy.CashRegister.Strategy.Tax.CATax;

/**
 * Tax จะเปลี่ยนค่าไปตาม ตัว Tax ที่ implement จาก interface TaxCalculator
 * - ลดปัญหา code ยาวใน class เดียว
 * - ข้อเสีย class เยอะ
 * */
public class mainRegis {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(new CATax());
        cashRegister.recordPurchase(30);
        cashRegister.calculateTax();
        cashRegister.enterPayment(100);
        System.out.println(cashRegister.givechange());
    }
}
