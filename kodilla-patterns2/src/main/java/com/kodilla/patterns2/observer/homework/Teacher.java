package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer {
    private final String name;
    private int counter = 0;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Pupil pupil) {
        System.out.println("Pupil " + pupil.getName() + " made another task");
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
