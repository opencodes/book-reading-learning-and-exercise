package com.rkjha.designpattern.template;

public class RunCode {
    public static void main(String[] args) {
        System.out.println("-------- Make Tea ------");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("-------- Make Coffee ------");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
