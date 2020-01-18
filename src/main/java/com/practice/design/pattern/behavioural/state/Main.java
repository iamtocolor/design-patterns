package com.practice.design.pattern.behavioural.state;

import com.practice.design.pattern.behavioural.state.api.Mp3Context;
import com.practice.design.pattern.behavioural.state.impl.StandByState;

public class Main {
    public static void main(String[] args) {
        Mp3Context mp3Context = new Mp3Context(new StandByState());
        mp3Context.play();
        mp3Context.play();
        mp3Context.play();
    }
}
