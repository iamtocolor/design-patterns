package com.practice.design.pattern.creational.builder;

import com.practice.design.pattern.creational.builder.api.Meal;

public class MainApp {

    public static void main(String[] args) {
        Meal meal = new Meal.Builder().buildBurger("satish").buildDrink("guprta").build();
        Meal meal1 = new Meal.Builder().buildBurger("johan").buildDrink("botha").build();
    }
}
