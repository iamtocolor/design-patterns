package com.practice.design.pattern.behavioural.visitor.impl;

import com.practice.design.pattern.behavioural.visitor.api.Visitor;

public class PrintingVisitor implements Visitor {
    public void visit(Book boo) {
        System.out.println(boo.getData());
    }

    public void visit(Car car) {
        System.out.println(car.getData());
    }

    public void visit(Dvd dvd) {
        System.out.println(dvd.getData());
    }
}
