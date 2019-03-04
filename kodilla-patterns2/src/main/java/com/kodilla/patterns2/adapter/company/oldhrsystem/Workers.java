package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"1", "John", "One1"},
            {"2", "John", "One2"},
            {"3", "John", "One3"},
            {"4", "John", "One4"},
            {"5", "John", "One5"},
            {"6", "John", "One6"},
            {"7", "John", "One7"}
    };

    private double [] salaries = {
            4500.00,
            3700.00,
            3420.00,
            6500.00,
            3900.00,
            3720.00,
            3520.00
    };

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", ";
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
