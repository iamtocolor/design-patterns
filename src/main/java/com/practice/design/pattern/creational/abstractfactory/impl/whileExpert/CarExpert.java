package com.practice.design.pattern.creational.abstractfactory.impl.whileExpert;

import com.practice.design.pattern.creational.abstractfactory.api.WheelExpert;

public class CarExpert implements WheelExpert {

    public String getDescription() {
        return "I am a car expert";
    }
}
