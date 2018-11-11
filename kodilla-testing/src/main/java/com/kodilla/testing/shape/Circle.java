package com.kodilla.testing.shape;

public class Circle implements Shape {
    public String getShapeName() {
        return String.valueOf(this.getClass());
    }

    public double getField() {
        return 100.54;
    }
}
