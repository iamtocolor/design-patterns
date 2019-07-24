package com.practice.design.pattern.creational.factory.api;

public abstract class Creator {

    public abstract Logger creatLogger();

    public Logger getLogger() {
        return creatLogger();
    }
}
