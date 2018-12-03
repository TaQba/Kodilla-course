package com.kodilla.good.patters.store.food;

import java.util.HashMap;

public class ExtraFoodShop extends BaseShop implements Shop {
    protected static final String NAME = "Wszystko Jest";
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public HashMap<String, Integer> getList() {
        theList.put("Coconut", 200);
        theList.put("Cabadge", 100);
        return theList;
    }
}
