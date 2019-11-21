package com.codegym.crud.service.impl;

import com.codegym.crud.entity.Customer;
import com.codegym.crud.repositories.CustomerRepository;
import com.codegym.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }
    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }
}
