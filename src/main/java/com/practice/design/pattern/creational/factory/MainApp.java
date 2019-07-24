package com.practice.design.pattern.creational.factory;

import com.practice.design.pattern.creational.factory.api.Logger;
import com.practice.design.pattern.creational.factory.impl.XmlLoggerCretor;
import com.sun.tools.javac.util.Log;

public class MainApp {

    public static void main(String[] args) {
        XmlLoggerCretor loggerCretor = new XmlLoggerCretor();
        Logger logger = loggerCretor.creatLogger();
        logger.log("Hellow world");
    }
}
