package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator machine = new Calculator();

        int result = machine.getResult();
        if (result == 0){
            System.out.println("Test1:OK");
        } else {
            System.out.println("Test1: Error!");
        }


        int a = 123;
        int b = 93;

        // kolejny test
        int sum =  machine.add(a, b);
        if (sum == (a+b)){
            System.out.println("Test2:OK");
        } else {
            System.out.println("Test2:Error!!");
        }

        // kolejny test
        int diff =  machine.subtract(a, b);
        if (diff == (a-b)){
            System.out.println("Test3:OK");
        } else {
            System.out.println("Test3:Error!!");
        }

        // kolejny test
        machine.resetResult();
        result = machine.getResult();
        if (result == 0){
            System.out.println("Test4:OK");
        } else {
            System.out.println("Test4:Error!!");
        }


    }
}