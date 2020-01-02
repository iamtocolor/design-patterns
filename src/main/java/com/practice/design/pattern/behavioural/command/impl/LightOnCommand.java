package com.practice.design.pattern.behavioural.command.impl;

import com.practice.design.pattern.behavioural.command.api.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.doSwitchOn();
    }
}
