package com.rkjha.designpattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly();
        modelduck.setFlyBehaviour(new FlyRocketPowered());
        modelduck.performFly();
    }
}
