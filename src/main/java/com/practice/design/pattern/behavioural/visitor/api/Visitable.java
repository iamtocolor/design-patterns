package com.practice.design.pattern.behavioural.visitor.api;

public interface Visitable {
    public void accept(Visitor visitor);
}
