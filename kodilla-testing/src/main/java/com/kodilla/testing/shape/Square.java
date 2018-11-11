package com.kodilla.testing.shape;

public class Square implements Shape {
    public String getShapeName() {
        return String.valueOf(this.getClass());
    }

    public double getField() {
        return 465.46;
    }
}
