package com.kodilla.good.patterns.search;

import java.util.Objects;

public class Flight {
    private final String from;
    private final String to;
    private final String through;

    public Flight(String from, String to, String through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(through, flight.through);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, through);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", through='" + through + '\'' +
                '}';
    }
}
