package com.rkjha.designpattern.decorator.d1;

public class ExtraSuger extends Topping {

    public ExtraSuger(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Extra Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

}
