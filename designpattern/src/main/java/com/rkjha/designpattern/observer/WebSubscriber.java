package com.rkjha.designpattern.observer;

public class WebSubscriber implements Observer {
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        System.out.printf("WebSubscriber: Temperature is %.2f°C\n", temperature);
        this.temperature = temperature;
    }

    @Override
    public void update(float temperature) {
        this.setTemperature(temperature);
    }
}
