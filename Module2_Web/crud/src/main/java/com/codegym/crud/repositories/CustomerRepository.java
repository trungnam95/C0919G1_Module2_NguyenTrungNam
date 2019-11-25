package com.codegym.crud.repositories;

import com.codegym.crud.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
