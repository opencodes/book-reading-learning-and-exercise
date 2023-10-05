package com.rkjha.designpattern.facade;

public class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void wideScreenMode() {
        System.out.println("Projector is in widescreen mode");
    }

    public void setSource(String source) {
        System.out.println("Projector source set to " + source);
    }
}
