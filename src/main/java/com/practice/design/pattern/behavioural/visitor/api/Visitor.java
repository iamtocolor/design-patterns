package com.practice.design.pattern.behavioural.visitor.api;

import com.practice.design.pattern.behavioural.visitor.impl.Book;
import com.practice.design.pattern.behavioural.visitor.impl.Car;
import com.practice.design.pattern.behavioural.visitor.impl.Dvd;

public interface Visitor {

    public void visit(Book boo);
    public void visit(Car car);
    public void visit(Dvd dvd);
}
