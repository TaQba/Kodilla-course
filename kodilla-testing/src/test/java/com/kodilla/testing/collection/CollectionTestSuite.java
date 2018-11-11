package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: start");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
        System.out.println(" ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        //Given
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        ArrayList<Integer> set = new ArrayList<Integer>();
        //When
        ArrayList result = numbers.exterminate(set);
        System.out.println("Testing method: testOddNumbersExterminatorEmptyList");
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        ArrayList<Integer> expectedSet = new ArrayList<Integer>();
        expectedSet.add(2);
        expectedSet.add(4);

        //When
        ArrayList result = numbers.exterminate(set);
        System.out.println("Testing method: testOddNumbersExterminatorNormalList");

        //Then
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(expectedSet, result);
    }
}
