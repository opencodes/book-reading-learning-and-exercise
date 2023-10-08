package com.rkjha.designpattern.behavioral.state;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate the traffic light changing states
        trafficLight.requestStateChange(); // Red to Green
        trafficLight.requestStateChange(); // Green to Yellow
        trafficLight.requestStateChange(); // Yellow to Red
        trafficLight.requestStateChange();
    }
}
