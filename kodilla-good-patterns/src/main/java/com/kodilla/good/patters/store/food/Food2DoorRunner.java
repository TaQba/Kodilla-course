package com.kodilla.good.patters.store.food;

public class Food2DoorRunner {
    public static void main(String args[]) {
        Product products = new Product();

        Shop shop1 = new ExtraFoodShop();
        Shop shop2 = new GlutenFreeShop();
        Shop shop3 = new HealthyShop();

        OrderProcessor order = new OrderProcessor(products);
        order.addDistribution(shop1);
        order.addDistribution(shop2);
        order.addDistribution(shop3);

        order.process();

    }
}
