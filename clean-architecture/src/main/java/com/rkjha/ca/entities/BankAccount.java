package com.rkjha.ca.entities;

public class BankAccount extends Account {
    float balance;

    public BankAccount(String id, String accNo, String ownerContactId, float balance) {
        super(id, accNo, ownerContactId);
        this.setBalance(balance);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
