package com.practice.design.pattern.creational.singleton.singleThreaded;

public class Model {

    private static volatile Model INSTANCE;

    private Model() {
    }

    public static Model getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Model();
        }
        return INSTANCE;
    }
}

