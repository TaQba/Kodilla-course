package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bread bread = BreadFactory.takeBreak("BUN" , true);
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bread(bread)
                .burgers(2)
                .ingredient("Onion")
                .sauce("standard")
                .sauce("barbecue")
                .ingredient("Beacon")
                .ingredient("Cheese")
                .build();
        System.out.println(burger);
        //When
        int howManyIngredients = burger.getIngredients().size();
        //Then
        Assert.assertEquals("Bun", burger.getBread().getName());
        Assert.assertEquals("barbecue", burger.getSauce());
        Assert.assertEquals("2", burger.getBurgers().toString());
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertFalse(burger.getIngredients().contains("Ham"));
        Assert.assertTrue(burger.getIngredients().contains("Beacon"));
    }

    @Test(expected = IllegalStateException.class)
    public void testBigmacNoBreadtype() {
        //Given
        //When
        //Then
        Bread bread = BreadFactory.takeBreak("FooBar" , true);
    }
}

