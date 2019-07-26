package com.practice.design.pattern.structural.adapter.impl;

import java.util.Collections;
import java.util.List;

import com.practice.design.pattern.structural.adapter.adapt.ArrayToList;
import com.practice.design.pattern.structural.adapter.api.ITarget;

public class ArrayTarget implements ITarget {

    public Integer[] sortArray(Integer[] data) {
        ArrayToList arrayToList = new ArrayToList();

        List<Integer> list = arrayToList.arrayToList(data);

        ListAdaptee adaptee = new ListAdaptee();

        adaptee.sortList(list);

        return arrayToList.listToArray(list);
    }
}
