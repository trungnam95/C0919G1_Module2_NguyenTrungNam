package com.codegym.taogiohang.repositories;

import com.codegym.taogiohang.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);
}
