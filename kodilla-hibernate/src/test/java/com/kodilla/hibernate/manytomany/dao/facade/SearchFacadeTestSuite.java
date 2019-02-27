package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompany() {
        //Given
        Company company1 = new Company("Nokla");
        companyDao.save(company1);

        Company company2 = new Company("Tokla");
        companyDao.save(company2);

        Company company3 = new Company("Gorle");
        companyDao.save(company3);

        //When
        List<Object> companies = searchFacade.searchCompany("okl");
        //Then
        Assert.assertEquals(2, companies.size());

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testSearchEmployee() {
        //Given
        Employee employee1 = new Employee("James", "Moore");
        employeeDao.save(employee1);

        Employee employee2 = new Employee("James", "White");
        employeeDao.save(employee2);


        //When
        List<Object> employees = searchFacade.searchEmployee("it");
        //Then
        Assert.assertEquals(1, employees.size());

        //CleanUp
        employeeDao.deleteAll();
    }
}
