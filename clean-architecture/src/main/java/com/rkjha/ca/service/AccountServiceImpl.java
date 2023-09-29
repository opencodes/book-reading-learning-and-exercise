package com.rkjha.ca.service;

import com.rkjha.ca.entities.BankAccount;

public class AccountServiceImpl implements AccountService {
    @Override
    public BankAccount createAccount(String id, String accNo, String ownerContactId) {
        return new BankAccount(id, accNo, ownerContactId, 0);
    }

    @Override
    public void deposit(float amount) {

    }

    @Override
    public void withdraw(float amount) {

    }
}
