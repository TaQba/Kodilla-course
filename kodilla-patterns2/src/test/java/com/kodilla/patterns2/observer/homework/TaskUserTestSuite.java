package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Pupil john = new Pupil("John Smith");
        Pupil laura = new Pupil("Laura Palmer");

        Task t1_1 = new Task("Task 1.1");
        Task t1_2 = new Task("Task 1.2");
        Task t1_3 = new Task("Task 1.3");
        Task t1_4 = new Task("Task 1.4");
        Task t2_1 = new Task("Task 2.1");
        Task t2_2 = new Task("Task 2.2");

        Teacher adam = new Teacher("Adam Sander");
        Teacher mark = new Teacher("Mark Taylor");

        //When

        john.registerObserver(adam);
        laura.registerObserver(mark);

        john.addTask(t1_1);
        laura.addTask(t1_1);
        john.addTask(t1_2);
        laura.addTask(t1_1);
        john.addTask(t1_3);
        laura.addTask(t1_1);
        john.addTask(t1_4);
        laura.addTask(t1_1);

        laura.addTask(t2_1);
        laura.addTask(t2_2);

        //Then
        Assert.assertEquals(4, adam.getCounter());
        Assert.assertEquals(6, mark.getCounter());
    }

}
