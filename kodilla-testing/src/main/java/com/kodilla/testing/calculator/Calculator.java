package com.kodilla.testing.calculator;

public class Calculator {
    private int result = 0;

    public int add(int a, int b) {
        this.resetResult();
        this.setResult(a+b);
        return this.getResult();
    }

    public int subtract(int a, int b)
    {
        this.resetResult();
        this.setResult(a-b);
        return this.getResult();
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void resetResult() {
        result = 0;
    }
}
