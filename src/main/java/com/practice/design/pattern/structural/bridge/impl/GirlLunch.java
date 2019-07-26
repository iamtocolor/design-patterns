package com.practice.design.pattern.structural.bridge.impl;

import com.practice.design.pattern.structural.bridge.api.AbstractILunch;
import com.practice.design.pattern.structural.bridge.api.ILunch;

public class GirlLunch extends AbstractILunch {

    public GirlLunch(ILunch iLunch) {
        super(iLunch);
    }

    @Override
    public void buildStarter() {
        System.out.println("Building for girl");
        super.buildStarter();
    }

    @Override
    public void buildMeal() {
        System.out.println("Building for girl");
        super.buildMeal();
    }

    @Override
    public void buildDessert() {
        System.out.println("Building for girl");
        super.buildDessert();
    }
}
