package com.codegym.demospringbootjpa.service;

import com.codegym.demospringbootjpa.entity.Employee;
import com.codegym.demospringbootjpa.repositories.AnnotationRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

public class EmployeeAnnotationService {
    @Autowired
    AnnotationRepostitory annotationRepostitory;

    public List<Employee> findAll() {
        return annotationRepostitory.findAll();
    }

    public Employee findByNameAndAge(String name, int age) {
        return annotationRepostitory.findByNameAndAge(name, age);
    }
}
