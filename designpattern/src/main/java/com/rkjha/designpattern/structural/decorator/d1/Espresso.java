package com.rkjha.designpattern.structural.decorator.d1;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 4.50;
    }
}
