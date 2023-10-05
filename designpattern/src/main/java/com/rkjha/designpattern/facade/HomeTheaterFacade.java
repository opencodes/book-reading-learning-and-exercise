package com.rkjha.designpattern.facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DVD dvdPlayer;
    Projector projector;
    Screen screen;
    Popper popper;
    Light light;

    public HomeTheaterFacade(Amplifier amplifier, DVD dvdPlayer, Screen screen, Projector projector, Popper popper, Light light) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.popper = popper;
        this.light = light;

    }

    public void watchMovie(String movie) {
        // Facade methods
        popper.on();
        popper.pop();
        // Start Light and Dim
        light.turnOn();
        light.dim(10);
        // Put Screen down
        screen.down();
        // Turn on projector and put it on wide screen mode
        projector.on();
        projector.setSource(movie);
        projector.wideScreenMode();
        // Turn on amplifier
        amplifier.on();
        amplifier.setDvd(movie);
        amplifier.setVolume(5);
        // Start DVD and play movie
        dvdPlayer.on();
        dvdPlayer.play(movie);

    }

    public void endMovie() {
        // Facade methods
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        light.turnOff();
        popper.off();
    }
}
