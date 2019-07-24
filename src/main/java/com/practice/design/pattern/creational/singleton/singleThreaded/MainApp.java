package com.practice.design.pattern.creational.singleton.singleThreaded;

public class MainApp {

    public static void main(String[] args) {
        Model model1 = Model.getInstance();
        Model model2 = Model.getInstance();

        System.out.println(model1.hashCode());
        System.out.println(model2.hashCode());
    }
}
