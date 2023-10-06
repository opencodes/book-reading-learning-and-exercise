package com.rkjha.designpattern.structural.bridge;

public interface TVDevice {
    void powerOn();

    void powerOff();

    void setChannel(int channel);

    void volumeUp();

    void volumeDown();
}
