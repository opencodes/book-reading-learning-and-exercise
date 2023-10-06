package com.rkjha.designpattern.builder;

public class PaneerButterMasalaBuilder {
    String paneer;
    String onion;
    String salt;
    String tomato;

    PaneerButterMasala paneerButterMasala;

    public PaneerButterMasalaBuilder() {
        this.paneerButterMasala = new PaneerButterMasala(this.paneer, this.onion, this.salt, this.tomato);
    }


    public PaneerButterMasalaBuilder setPaneer(String paneer) {
        this.paneerButterMasala.setPaneer(paneer);
        return this;
    }


    public PaneerButterMasalaBuilder setOnion(String onion) {
        this.paneerButterMasala.setOnion(onion);
        return this;
    }


    public PaneerButterMasalaBuilder setSalt(String salt) {
        this.paneerButterMasala.setSalt(salt);
        return this;
    }


    public PaneerButterMasalaBuilder setTomato(String tomato) {
        this.paneerButterMasala.setTomato(tomato);
        return this;
    }

    public PaneerButterMasala getPaneerButterMasala() {
        return this.paneerButterMasala;
    }
}
