package com.rkjha.designpattern.structural.decorator.d1;

public class DarkHost extends Beverage {

    public DarkHost() {
        description = "Dark Host";
    }

    @Override
    public double cost() {
        return 10;
    }
}
