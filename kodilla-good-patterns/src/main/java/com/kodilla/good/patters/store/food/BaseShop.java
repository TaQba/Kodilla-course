package com.kodilla.good.patters.store.food;

import java.util.HashMap;
import java.util.Map;

public class BaseShop {
    HashMap<String, Integer> theList = new HashMap<String, Integer>();
    // @todo to discuss that?
//    public boolean processOrder(String productName, Integer qty) {
//        for (Map.Entry<String, Integer> entry: theList.entrySet()) {
//            System.out.println("Ordered quantity: " + qty+ " of product:" + productName);
//
//            if(productName == entry.getKey() && qty <= entry.getValue()) {
//                System.out.println("Ordered quantity: " + qty+ " of product:" + productName);
//                return true;
//            }
//        }
//        return false;
//    }
}
