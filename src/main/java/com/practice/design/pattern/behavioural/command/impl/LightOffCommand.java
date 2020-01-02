package com.practice.design.pattern.behavioural.command.impl;

import com.practice.design.pattern.behavioural.command.api.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.doSwitchOff();
    }
}
