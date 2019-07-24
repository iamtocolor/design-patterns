package com.practice.design.pattern.creational.factory.impl;

import com.practice.design.pattern.creational.factory.api.Logger;

public class XmlLogger implements Logger {

    public void log(String message) {
        System.out.println("Logging from Xml");
    }
}
