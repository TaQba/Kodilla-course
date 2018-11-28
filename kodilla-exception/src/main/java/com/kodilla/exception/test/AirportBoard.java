package com.kodilla.exception.test;

import java.util.*;

public class AirportBoard {

    HashMap<Flight, Boolean> boardMap = new HashMap<Flight, Boolean>();
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (boardMap.containsKey(flight)) {
            System.out.println("Found " + flight.toString());
            return boardMap.get(flight);
        }

        throw new RouteNotFoundException("Cannot find " + flight.toString());
    }

    public void addToboardMapList(Flight flight, Boolean check) {
        boardMap.put(flight, check);
    }

}
