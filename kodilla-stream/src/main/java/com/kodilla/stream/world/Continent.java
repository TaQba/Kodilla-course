package com.kodilla.stream.world;

import java.util.*;

public class Continent {
    private final String name;
    private final List<Country> theCountryList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }


    public void addItem(Country item) {
        theCountryList.add(item);
    }

    public List<Country> getTheCountryList() {
        return theCountryList;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return name.equals(continent.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
