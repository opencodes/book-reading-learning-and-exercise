package com.rkjha.designpattern.facade;

public class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }

    public void dim(int level) {
        System.out.println("Light is dimmed to level " + level);
    }
}
