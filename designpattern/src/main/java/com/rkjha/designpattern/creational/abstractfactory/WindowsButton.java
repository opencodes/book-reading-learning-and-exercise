package com.rkjha.designpattern.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("WIndows button clicked");
    }
}
