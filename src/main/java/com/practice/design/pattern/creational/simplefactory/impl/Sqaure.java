package com.practice.design.pattern.creational.simplefactory.impl;

import com.practice.design.pattern.creational.simplefactory.api.Shape;

public class Sqaure implements Shape {

    public void name() {
        System.out.println("This is a sqaure");
    }

    public void draw() {
        System.out.println("Draw a square");
    }
}
