package com.kodilla.good.patters.store.food;

interface Order {
    boolean process();
    void addDistribution(Shop shop);
}
