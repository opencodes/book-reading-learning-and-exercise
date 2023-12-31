package com.rkjha.designpattern.behavioral.observer;

public class MobileSubscriber implements Observer {
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        System.out.printf("MobileSubscriber: Temperature is %.2f°C\n", temperature);
        this.temperature = temperature;
    }

    @Override
    public void update(float temperature) {
        this.setTemperature(temperature);
    }
}
