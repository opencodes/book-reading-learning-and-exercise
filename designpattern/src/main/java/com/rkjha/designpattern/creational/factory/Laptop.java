package com.rkjha.designpattern.creational.factory;

public class Laptop implements Product {
    @Override
    public void display() {
        System.out.println("I am a laptop");
    }
}
