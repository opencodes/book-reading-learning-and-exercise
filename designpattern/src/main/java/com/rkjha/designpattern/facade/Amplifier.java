package com.rkjha.designpattern.facade;

public class Amplifier {
    public void on() {
        System.out.println("Turning on Amplifier");
    }

    public void off() {
        System.out.println("Turning off Amplifier");
    }

    public void setDvd(String dvd) {
        System.out.printf("Setting DVD to %s\n", dvd);
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound to 5.1");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

}
