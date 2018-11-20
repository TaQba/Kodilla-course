package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.*;

public class World {
    private final String name;
    private final List<Continent> theContinentsList = new ArrayList<>();

    public World(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Continent item) {
        theContinentsList.add(item);
    }

    public List<Continent> theContinentsList() {
        return theContinentsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof World)) return false;
        World world = (World) o;
        return Objects.equals(getName(), world.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }


    public BigDecimal getPeopleQuantity() {
        return theContinentsList.stream()
                .flatMap(continent -> continent.getTheCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,  (sum, current) -> sum = sum.add(current));
    }
}
