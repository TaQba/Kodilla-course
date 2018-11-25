package com.kodilla.exception.main;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(1.8, 1.5);
        } catch (Exception e) {
            System.out.println("We have an error here!!!");
        } finally {
            System.out.println("I am gonna be here ... always!!!");
        }
    }
}
