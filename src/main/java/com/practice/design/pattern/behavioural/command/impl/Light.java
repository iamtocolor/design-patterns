package com.practice.design.pattern.behavioural.command.impl;

public class Light {
    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        isSwitchOn = switchOn;
    }

    boolean isSwitchOn = false;
    public void doSwitchOn() {
        isSwitchOn = true;
    }
    public void doSwitchOff() {
        isSwitchOn = false;
    }
}
