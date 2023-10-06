package com.rkjha.designpattern.structural.composite;

public class OneUnit implements SingleUnit {

    private String name;
    private float amount;

    OneUnit(float amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public float getPrice() {
        return this.getAmount();
    }
}
