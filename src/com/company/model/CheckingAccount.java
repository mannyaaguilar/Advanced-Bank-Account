package com.company.model;

public class CheckingAccount extends BankAccount {

    private final double OVERDRAFT_FEE = 29.99;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;

        if(this.balance < 0){
            this.balance -= this.OVERDRAFT_FEE;
            System.out.println("*** YOU HAVE BEEN CHARGED AN OVERDRAFT FEE ***");
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Checking Account Balance : " + this.balance;
    }
}