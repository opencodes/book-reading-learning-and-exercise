package com.rkjha.designpattern.structural.flyweight;

public class Stock implements FinancialInstrument {
    private String symbol;

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void trade(int price) {
        System.out.println("Trading Stock " + symbol + " at $" + (price * 3) + " per unit of MRP " + price);

    }
}
