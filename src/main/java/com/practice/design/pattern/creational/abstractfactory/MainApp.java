package com.practice.design.pattern.creational.abstractfactory;

import com.practice.design.pattern.creational.abstractfactory.impl.BikeCreator;
import com.practice.design.pattern.creational.abstractfactory.impl.CarCreator;

public class MainApp {

    public static void main(String[] args) {
        BikeCreator bikeCreator = new BikeCreator();

        System.out.println(bikeCreator.getWheel().getDescription());
        System.out.println(bikeCreator.getWheelExpert().getDescription());

        CarCreator carCreator = new CarCreator();
        System.out.println(carCreator.getWheel().getDescription());
        System.out.println(carCreator.getWheelExpert().getDescription());
    }
}
