package com.practice.design.pattern.structural.bridge.impl;

import com.practice.design.pattern.structural.bridge.api.AbstractILunch;
import com.practice.design.pattern.structural.bridge.api.ILunch;

public class BoyLunch extends AbstractILunch {

    public BoyLunch(ILunch iLunch) {
        super(iLunch);
    }

    @Override
    public void buildStarter() {
        System.out.println("Bulding for boy");
        super.buildStarter();
    }

    @Override
    public void buildMeal() {
        System.out.println("Bulding for boy");
        super.buildMeal();
    }

    @Override
    public void buildDessert() {
        System.out.println("Bulding for boy");
        super.buildDessert();
    }
}
