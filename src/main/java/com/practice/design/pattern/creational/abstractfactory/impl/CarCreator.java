package com.practice.design.pattern.creational.abstractfactory.impl;

import com.practice.design.pattern.creational.abstractfactory.api.Creator;
import com.practice.design.pattern.creational.abstractfactory.api.Wheel;
import com.practice.design.pattern.creational.abstractfactory.api.WheelExpert;

public class CarCreator implements Creator {

    public Wheel getWheel() {
        return new CarWheel();
    }

    public WheelExpert getWheelExpert() {
        return new CarExpert();
    }
}
