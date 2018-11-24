package com.kodilla.exception.test;

public class ExceptionHandling   {
    try (SecondChallenge challenge = new SecondChallenge()) {
        challenge.probablyIWillThrowException();
    } catch (Exception e) {
        new throw SecondChallengeException();
    } finally {
        System.out.println("I am gonna be here ... always!!!");
    }

}
