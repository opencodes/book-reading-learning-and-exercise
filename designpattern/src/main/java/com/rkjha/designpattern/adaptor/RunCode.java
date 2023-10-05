package com.rkjha.designpattern.adaptor;

public class RunCode {
    public static void main(String[] args) {
        TurkeyClassAdapter turkeyClassAdapter = new TurkeyClassAdapter();
        turkeyClassAdapter.quack();
        turkeyClassAdapter.fly();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
