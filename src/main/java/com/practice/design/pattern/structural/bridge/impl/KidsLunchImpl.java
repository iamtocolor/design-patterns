package com.practice.design.pattern.structural.bridge.impl;

import com.practice.design.pattern.structural.bridge.api.ILunch;

public class KidsLunchImpl implements ILunch {

    public void buildStarted() {
        System.out.println("Building kids starter");
    }

    public void buildMeal() {
        System.out.println("Building kids meal");
    }

    public void buildDessert() {
        System.out.println("Building kids dessert");
    }
}
