package com.rkjha.ca.controller;

import com.rkjha.ca.entities.BankAccount;
import com.rkjha.ca.interactor.BankAccountRequestMapper;
import com.rkjha.ca.service.AccountServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {

    private final AccountServiceImpl accountService = new AccountServiceImpl();

    @GetMapping(value = "/bank-account", produces = MediaType.APPLICATION_JSON_VALUE)
    public BankAccount getBankAccountById() {
        return new BankAccount("1", "234-234324-324324", "234343234324", 1000);
    }

    @PostMapping(value = "/bank-account", produces = MediaType.APPLICATION_JSON_VALUE)
    public BankAccount createBankAccount(@RequestBody BankAccountRequestMapper bankAccount) {
        return accountService.createAccount(bankAccount.getId(), bankAccount.getAccNo(), bankAccount.getOwnerContactId());
    }

}
