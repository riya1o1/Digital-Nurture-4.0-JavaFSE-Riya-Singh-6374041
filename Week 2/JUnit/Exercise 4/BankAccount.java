package com.example;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
