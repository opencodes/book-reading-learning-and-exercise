package com.rkjha.ca.entities;

public class Account {
    String id;
    String accNo;
    String ownerContactId;

    public Account(String id, String accNo, String ownerContactId) {
        this.id = id;
        this.accNo = accNo;
        this.ownerContactId = ownerContactId;
    }

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
}
