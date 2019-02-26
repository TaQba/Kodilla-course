package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository <Employee,Integer> {
    @Query
    List<Employee> retrieveByName(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> searchNameLike(@Param("LASTNAME") String lastname);
}
