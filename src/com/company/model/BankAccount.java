package com.company.model;

public class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "Bank Account : " + this.balance;
    }
}
