package com.rkjha.designpattern.structural.adaptor;

public class TurkeyClassAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        this.gobble();
    }

}
