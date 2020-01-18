package com.practice.design.pattern.creational.abstractfactory.impl;

import com.practice.design.pattern.creational.abstractfactory.api.Creator;
import com.practice.design.pattern.creational.abstractfactory.api.Wheel;
import com.practice.design.pattern.creational.abstractfactory.api.WheelExpert;
import com.practice.design.pattern.creational.abstractfactory.impl.wheel.BikeWheel;
import com.practice.design.pattern.creational.abstractfactory.impl.whileExpert.BikeExpert;

public class BikeCreator implements Creator {

    public Wheel getWheel() {
        return new BikeWheel();
    }

    public WheelExpert getWheelExpert() {
        return new BikeExpert();
    }
}
