package com.rkjha.designpattern.creational.builder;

public class PaneerButterMasala {
    String paneer;
    String onion;
    String salt;
    String tomato;

    public PaneerButterMasala(String paneer, String onion, String salt, String tomato) {
        this.paneer = paneer;
        this.onion = onion;
        this.salt = salt;
        this.tomato = tomato;
    }

    public String getPaneer() {
        return paneer;
    }

    public void setPaneer(String paneer) {
        this.paneer = paneer;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }
}
