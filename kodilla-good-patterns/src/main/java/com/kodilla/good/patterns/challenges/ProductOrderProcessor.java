package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class ProductOrderProcessor {
    private IShopInterface shop;
    private ArrayList productList;
    private Orders basket;

    public ProductOrderProcessor(IShopInterface shop, ArrayList productList, Orders basket) {
        this.shop = shop;
        this.productList = productList;
        this.basket = basket;
    }

    public void run() {
        System.out.println("START\n");

        System.out.println("Connecting to shop ...");
        this.connectToShop();
        System.out.println("Connected to shop.");
        System.out.println("Making the order...");
        this.makeOrder();
        System.out.println("Order done.");
        System.out.println("Login out from shop ...");
        this.shop.logout();
        System.out.println("Logged out.");
        System.out.println("Show orders list:\n");
        basket.display();
        System.out.println("\nEND");
    }

    private void connectToShop() {
        try {
            shop.setConnection();
            shop.login("Foo","Bar123");
        } catch (ConnectionException e) {
            System.out.println("Cannot connect to shop: " + e.getMessage());
            System.exit(500);
        }
    }

    private  void makeOrder() {
        for (Object product: productList) {
            if(shop.order((Product) product)) {
                basket.put(shop,(Product) product);
            }
        }
    }

}
