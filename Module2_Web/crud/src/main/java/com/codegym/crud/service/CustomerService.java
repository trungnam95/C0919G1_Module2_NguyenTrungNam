package com.codegym.crud.service;

import com.codegym.crud.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
}
