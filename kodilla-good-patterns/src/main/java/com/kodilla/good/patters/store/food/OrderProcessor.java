package com.kodilla.good.patters.store.food;

import javafx.scene.paint.Stop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderProcessor implements Order {
    private ArrayList<Shop> distrbutorList = new ArrayList<Shop>();
    private Product product;

    public OrderProcessor(Product product) {
        this.product = product;
    }
    
    @Override
    public boolean process() {

        for (Map.Entry<String, Integer> entry: product.getTheList().entrySet()) {
            System.out.println("\nTo order quantity: " + entry.getValue() + " of product:" + entry.getKey());
            for (Shop shop: distrbutorList) {
                if(this.processOrder(shop, entry.getKey(),entry.getValue())) {
                    break;
                }
            }
        }
        return true;
    }

    public boolean processOrder(Shop shop, String productName, Integer qty) {
        for (Map.Entry<String, Integer> entry: shop.getList().entrySet()) {
            if(productName == entry.getKey() ) {
                if (qty <= entry.getValue()) {
                    System.out.println("Ordered quantity: " + qty + " of product: " + productName + " in Shop: " +
                            shop.getName());
                } else {
                    System.out.println("Found product: " + productName + " in Shop: " + shop.getName() +
                            " but there is not enough qty.");
                }

                return true;
            }
        }
        return false;
    }

    @Override
    public void addDistribution(Shop shop) {
        distrbutorList.add(shop);
    }
}
