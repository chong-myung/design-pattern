package com.design.pattern.structure.facade;

public class HomeTheaterFacade {

    private Projector projector;
    private Amplifier amp;
    private DVDPlayer dvd;

    public void watchMovie(String title) {
        projector.on();
        amp.on();
        dvd.play(title);
    }
}
