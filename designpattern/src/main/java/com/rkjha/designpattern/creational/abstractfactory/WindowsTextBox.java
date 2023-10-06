package com.rkjha.designpattern.creational.abstractfactory;

public class WindowsTextBox implements TextBox {
    @Override
    public void inputText(String text) {
        System.out.println("Entering text in Windows TextBox: " + text);
    }
}
