package com.rkjha.designpattern.creational.abstractfactory;

public class MacTextBox implements TextBox {
    @Override
    public void inputText(String text) {
        System.out.println("Entering text in Mac TextBox: " + text);
    }

}
