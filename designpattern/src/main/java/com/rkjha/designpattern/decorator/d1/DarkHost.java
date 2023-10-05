package com.rkjha.designpattern.decorator.d1;

public class DarkHost extends Beverage {

    public DarkHost() {
        description = "Dark Host";
    }

    @Override
    public double cost() {
        return 10;
    }
}
