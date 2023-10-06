package com.rkjha.designpattern.creational.factory;

public class RunCode {
    public static void main(String[] args) {
        Product phone = ElectronicFactory.createProduct("PHONE");
        Product laptop = ElectronicFactory.createProduct("LAPTOP");
        phone.display();
        laptop.display();
    }
}
