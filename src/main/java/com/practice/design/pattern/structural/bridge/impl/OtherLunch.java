package com.practice.design.pattern.structural.bridge.impl;

import com.practice.design.pattern.structural.bridge.api.AbstractILunch;
import com.practice.design.pattern.structural.bridge.api.ILunch;

public class OtherLunch extends AbstractILunch {

    public OtherLunch(ILunch iLunch) {
        super(iLunch);
    }

    @Override
    public void buildStarter() {
        System.out.println("Building for other");
        super.buildStarter();
    }

    @Override
    public void buildMeal() {
        System.out.println("Building for other");
        super.buildMeal();
    }

    @Override
    public void buildDessert() {
        System.out.println("Building for other");
        super.buildDessert();
    }
}
