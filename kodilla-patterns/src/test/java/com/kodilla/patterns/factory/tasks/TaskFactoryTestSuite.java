package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Trip to London", driving.getTaskName());
    }

    @Test
    public void testTaskTypeDoesNotExist() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask("FooBar");
        //Then
        Assert.assertNull(task);
    }

    @Test
    public void testPaintingDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.PAINTING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Draw a car", driving.getTaskName());
    }

    @Test
    public void testShoppingDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.SHOPPING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Christmas present", driving.getTaskName());
    }
}
