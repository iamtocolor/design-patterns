package com.practice.design.pattern.structural.adapter;

import com.practice.design.pattern.structural.adapter.impl.ArrayTarget;

public class MainApp {

    public static void main(String[] args) {
        Integer[] data = {5, 4, 3, 2, 1};
        ArrayTarget arrayTarget = new ArrayTarget();
        arrayTarget.sortArray(data);
        for (Integer d : data) {
            System.out.println(d);
        }
    }
}
