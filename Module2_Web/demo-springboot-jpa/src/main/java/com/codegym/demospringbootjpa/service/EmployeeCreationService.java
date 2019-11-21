package com.codegym.demospringbootjpa.service;

import com.codegym.demospringbootjpa.entity.Employee;
import com.codegym.demospringbootjpa.repositories.CreationQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCreationService {
    @Autowired
    CreationQueryRepository creationQueryRepository;

    public List<Employee> findAll() {
        return creationQueryRepository.findAll();
    }
    public List<Employee> findByName(String name){
        return creationQueryRepository.findByName(name);
    }
}
