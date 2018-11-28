package com.kodilla.exception.test;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.*;

public class AirportRunnerTestSuite {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldAirportBoardHaveFlights() throws RouteNotFoundException  {
        //Given
        Flight f1 = new Flight("Monaco", "Glasgow");
        AirportBoard b1 = new AirportBoard();
        //When
        b1.addToboardMapList(f1, true);
        //Then
        Assert.assertEquals(b1.findFlight(f1), true);
    }

    @Test
    public void shouldAirportBoardThrowSomeException() throws RouteNotFoundException {
        //Given
        Flight f1 = new Flight("Monaco", "Glasgow");
        Flight f6 = new Flight("Warsaw", "Cracow");
        AirportBoard b1 = new AirportBoard();

        thrown.expect(RouteNotFoundException.class);
        thrown.expectMessage("Cannot find flight{departureAirport='Warsaw', arrivalAirport='Cracow'");

        //When
        b1.addToboardMapList(f1, true);
        //Then
        b1.findFlight(f6);
    }

}
