package com.rkjha.designpattern.structural.bridge;

public class SamsungTV implements TVDevice {
    private boolean isOn = false;
    private int channel = 0;
    private int volume = 10;

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Samsung TV: Powering On");
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("Samsung TV: Powering Off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Samsung TV: Setting channel to " + channel);
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Samsung TV: Increasing volume to " + volume);

    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Samsung TV: Decreasing volume to " + volume);
    }
}
