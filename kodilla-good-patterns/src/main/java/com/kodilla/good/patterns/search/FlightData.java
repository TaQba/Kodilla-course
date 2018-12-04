package com.kodilla.good.patterns.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightData {
    public static Set<Flight> from(final List<Flight> theList, final String cityName) {
        return theList.stream()
        .filter(s -> s.getFrom() == cityName)
        .collect(Collectors.toSet());
    }

    public static Set<Flight> through(final List<Flight> theList, final String cityName) {
        return theList.stream()
                .flatMap(list -> list.getSet().stream())
                .filter(s -> s.getTo() == cityName)
                .collect(Collectors.toSet());
    }

    public static Set<Flight> to(final List<Flight> theList, final String cityName) {
        return theList.stream()
                .filter(s -> s.getTo() == cityName)
                .collect(Collectors.toSet());
    }


}
