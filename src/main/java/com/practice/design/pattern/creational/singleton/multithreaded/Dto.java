package com.practice.design.pattern.creational.singleton.multithreaded;

public class Dto {

    private static volatile Dto INSTANCE;

    private Dto() {

    }

    public static Dto getInstance() {
        if (INSTANCE == null) {
            synchronized (Dto.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Dto();
                }
            }
        }
        return INSTANCE;
    }
}
