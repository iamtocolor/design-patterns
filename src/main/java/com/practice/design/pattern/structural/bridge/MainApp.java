package com.practice.design.pattern.structural.bridge;

import com.practice.design.pattern.structural.bridge.impl.AdultLunchImpl;
import com.practice.design.pattern.structural.bridge.impl.BoyLunch;
import com.practice.design.pattern.structural.bridge.impl.KidsLunchImpl;

public class MainApp {

    public static void main(String[] args) {

        AdultLunchImpl adultLunch = new AdultLunchImpl();
        KidsLunchImpl kidsLunch = new KidsLunchImpl();

        BoyLunch boyLunchAdult= new BoyLunch(adultLunch);
        BoyLunch boyLunchKids = new BoyLunch(kidsLunch);

        boyLunchAdult.buildDessert();
        boyLunchAdult.buildMeal();
        boyLunchAdult.buildStarter();

        boyLunchKids.buildStarter();
        boyLunchKids.buildMeal();
        boyLunchKids.buildDessert();

    }
}
