package com.tabeldata.demo.repository;

import com.tabeldata.demo.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
    List<Customer> findAll();
    Customer findByIdKota(Integer id);
}
