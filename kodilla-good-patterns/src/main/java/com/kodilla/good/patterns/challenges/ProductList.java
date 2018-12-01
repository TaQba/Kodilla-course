package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class ProductList {
    public static ArrayList get() {
        ArrayList<Product> list= new ArrayList();
        list.add(new Product("Medal of Honor"));
        list.add(new Product("Medal of Honor2"));
        list.add(new Product("Kapcie"));
        list.add(new Product("Brush"));

        return  list;
    }
}
