package com.rkjha.designpattern.structural.flyweight;

public class Currency implements FinancialInstrument {

    private String code;

    public Currency(String code) {
        this.code = code;
    }

    @Override
    public void trade(int price) {
        System.out.println("Trading currency " + code + " at $" + (price * 2) + " per unit of MRP " + price);
    }
}
