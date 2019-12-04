//package com.codegym.taogiohang.service.Impl;
//
//import com.codegym.taogiohang.entity.Customer;
//import com.codegym.taogiohang.repositories.CustomerRepository;
//import com.codegym.taogiohang.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerServiceImpl implements CustomerService {
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Override
//    public Page<Customer> findAll(Pageable pageable) {
//        return customerRepository.findAll(pageable);
//    }
//
//    @Override
//    public Customer findById(Long id) {
//        return customerRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void save(Customer customer) {
//        customerRepository.save(customer);
//    }
//
//    @Override
//    public void remove(Long id) {
//        customerRepository.deleteById(id);
//    }
//}
