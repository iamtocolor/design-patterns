package com.practice.design.pattern.structural.composite.impl;

import java.util.List;

import com.practice.design.pattern.structural.composite.api.ITree;

public class TreeComposite extends ITree {

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
        childrens = iTrees;
    }

    @Override
    public void addChildren(ITree iTree) {
        childrens.add(iTree);
    }

    @Override
    public void removeChildre(ITree iTree) {
        childrens.remove(iTree);
    }

    @Override
    public List<ITree> getALLChild() {
        return childrens;
    }
}
