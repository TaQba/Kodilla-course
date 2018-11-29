package com.kodilla.good.patterns.challenges;

import java.util.*;

public class Orders {
    HashMap<IShopInterface, Product> ordersMap = new HashMap<IShopInterface, Product>();

    public void put(IShopInterface shop, Product product) {
        ordersMap.put(shop, product);
    }
    public void disply() {
        for(Map.Entry<IShopInterface, Product> entry :ordersMap.entrySet()){
            System.out.println(entry.getKey().toString() + ", " + entry.getValue().toString());
        }
    }
}
