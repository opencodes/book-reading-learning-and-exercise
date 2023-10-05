package com.rkjha.designpattern.strategy;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
