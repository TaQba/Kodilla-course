package com.kodilla.good.patterns.challenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.IntStream;

public  class Validation {
    public static boolean port(int port, int[] options) {
        boolean exits =  IntStream.of(options).anyMatch(x -> x == port);
        if (!exits) {
            System.out.println("Invalid port!");
            return false;
        }
        return true;
    }

    public static boolean url(String url) {
        try {
            new URL(url);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
            return false;
        }
        return true;
    }

    public static boolean username(String string) {
        String regex = "^[a-zA-Z]+$";
        if (!string.matches(regex)) {
            System.out.println("Invalid username!");
            return false;
        }
        return true;
    }

    public static boolean product(String string) {
        String regex = "^[a-zA-Z /-]+$";
        if (!string.matches(regex)) {
            System.out.println("Invalid product name!");
            return false;
        }
        return true;
    }

    public static boolean password(String string) {
        String regex = "^[a-zA-Z1-9!$.]+$";
        if (!string.matches(regex)) {
            System.out.println("Invalid password!");
            return false;
        }
        return true;
    }
}
