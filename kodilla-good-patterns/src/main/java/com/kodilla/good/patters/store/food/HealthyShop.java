package com.kodilla.good.patters.store.food;

import java.util.HashMap;

public class HealthyShop extends BaseShop implements Shop {
    protected static final String NAME = "Marchewka";

    @Override
    public HashMap<String, Integer> getList() {
        theList.put("Apple", 1000);
        theList.put("Carrot", 200);
        return theList;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
