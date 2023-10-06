package com.rkjha.designpattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        TVDevice sonyTV = new SonyTV();
        TVDevice samsungTV = new SamsungTV();
        RemoteControl sonyRemote = new BasicRemoteControl(sonyTV);
        sonyRemote.powerOn();
        RemoteControl samsungRemote = new BasicRemoteControl(samsungTV);
        samsungRemote.powerOn();
    }
}
