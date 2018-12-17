package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Trip to London", "London", "BWM");
            case PAINTING:
                return new PaintingTask("Draw a car", "blue", "car");
            case SHOPPING:
                return new ShoppingTask("Christmas present", "toy", 2);
            default:
                return null;
        }

    }
}
