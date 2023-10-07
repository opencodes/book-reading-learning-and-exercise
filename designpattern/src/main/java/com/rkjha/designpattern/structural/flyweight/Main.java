package com.rkjha.designpattern.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        String[] trades = {"STOCK:GOOG", "STOCK:AAPL", "CURRENCY:USD", "STOCK:MSFT", "CURRENCY:BTC"};
        for (String trade : trades) {
            int price = (int) (Math.random() * 10);
            FinancialInstrument instrument = FinancialInstrumentFactory.getInstrument(trade);
            instrument.trade(price);
        }
    }
}
