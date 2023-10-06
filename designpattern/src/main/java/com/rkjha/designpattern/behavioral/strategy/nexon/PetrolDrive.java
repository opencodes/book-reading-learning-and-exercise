package com.rkjha.designpattern.behavioral.strategy.nexon;

public class PetrolDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with petrol");
    }
}
