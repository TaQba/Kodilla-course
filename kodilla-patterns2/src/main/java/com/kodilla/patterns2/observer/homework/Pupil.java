package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Pupil implements Observable {
    private final String name;
    private final List<Task> tasks;
    private final List<Observer> teachers;

    public Pupil(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer teacher) {
        teachers.add(teacher);
    }

    @Override
    public void removeObserver(Observer teacher) {
        teachers.remove(teacher);
    }

    @Override
    public void notifyObservers() {
        for (Observer teacher:
                teachers) {
            teacher.update(this);
        }
    }

    public String getName() {
        return name;
    }
}
