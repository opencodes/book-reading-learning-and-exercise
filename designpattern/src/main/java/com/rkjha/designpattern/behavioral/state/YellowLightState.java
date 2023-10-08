package com.rkjha.designpattern.behavioral.state;

public class YellowLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Yellow light. Slow down.");
        trafficLight.setState(new RedLightState());
    }
}
