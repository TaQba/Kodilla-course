package com.kodilla.good.patterns.search;

public class Processor {
    public static void main(String args[]) {
        System.out.println("Flight to: Bydgoszcz:");
        Search.from("Bydgoszcz");

        System.out.println("\nFlight to: Warsaw:");
        Search.to("Warsaw");

        System.out.println("\nFlight through: Riga:");
        Search.to("Riga");
    }
}
