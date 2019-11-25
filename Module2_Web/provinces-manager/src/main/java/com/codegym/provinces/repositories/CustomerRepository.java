package com.codegym.provinces.repositories;

import com.codegym.provinces.entity.Customer;
import com.codegym.provinces.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstnameContaining(String firstname, Pageable pageable);

}
