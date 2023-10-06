package com.rkjha.designpattern.behavioral.strategy;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
