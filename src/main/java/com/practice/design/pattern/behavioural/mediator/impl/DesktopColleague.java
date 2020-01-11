package com.practice.design.pattern.behavioural.mediator.impl;

import com.practice.design.pattern.behavioural.mediator.api.Colleague;
import com.practice.design.pattern.behavioural.mediator.api.Mediator;

public class DesktopColleague extends Colleague {

    public DesktopColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Desktop received " + message);
    }
}
