package com.practice.design.pattern.structural.facade;

import com.practice.design.pattern.structural.facade.facade.TravelFacade;

public class Main {

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.book();
    }

}
