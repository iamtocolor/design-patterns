package com.practice.design.pattern.structural.adapter.adapt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public List<Integer> arrayToList(Integer[] data) {
        return Arrays.asList(data);
    }

    public Integer[] listToArray(List<Integer> list) {
        return (Integer[]) list.toArray();
    }
}
