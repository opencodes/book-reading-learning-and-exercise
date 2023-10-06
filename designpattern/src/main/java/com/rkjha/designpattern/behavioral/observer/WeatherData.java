package com.rkjha.designpattern.behavioral.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;

    private float temperature;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            ((Observer) observer).update(this.temperature);
        }
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
