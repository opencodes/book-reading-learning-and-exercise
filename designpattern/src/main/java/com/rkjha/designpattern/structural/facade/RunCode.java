package com.rkjha.designpattern.structural.facade;

public class RunCode {
    public static void main(String[] args) {
        // Start Watching Movie
        String dvd = "Movie Avenger";
        // Switch on popper and pop
        Popper popper = new Popper();
        popper.on();
        popper.pop();
        // Start Light and Dim
        Light light = new Light();
        light.turnOn();
        light.dim(10);
        // Put Screen down
        Screen screen = new Screen();
        screen.down();
        // Turn on projector and put it on wide screen mode
        Projector projector = new Projector();
        projector.on();
        projector.setSource(dvd);
        projector.wideScreenMode();
        // Turn on amplifier
        Amplifier amplifier = new Amplifier();
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setVolume(5);
        // Start DVD and play movie
        DVD dvdPlayer = new DVD();
        dvdPlayer.on();
        dvdPlayer.play(dvd);

        System.out.println("--------- Create Home Theater Facade ------------");

        // Create Home Theater Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, screen, projector, popper, light);
        System.out.println("Watch Movie using Facade");
        // Watch Movie using Facade
        homeTheater.watchMovie(dvd);
        System.out.println("---------- End Movie -----------");
        // End Movie
        homeTheater.endMovie();

    }
}
