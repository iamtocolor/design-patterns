package com.practice.design.pattern.structural.composite.impl;

import java.util.List;

import com.practice.design.pattern.structural.composite.api.ITree;

public class TreeLeaf extends ITree {

    @Override
    public int getData() {
        return super.getData();
    }

    @Override
    public void setData(int data) {
        super.setData(data);
    }

    @Override
    public void setChildren(List<ITree> iTrees) {
        childrens = null;
    }

    @Override
    public void addChildren(ITree iTree) {
        throw new RuntimeException("Not Supported");
    }

    @Override
    public void removeChildre(ITree iTree) {
        throw new RuntimeException("Not Supported");
    }

    @Override
    public List<ITree> getALLChild() {
        return childrens;
    }
}
