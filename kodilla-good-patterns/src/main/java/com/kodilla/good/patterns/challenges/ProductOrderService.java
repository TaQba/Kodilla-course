package com.kodilla.good.patterns.challenges;


import java.util.ArrayList;

public class ProductOrderService {
    public static void main(String args[]) throws ConnectionException {
        IShopInterface shop = new AllegroService();
        ArrayList productList = ProductList.get();
        Orders basket = new Orders();

        ProductOrderProcessor process = new ProductOrderProcessor(shop, productList, basket);
        process.run();
    }
}
