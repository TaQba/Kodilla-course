package com.kodilla.exception.test;

public class AirportRunner {
    public static void main(String[] args) {
        Flight f1 = new Flight("Monaco", "Glasgow");
        Flight f2 = new Flight("Paris", "Monaco");
        Flight f3 = new Flight("London", "Berlin");
        Flight f4 = new Flight("Berlin", "London");
        Flight f5 = new Flight("Warsaw", "London");
        Flight f6 = new Flight("Warsaw", "Cracow");

        AirportBoard b1 = new AirportBoard();
        b1.addToboardMapList(f1, true);
        b1.addToboardMapList(f2, true);
        b1.addToboardMapList(f3, false);
        b1.addToboardMapList(f4, true);
        b1.addToboardMapList(f5, false);


        //checks
        try {
            b1.findFlight(f1);
            b1.findFlight(f6);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
