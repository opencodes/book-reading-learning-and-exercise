package com.rkjha.designpattern.creational.abstractfactory;

public class WindowUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
