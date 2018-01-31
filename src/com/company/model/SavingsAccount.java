package com.company.model;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance < amount){
            System.out.println("*** YOU CANNOT WITHDRAW MORE MONEY THAN YOU HAVE ***");
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Savings Account Balance : " + this.balance;
    }
}