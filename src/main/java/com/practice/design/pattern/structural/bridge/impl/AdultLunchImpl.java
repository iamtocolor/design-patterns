package com.practice.design.pattern.structural.bridge.impl;

import com.practice.design.pattern.structural.bridge.api.ILunch;

public class AdultLunchImpl implements ILunch {

    public void buildStarted() {
        System.out.println("Building Adult starter");
    }

    public void buildMeal() {
        System.out.println("Building Adult meal");
    }

    public void buildDessert() {
        System.out.println("Building Adult dessert");
    }
}
