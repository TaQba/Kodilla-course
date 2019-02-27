package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

interface PizzaOrder {
    BigDecimal getCost();
    String getDescription();
}
