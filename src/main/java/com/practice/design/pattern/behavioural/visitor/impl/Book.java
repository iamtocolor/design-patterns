package com.practice.design.pattern.behavioural.visitor.impl;

import com.practice.design.pattern.behavioural.visitor.api.Visitable;
import com.practice.design.pattern.behavioural.visitor.api.Visitor;

public class Book implements Visitable {
    private String data;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
