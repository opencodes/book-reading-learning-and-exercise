package com.rkjha.designpattern.structural.bridge;

public class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(TVDevice device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.powerOn();
    }

    @Override
    void powerOff() {
        device.powerOff();
    }

    @Override
    void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    void volumeUp() {
        device.volumeUp();
    }

    @Override
    void volumeDown() {
        device.volumeDown();
    }
}
