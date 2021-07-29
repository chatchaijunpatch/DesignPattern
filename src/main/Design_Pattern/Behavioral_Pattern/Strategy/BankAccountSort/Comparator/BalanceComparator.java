package Behavioral_Pattern.Strategy.BankAccountSort.Comparator;

import Behavioral_Pattern.Strategy.BankAccountSort.BankAccount;

import java.util.Comparator;

public class BalanceComparator implements Comparator<BankAccount> {
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.getBalance() < o2.getBalance()) return -1;
        if (o1.getBalance() > o2.getBalance()) return 1;
        return 0;
    }
}
