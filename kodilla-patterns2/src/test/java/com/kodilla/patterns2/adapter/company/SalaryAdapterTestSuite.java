package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double totalSalary  = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(totalSalary);
        Assert.assertEquals(29260,totalSalary, 0);

    }
}
