package com.rkjha.designpattern.structural.bridge;

public abstract class RemoteControl {
    protected TVDevice device;

    public RemoteControl(TVDevice device) {
        this.device = device;
    }

    abstract void powerOn();

    abstract void powerOff();

    abstract void setChannel(int channel);

    abstract void volumeUp();

    abstract void volumeDown();

}
