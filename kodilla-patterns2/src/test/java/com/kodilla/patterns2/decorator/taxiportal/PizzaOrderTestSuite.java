package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithChickenAndOlivesCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenPizzaDecorator(theOrder);
        theOrder = new ExtraOlivesPizzaDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), cost);
    }

    @Test
    public void testPizzaWithChickenAndOlivesDesc() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenPizzaDecorator(theOrder);
        theOrder = new ExtraOlivesPizzaDecorator(theOrder);
        //When
        String desc = theOrder.getDescription();
        //Then
        assertEquals("Base + cheess + tomato souce +  chicken +  olives", desc);
    }
}
