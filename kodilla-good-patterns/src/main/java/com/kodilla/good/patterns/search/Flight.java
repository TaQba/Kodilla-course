package com.kodilla.good.patterns.search;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Flight {
    private final String name;
    private final String from;
    private final String to;
    private final Set<Flight> set = new HashSet<>();

    public Flight(final String name, final String from, final String to) {
        this.from = from;
        this.to = to;
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getName() {
        return name;
    }

    public void addToSet(Flight flight) {
        set.add(flight);
    }

    public Set<Flight> getSet() {
        return set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getName(), flight.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
