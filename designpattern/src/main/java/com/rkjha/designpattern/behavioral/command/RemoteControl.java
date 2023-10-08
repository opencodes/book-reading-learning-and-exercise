package com.rkjha.designpattern.behavioral.command;

public class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        this.command.execute();
    }

}
