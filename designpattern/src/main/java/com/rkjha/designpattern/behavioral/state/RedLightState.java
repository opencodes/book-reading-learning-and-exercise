package com.rkjha.designpattern.behavioral.state;

public class RedLightState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Red light. Stop!");
        trafficLight.setState(new GreenLightState());
    }
}
