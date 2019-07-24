package com.practice.design.pattern.creational.simplefactory.impl;

import com.practice.design.pattern.creational.simplefactory.api.Shape;

public class Rectangle implements Shape {

    public void name() {
        System.out.println("This is a Rectangle");
    }

    public void draw() {
        System.out.println("Drawing an rectangle");
    }
}
