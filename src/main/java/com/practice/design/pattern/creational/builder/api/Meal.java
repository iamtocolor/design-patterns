package com.practice.design.pattern.creational.builder.api;

public class Meal {

    private String drinkname;
    private String burgerName;

    public Meal(String drinkname, String burgerName) {
        this.drinkname = drinkname;
        this.burgerName = burgerName;
    }

    public static class Builder {

        private String drinkname;
        private String burgerName;

        public Builder() {

        }

        public Builder buildDrink(String drinkname) {
            this.drinkname = drinkname;
            return this;
        }

        public Builder buildBurger(String burgername) {
            this.burgerName = burgername;
            return this;
        }

        public Meal build() {
            return new Meal(this.drinkname, burgerName);
        }
    }
}
