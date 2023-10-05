package com.rkjha.designpattern.adaptor;

public class TurkeyClassAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        this.gobble();
    }

}
