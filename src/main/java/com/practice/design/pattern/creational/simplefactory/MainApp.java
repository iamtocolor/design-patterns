package com.practice.design.pattern.creational.simplefactory;

import com.practice.design.pattern.creational.simplefactory.api.Shape;
import com.practice.design.pattern.creational.simplefactory.api.ShapeType;

public class MainApp {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getInstance(ShapeType.RECTANGLE);
        Shape shape1 = ShapeFactory.getInstance(ShapeType.SQAURE);

        shape.name();
        shape1.name();
    }

}
