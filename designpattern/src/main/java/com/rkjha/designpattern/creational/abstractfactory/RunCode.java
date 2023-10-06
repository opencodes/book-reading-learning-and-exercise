package com.rkjha.designpattern.creational.abstractfactory;

public class RunCode {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowUIFactory();
        Button windowsBtn = windowsFactory.createButton();
        TextBox windowsTextBox = windowsFactory.createTextBox();
        windowsBtn.click();
        windowsTextBox.inputText("Hello Winows World!");

        UIFactory macFactory = new MacUIFactory();
        Button macBtn = macFactory.createButton();
        TextBox macTextBox = macFactory.createTextBox();
        macBtn.click();
        macTextBox.inputText("Hello Mac World!");
    }
}
