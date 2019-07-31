package com.practice.design.pattern.structural.decorater.impl;

import com.practice.design.pattern.structural.decorater.api.IName;
import com.practice.design.pattern.structural.decorater.api.NameDecorater;

public class GuptaTitleDecorater extends NameDecorater {

    public GuptaTitleDecorater(IName iName) {
        super(iName);
    }

    @Override
    public void printName() {
        super.printName();
    }

    public void printTitle() {
        System.out.println("Gupta");
    }
}
