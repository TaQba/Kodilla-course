package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage () {
        int[] table = new int[20];
        for (int i = 0; i < 20; i++)
            table[i] = i + 1;

        Assert.assertEquals(10 , ArrayOperations.getAverage(table),0.5);
    }
}
