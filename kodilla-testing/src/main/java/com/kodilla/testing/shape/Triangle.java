package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String getShapeName() {
        return String.valueOf(this.getClass());
    }

    public double getField() {
        return 87.05;
    }
}
