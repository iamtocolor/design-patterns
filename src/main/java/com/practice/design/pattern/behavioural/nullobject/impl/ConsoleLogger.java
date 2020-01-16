package com.practice.design.pattern.behavioural.nullobject.impl;

import com.practice.design.pattern.behavioural.nullobject.api.Log;

public class ConsoleLogger implements Log {
    public void info(String message) {
        System.out.println(message);
    }
}
