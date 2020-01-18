package com.practice.design.pattern.behavioural.state.impl;

import com.practice.design.pattern.behavioural.state.api.Mp3Context;
import com.practice.design.pattern.behavioural.state.api.State;

public class PlayingState implements State {

    public void pressPlay(Mp3Context mp3Context) {
        System.out.println("Currently In Playing State. Now will change");
        mp3Context.setState(new StandByState());
    }
}
