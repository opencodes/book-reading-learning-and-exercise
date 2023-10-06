package com.rkjha.designpattern.behavioral.strategy.nexon;

public class DieselDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with fuel: diesel");
    }
}
