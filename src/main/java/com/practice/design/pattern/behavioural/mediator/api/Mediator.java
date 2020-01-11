package com.practice.design.pattern.behavioural.mediator.api;

public interface Mediator {

    public void send(String message, Colleague colleague);
}
