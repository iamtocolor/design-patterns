package com.practice.design.pattern.creational.factory.impl;

import com.practice.design.pattern.creational.factory.api.Creator;
import com.practice.design.pattern.creational.factory.api.Logger;

public class XmlLoggerCretor extends Creator {

    @Override
    public Logger creatLogger() {
        return new XmlLogger();
    }

    @Override
    public Logger getLogger() {
        return this.creatLogger();
    }
}
