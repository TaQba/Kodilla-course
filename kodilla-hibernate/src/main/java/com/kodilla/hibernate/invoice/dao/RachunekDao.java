package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.Rachunek;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface RachunekDao extends CrudRepository<Rachunek, Integer> {
}
