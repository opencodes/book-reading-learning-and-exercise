package com.rkjha.designpattern.decorator.d1;

public class OrderCoffee {
    public static void main(String[] args) {
        // Create a Dark Host
        Beverage beverage = new DarkHost();
        System.out.printf("Order: %s\n", beverage.getDescription() + ": " + beverage.cost());
        // Add extra sugar to the Dark Host
        beverage = new ExtraSuger(beverage);
        // Print order
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
