package com.rkjha.designpattern.behavioral.strategy.nexon;

public class ElectricDrive implements DriveBehaviour {


    @Override
    public void drive() {
        System.out.println("Driving with fuel: Electric");
    }
}
