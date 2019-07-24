package com.practice.design.pattern.creational.simplefactory;

import com.practice.design.pattern.creational.simplefactory.api.Shape;
import com.practice.design.pattern.creational.simplefactory.api.ShapeType;
import com.practice.design.pattern.creational.simplefactory.impl.Rectangle;
import com.practice.design.pattern.creational.simplefactory.impl.Sqaure;

public class ShapeFactory {

    public static Shape getInstance(ShapeType requiredShape) {
        switch (requiredShape) {
            case SQAURE: {
                return new Sqaure();
            }
            case RECTANGLE: {
                return new Rectangle();
            }
            default: {
                throw new IllegalArgumentException(String.format("{}: Type not supported", requiredShape.toString()));
            }
        }
    }
}
