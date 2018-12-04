package com.kodilla.good.patterns.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightDataTestSuite {
    @Test
    public void shouldReturnTwoFlightWhenSearchFromPort() {
        final List<Flight> theList = new ArrayList<Flight>();
        //Given
        Flight flight3 = new Flight("GDA-WWA","GDA","WWA");
        Flight flight1 = new Flight("GDA-KRK","GDA","KRA");
        Flight flight2 = new Flight("GDA-BDG","GDA","BDG");

        //When
        theList.add(flight1);
        theList.add(flight2);

        //Then
        Assert.assertEquals(2, FlightData.from(theList, "GDA").size());
        Assert.assertTrue(FlightData.from(theList, "GDA").contains(flight1));
        Assert.assertTrue(FlightData.from(theList, "GDA").contains(flight2));
        Assert.assertFalse(FlightData.from(theList, "GDA").contains(flight3));
    }

    @Test
    public void shouldReturnTwoFlightWhenSearchToPort() {
        final List<Flight> theList = new ArrayList<Flight>();
        //Given

        Flight flight1 = new Flight("GDA-KRK","GDA","KRA");
        Flight flight2 = new Flight("GDA-BDG","GDA","BDG");
        Flight flight3 = new Flight("GDA-WWA","GDA","WWA");
        //When
        theList.add(flight1);
        theList.add(flight2);
        theList.add(flight3);

        //Then
        Assert.assertEquals(1, FlightData.to(theList, "WWA").size());
        Assert.assertTrue(FlightData.to(theList, "WWA").contains(flight3));
        Assert.assertFalse(FlightData.to(theList, "WWA").contains(flight2));
        Assert.assertFalse(FlightData.to(theList, "WWA").contains(flight1));
    }

    @Test
    public void shouldReturnTwoFlightWhenSearchThroughPort() {
        final List<Flight> theList = new ArrayList<Flight>();
        //Given
        Flight flight1 = new Flight("GDA-KRK","GDA","KRA");
        Flight flight1a = new Flight("GDA-BDG","GDA","BDG");
        Flight flight1b = new Flight("BDG-KRK","BDG","KRK");
        Flight flight2 = new Flight("KAT-BDG","KAT","BDG");
        //When
        flight1.addToSet(flight1a);
        flight1.addToSet(flight1b);

        theList.add(flight1);


        //Then
        Assert.assertEquals(1, FlightData.through(theList, "BDG").size());
        Assert.assertTrue(FlightData.through(theList, "BDG").contains(flight1a));
        Assert.assertFalse(FlightData.through(theList, "BDG").contains(flight2));
    }
}
