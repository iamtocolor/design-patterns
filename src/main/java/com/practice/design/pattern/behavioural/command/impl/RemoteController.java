package com.practice.design.pattern.behavioural.command.impl;

import com.practice.design.pattern.behavioural.command.api.Command;

public class RemoteController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
