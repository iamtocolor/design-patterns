package com.practice.design.pattern.creational.factory;

import com.practice.design.pattern.creational.factory.api.Creator;
import com.practice.design.pattern.creational.factory.api.Logger;
import com.practice.design.pattern.creational.factory.impl.creator.XmlLoggerCretor;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        args = (String[]) Arrays.asList("Xml").toArray();
        Creator creator = null;
        if (args[0].equalsIgnoreCase("Xml")) {
            creator = new XmlLoggerCretor();
        }
        Logger logger = creator.getLogger();
        System.out.println(logger);
        logger.log("Hello world");
    }

    public static class Operate {
        private Creator creator;
        private Logger logger;
        public Operate(Creator creator) {
            this.creator = creator;
            this.logger = creator.getLogger();
        }
    }


}
