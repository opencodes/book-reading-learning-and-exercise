package com.rkjha.ca.service;

import com.rkjha.ca.entities.BankAccount;

public interface AccountService {

    BankAccount createAccount(String id, String accNo, String ownerContactId);

    void deposit(float amount);

    void withdraw(float amount);

}
