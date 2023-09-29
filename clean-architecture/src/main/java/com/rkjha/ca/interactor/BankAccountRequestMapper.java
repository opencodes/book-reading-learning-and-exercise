package com.rkjha.ca.interactor;

public class BankAccountRequestMapper {
    String id;
    String accNo;
    String ownerContactId;
    float balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getOwnerContactId() {
        return ownerContactId;
    }

    public void setOwnerContactId(String ownerContactId) {
        this.ownerContactId = ownerContactId;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
