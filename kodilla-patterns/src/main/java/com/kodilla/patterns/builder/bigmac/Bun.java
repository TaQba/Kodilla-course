package com.kodilla.patterns.builder.bigmac;

public class Bun implements Bread {
    final String name;
    final boolean seeds;

    public Bun(String name, boolean seeds) {
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
