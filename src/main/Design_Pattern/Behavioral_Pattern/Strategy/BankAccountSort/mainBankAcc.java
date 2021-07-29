package Behavioral_Pattern.Strategy.BankAccountSort;

import Behavioral_Pattern.Strategy.BankAccountSort.Comparator.BalanceComparator;
import Behavioral_Pattern.Strategy.BankAccountSort.Comparator.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Comparator สามารถใช้ในการ Sort ได้
public class mainBankAcc {
    public static void main(String[] args) {
        BankAccount a1,a2,a3;
        a1 = new BankAccount(20,"C");
        a2 = new BankAccount(10,"B");
        a3 = new BankAccount(30,"A");
        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        Collections.sort(accounts,new BalanceComparator());
        for (BankAccount a : accounts) System.out.println(a.getBalance());
        Collections.sort(accounts,new NameComparator());
        for (BankAccount a : accounts) System.out.println(a.getName());

    }

}
