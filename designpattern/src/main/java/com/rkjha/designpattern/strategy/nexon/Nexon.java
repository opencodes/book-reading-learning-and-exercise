package com.rkjha.designpattern.strategy.nexon;

public abstract class Nexon {
    private String model;
    private DriveBehaviour driveBehaviour;

    public Nexon(String model, DriveBehaviour driveBehaviour) {
        this.setModel(model);
        this.setDriveBehaviour(driveBehaviour);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DriveBehaviour getDriveBehaviour() {
        return driveBehaviour;
    }

    public void setDriveBehaviour(DriveBehaviour driveBehaviour) {
        this.driveBehaviour = driveBehaviour;
    }

    public void executeDriveBehaviour() {
        System.out.printf("Driving model:  %s \n", getModel());
        this.driveBehaviour.drive();
    }

}
