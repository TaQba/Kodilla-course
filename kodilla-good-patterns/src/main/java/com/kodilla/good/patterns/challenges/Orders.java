package com.kodilla.good.patterns.challenges;

import java.util.*;

public class Orders {
    HashMap<Product,String> ordersMap = new HashMap<Product, String>();

    public void put(IShopInterface shop, Product product) {
        ordersMap.put(product, shop.toString());
    }
    public void display() {
        for(Map.Entry<Product, String> entry :ordersMap.entrySet()){
            System.out.println(entry.getKey().toString() + " in  " + entry.getValue());
        }
    }
}
