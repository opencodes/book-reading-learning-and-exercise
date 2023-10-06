package com.rkjha.designpattern.behavioral.strategy;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
