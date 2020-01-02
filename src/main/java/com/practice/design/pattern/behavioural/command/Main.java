package com.practice.design.pattern.behavioural.command;

import com.practice.design.pattern.behavioural.command.api.Command;
import com.practice.design.pattern.behavioural.command.impl.Light;
import com.practice.design.pattern.behavioural.command.impl.LightOffCommand;
import com.practice.design.pattern.behavioural.command.impl.LightOnCommand;
import com.practice.design.pattern.behavioural.command.impl.RemoteController;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();
        System.out.println(light.isSwitchOn());

        remoteController.setCommand(lightOffCommand);
        remoteController.pressButton();
        System.out.println(light.isSwitchOn());
    }
}
