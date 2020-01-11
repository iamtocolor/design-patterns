package com.practice.design.pattern.behavioural.mediator.impl;

import com.practice.design.pattern.behavioural.mediator.api.Colleague;
import com.practice.design.pattern.behavioural.mediator.api.Mediator;

public class MobileColleague extends Colleague {

    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Mobile Received " + message);
    }
}
