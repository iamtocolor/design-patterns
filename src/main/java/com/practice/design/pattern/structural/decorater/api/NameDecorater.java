package com.practice.design.pattern.structural.decorater.api;

public abstract class NameDecorater implements IName {

    protected IName iName;

    public NameDecorater(IName iName) {
        this.iName = iName;
    }

    public void printName() {
        iName.printName();
    }
}
