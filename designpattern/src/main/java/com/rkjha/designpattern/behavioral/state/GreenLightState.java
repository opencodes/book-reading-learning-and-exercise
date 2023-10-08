package com.rkjha.designpattern.behavioral.state;

public class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Green light. Go!");
        trafficLight.setState(new YellowLightState());
    }
}
