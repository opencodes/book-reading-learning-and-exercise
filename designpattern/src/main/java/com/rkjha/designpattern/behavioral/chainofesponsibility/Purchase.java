package com.rkjha.designpattern.behavioral.chainofesponsibility;

public class Purchase {
    private int amount;

    public Purchase(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
