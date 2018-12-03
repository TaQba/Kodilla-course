package com.kodilla.good.patterns.search;

import java.util.ArrayList;

public final class Search {
    public static void from(String cityName) {
        FlightData.getList().stream()
                .filter(s -> s.getFrom() == cityName)
                .forEach(System.out::println);
    }

    public static void through(String cityName) {
        FlightData.getList().stream()
                .filter(s -> s.getThrough() == cityName)
                .forEach(System.out::println);
    }

    public static void to(String cityName) {
        FlightData.getList().stream()
                .filter(s -> s.getThrough() == cityName || s.getTo() == cityName)
                .forEach(System.out::println);
    }
}
