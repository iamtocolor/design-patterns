package com.practice.design.pattern.structural.bridge.api;

public abstract class AbstractILunch {

    private ILunch iLunch;

    public AbstractILunch(ILunch iLunch) {
        this.iLunch = iLunch;
    }

    public void buildStarter() {
        iLunch.buildStarted();
    }

    public void buildMeal() {
        iLunch.buildMeal();
    }

    public void buildDessert() {
        iLunch.buildDessert();
    }
}
