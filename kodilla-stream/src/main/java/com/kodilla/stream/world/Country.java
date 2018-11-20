package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String code;
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(String code, String name, BigDecimal peopleQuantity) {
        this.code = code;
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getCode(), country.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
