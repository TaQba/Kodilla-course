package com.kodilla.good.patterns.challenges;

public class Product extends Object {
    String name;
    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
