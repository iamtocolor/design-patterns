package com.practice.design.pattern.behavioural.visitor;

import com.practice.design.pattern.behavioural.visitor.api.Visitable;
import com.practice.design.pattern.behavioural.visitor.impl.Book;
import com.practice.design.pattern.behavioural.visitor.impl.Car;
import com.practice.design.pattern.behavioural.visitor.impl.Dvd;
import com.practice.design.pattern.behavioural.visitor.impl.PrintingVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Visitable> items  = new ArrayList<Visitable>();

        Book book = new Book();
        book.setData("Book");

        Car car = new Car();
        car.setData("Car");

        Dvd dvd = new Dvd();
        dvd.setData("Dvd");

        items.add(book);
        items.add(car);
        items.add(dvd);

        PrintingVisitor printingVisitor = new PrintingVisitor();
        for (Visitable visitable : items) {
            visitable.accept(printingVisitor);
        }
    }
}
