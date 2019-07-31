package com.practice.design.pattern.structural.facade.facade;

import com.practice.design.pattern.structural.facade.api.FlightBooking;
import com.practice.design.pattern.structural.facade.api.HotelBooking;

public class TravelFacade {

    private HotelBooking hotelBooking;
    private FlightBooking flightBooking;

    public TravelFacade() {
        hotelBooking = new HotelBooking();
        flightBooking = new FlightBooking();
    }

    public void book() {
        hotelBooking.bookHotel();
        flightBooking.bookFlight();
    }

}
