package Behavioral_Pattern.Strategy.BankAccountSort.Comparator;

import Behavioral_Pattern.Strategy.BankAccountSort.BankAccount;

import java.util.Comparator;

public class NameComparator implements Comparator<BankAccount> {

    public int compare(BankAccount o1, BankAccount o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
