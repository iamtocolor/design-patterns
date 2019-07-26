package com.practice.design.pattern.structural.adapter.impl;

import java.util.Collections;
import java.util.List;

import com.practice.design.pattern.structural.adapter.api.IAdaptee;

public class ListAdaptee implements IAdaptee {

    public void sortList(List<Integer> list) {
        Collections.sort(list);
    }
}
