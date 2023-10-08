package com.rkjha.designpattern.behavioral.state;

public class TrafficLight {
    TrafficLightState state;

    public TrafficLight() {
        this.state = new RedLightState(); // Initial state is red
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void requestStateChange() {
        state.handleRequest(this);
    }
}
