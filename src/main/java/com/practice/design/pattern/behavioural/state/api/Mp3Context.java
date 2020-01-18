package com.practice.design.pattern.behavioural.state.api;

public class Mp3Context {

    private State state;

    public Mp3Context(State state) {
        this.state = state;
    }

    public void play() {
        this.state.pressPlay(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
