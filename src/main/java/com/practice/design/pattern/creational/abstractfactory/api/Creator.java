package com.practice.design.pattern.creational.abstractfactory.api;

public interface Creator {

    Wheel getWheel();

    WheelExpert getWheelExpert();
}
