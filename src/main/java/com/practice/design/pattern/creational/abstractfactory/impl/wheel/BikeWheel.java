package com.practice.design.pattern.creational.abstractfactory.impl.wheel;

import com.practice.design.pattern.creational.abstractfactory.api.Wheel;

public class BikeWheel implements Wheel {

    public String getDescription() {
        return "I am a bike wheel";
    }
}
