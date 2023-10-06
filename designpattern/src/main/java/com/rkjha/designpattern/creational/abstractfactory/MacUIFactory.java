package com.rkjha.designpattern.creational.abstractfactory;

public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
