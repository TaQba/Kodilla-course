package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List searchCompany(final String value) {
        String wrappedValue = "%" + value + "%";
        List<Company> company = companyDao.searchNameLike(wrappedValue);
        return company;
    }

    public List searchEmployee(final String value) {
        String wrappedValue = "%" + value + "%";
        List<Employee> employees = employeeDao.searchNameLike(wrappedValue);
        return employees;
    }
}
