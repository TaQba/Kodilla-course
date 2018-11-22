package com.kodilla.stream.array;

import java.util.stream.IntStream;

interface ArrayOperations {
    static double getAverage(int[] numbers) {
        // TASK 7.6
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        return average;
    }
}
