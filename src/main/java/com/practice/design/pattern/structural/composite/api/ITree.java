package com.practice.design.pattern.structural.composite.api;

import java.util.ArrayList;
import java.util.List;

public abstract class ITree {

    protected int data;

    protected List<ITree> childrens = new ArrayList<ITree>();


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public abstract void setChildren(List<ITree> iTrees);

    public abstract void addChildren(ITree iTree);

    public abstract void removeChildre(ITree iTree);

    public abstract List<ITree> getALLChild();
}
