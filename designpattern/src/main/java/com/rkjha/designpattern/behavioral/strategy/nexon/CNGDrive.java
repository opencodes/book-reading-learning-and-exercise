package com.rkjha.designpattern.behavioral.strategy.nexon;

public class CNGDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with fuel: CNG");
    }
}
