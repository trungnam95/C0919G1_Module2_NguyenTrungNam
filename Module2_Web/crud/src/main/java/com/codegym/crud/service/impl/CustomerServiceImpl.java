package com.codegym.crud.service.impl;

import com.codegym.crud.entity.Customer;
import com.codegym.crud.repositories.CustomerRepository;
import com.codegym.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), 10);
        return customerRepository.findAll(pageable);
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

//    @Override
//    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
//        return customerRepository.findAllByNameContaining(name, pageable);
//    }
    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(),10);
        return customerRepository.findAllByNameContaining(name, pageable);
    }
}
