package com.rkjha.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FinancialInstrumentFactory {
    private static final Map<String, FinancialInstrument> instrumentMap = new HashMap<>();

    public static FinancialInstrument getInstrument(String key) {

        FinancialInstrument instrument = instrumentMap.get(key);

        if (instrument == null) {
            if (key.startsWith("STOCK:")) {
                instrument = new Stock(key.substring(5));
            } else if (key.startsWith("CURRENCY:")) {
                instrument = new Currency(key.substring(8));
            }
            instrumentMap.put(key, instrument);

        }
        return instrument;

    }

}
