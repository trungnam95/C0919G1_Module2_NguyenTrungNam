package com.codegym.crud.service;

import com.codegym.crud.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
