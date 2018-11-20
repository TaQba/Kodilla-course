package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage () {
        //Given
        int[] table = new int[20];
        //WHEN
        for (int i = 0; i < 20; i++)
            table[i] = i + 1;

        //Then
        Assert.assertEquals(10 , ArrayOperations.getAverage(table),0.5);
    }
}
