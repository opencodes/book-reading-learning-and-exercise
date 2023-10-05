package com.rkjha.designpattern.facade;

public class DVD {
    public void on() {
        System.out.println("DVD: On");
    }

    public void play(String movie) {
        System.out.println("DVD: Playing " + movie);
    }

    public void off() {
        System.out.println("DVD: Off");
    }
}
