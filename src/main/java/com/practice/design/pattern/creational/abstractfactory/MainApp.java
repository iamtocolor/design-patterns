package com.practice.design.pattern.creational.abstractfactory;

import com.practice.design.pattern.creational.abstractfactory.api.Creator;
import com.practice.design.pattern.creational.abstractfactory.api.Wheel;
import com.practice.design.pattern.creational.abstractfactory.api.WheelExpert;
import com.practice.design.pattern.creational.abstractfactory.impl.BikeCreator;
import com.practice.design.pattern.creational.abstractfactory.impl.CarCreator;

import java.util.Arrays;

public class MainApp {

//    public static void main(String[] args) {
//        BikeCreator bikeCreator = new BikeCreator();
//
//        System.out.println(bikeCreator.getWheel().getDescription());
//        System.out.println(bikeCreator.getWheelExpert().getDescription());
//
//        CarCreator carCreator = new CarCreator();
//        System.out.println(carCreator.getWheel().getDescription());
//        System.out.println(carCreator.getWheelExpert().getDescription());
//    }

    public static void main(String[] args) {
        Creator creator = null;
        args = (String[]) Arrays.asList("Car").toArray();
        if (args[0].equalsIgnoreCase("Car")) {
            creator = new CarCreator();
        } else if (args[0].equalsIgnoreCase("Bike")) {
            creator = new BikeCreator();
        }
        Runner runner = new Runner(creator);
        System.out.println(runner.toString());
    }

    static class Runner {
        private Creator creator;
        private Wheel wheel;
        private WheelExpert wheelExpert;

        public Runner(Creator creator) {
            this.creator = creator;
            this.wheel = creator.getWheel();
            this.wheelExpert = creator.getWheelExpert();
        }

        @Override
        public String toString() {
            return "Runner{" +
                    "creator=" + creator +
                    ", wheel=" + wheel +
                    ", wheelExpert=" + wheelExpert +
                    '}';
        }
    }
}
