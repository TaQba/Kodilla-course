package com.kodilla.good.patters.store.food;

import java.util.HashMap;

public class Product {
    private HashMap<String,Integer> theList = new HashMap<String,Integer>();

    public HashMap<String,Integer> getTheList() {
        theList.put("Flour", 10);
        theList.put("Cookie", 50);
        theList.put("Cake", 15);
        theList.put("Cabadge", 13);
        theList.put("Carrot", 13);
        theList.put("Apple", 100);
        return theList;
    }
}
