package com.kodilla.patterns.builder.bigmac;

public class Roll implements Bread {
    final String name;
    final boolean seeds;

    public Roll(String name, boolean seeds) {
        this.name = name;
        this.seeds = seeds;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasSeedsOnTheTop() {
        return seeds;
    }
}