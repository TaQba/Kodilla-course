package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    ShapeCollector collection = new ShapeCollector();
    Shape circle = new Circle();
    Shape square = new Square();
    Shape triagnle = new Triangle();

    @Test
    public void testAddFigure() {
        //Given
        //When
        collection.addFigure(circle);
        collection.addFigure(square);
        //Then
        Assert.assertEquals(2, collection.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        //When
        collection.removeFigure(circle);
        //Then
        Assert.assertEquals(1, collection.getSize());
    }

    @Test
    public void testGetFigureEmptyCollection() {
        //Given
        //When
        //Then
        Assert.assertEquals(0, collection.getSize());
        Assert.assertEquals(0, collection.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        //When
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triagnle);

        //Then
        Assert.assertEquals(3, collection.getSize());
        Assert.assertEquals(circle, collection.getFigure(0));
        Assert.assertEquals(square, collection.getFigure(1));
        Assert.assertEquals(triagnle, collection.getFigure(2));
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collection = new ShapeCollector();

        //When
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triagnle);
        //Then
        Assert.assertEquals("Circle,Square,Triangle", collection.showFigures());
    }

}
