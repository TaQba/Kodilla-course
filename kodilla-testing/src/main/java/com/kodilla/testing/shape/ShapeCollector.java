package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();
    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String output = "";
        for (Shape item: shapes) {

            output +=  item.getShapeName()+",";
        }
        return output;
    }

    public int getSize() {
        return shapes.size();
    }
}
