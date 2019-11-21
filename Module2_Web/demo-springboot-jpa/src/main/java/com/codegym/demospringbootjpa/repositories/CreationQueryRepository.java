package com.codegym.demospringbootjpa.repositories;

import com.codegym.demospringbootjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface CreationQueryRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findAll();
    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);
}
