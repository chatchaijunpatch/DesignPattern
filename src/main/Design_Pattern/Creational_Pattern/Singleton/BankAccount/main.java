package Creational_Pattern.Singleton.BankAccount;

public class main {
    public static void main(String[] args) {
//        ???????????
        BankAccountService accountService = BankAccountService.getInstance();
        accountService.createData("data");
    }
}
