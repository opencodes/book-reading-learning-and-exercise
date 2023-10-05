package com.rkjha.designpattern.strategy;

public class ModelDuck extends Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }

}
