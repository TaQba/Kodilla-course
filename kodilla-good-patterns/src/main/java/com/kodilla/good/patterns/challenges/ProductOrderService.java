package com.kodilla.good.patterns.challenges;


public class ProductOrderService {
    public static void main(String args[]) throws ConnectionException {
        System.out.println("START");

        IShopInterface shop = new AllegroService();
        try {
            shop.setConnection();
            shop.login("fsoo","Bar123");
        } catch (ConnectionException e) {
            System.out.println("Cannot connect to shop: " + e.getMessage());
            System.exit(500);
        }
        Product game1 = new Product("Medal of Honor");
        Product game2 = new Product("Medal of Honor2");
        Product product1 = new Product("Kapcie");
        Product product2 = new Product("Brush");
        
        Orders basket = new Orders();
        
        if(shop.order(game1)) {

            basket.put(shop,game1);
        }

        if(shop.order(game2)) {
            basket.put(shop,game2);
        }
        if(shop.order(product1)) {
            basket.put(shop,product1);
        }
        if(shop.order(product2)) {
            basket.put(shop,product2);
        }
        shop.logout();

        basket.disply();
    }
}
