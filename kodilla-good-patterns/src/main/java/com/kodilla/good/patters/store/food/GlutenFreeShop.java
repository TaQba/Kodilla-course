package com.kodilla.good.patters.store.food;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends BaseShop implements Shop {
    protected static final String NAME = "Samo Zdrowie";
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public HashMap<String, Integer> getList() {
        theList.put("Flour", 100);
        theList.put("Cake", 200);
        theList.put("Cookie", 10);
        return theList;
    }
}
