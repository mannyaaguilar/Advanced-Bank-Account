package com.company.model;

public class BankMember {

    public String name;
    public int id;
    public SavingsAccount savingsAccount;
    public CheckingAccount checkingAccount;

    public BankMember(String name, int id, SavingsAccount savingsAccount, CheckingAccount checkingAccount) {
        this.name = name;
        this.id = id;
        this.savingsAccount = savingsAccount;
        this.checkingAccount = checkingAccount;
    }

    public String getAccounts(){
        return this.checkingAccount + " " + this.savingsAccount;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.id
                + " - " + this.checkingAccount.toString()
                + " - " + this.savingsAccount.toString();
    }
}
