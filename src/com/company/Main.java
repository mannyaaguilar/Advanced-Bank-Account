package com.company;

import com.company.model.BankMember;
import com.company.model.CheckingAccount;
import com.company.model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankMember manny = new BankMember("Manny", 654385,
                new SavingsAccount(500),
                new CheckingAccount(25000));

        manny.checkingAccount.withdraw(550);
        manny.savingsAccount.withdraw(550);

        System.out.println(manny);
    }
}
