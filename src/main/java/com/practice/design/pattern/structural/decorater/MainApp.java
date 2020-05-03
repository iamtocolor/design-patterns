package com.practice.design.pattern.structural.decorater;

import com.practice.design.pattern.structural.decorater.api.IName;
import com.practice.design.pattern.structural.decorater.api.NameDecorater;
import com.practice.design.pattern.structural.decorater.impl.GuptaTitleDecorater;
import com.practice.design.pattern.structural.decorater.impl.SatishName;

public class MainApp {

    public static void main(String[] args) {
        IName iName = new SatishName();
        NameDecorater nameDecorater = new GuptaTitleDecorater(iName);
        nameDecorater.printName();
    }
}
