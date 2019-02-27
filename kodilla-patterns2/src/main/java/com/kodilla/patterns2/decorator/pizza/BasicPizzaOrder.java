package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return getBaseCost().add(getCheeseCost()).add(getTomatoSouceCost());
    }

    @Override
    public String getDescription() {
        return getBaseDesc() + getCheeseDesc() + getSourceDesc();
    }

    private BigDecimal getBaseCost() {
        return new BigDecimal(10);
    }
    private BigDecimal getTomatoSouceCost() {
        return new BigDecimal(3);
    }
    private BigDecimal getCheeseCost() {
        return new BigDecimal(2);
    }

    private String getBaseDesc() {
        return "Base";
    }
    private String getCheeseDesc() {
        return " + cheess";
    }
    private String getSourceDesc() {
        return " + tomato souce";
    }
}
