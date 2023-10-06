package com.rkjha.designpattern.creational.factory;

public class ElectronicFactory {

    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("PHONE")) {
            return new Phone();
        } else if (type.equalsIgnoreCase("LAPTOP")) {
            return new Laptop();
        } else {
            return null;
        }
    }
}
