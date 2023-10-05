package com.rkjha.designpattern.observer;

public class Execute {
    public static void main(String[] args) {
        MobileSubscriber mobileSubscriber = new MobileSubscriber();
        WebSubscriber webSubscriber = new WebSubscriber();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(mobileSubscriber);
        weatherData.registerObserver(webSubscriber);
        weatherData.setTemperature(10);
        weatherData.notifyObservers();
    }
}
