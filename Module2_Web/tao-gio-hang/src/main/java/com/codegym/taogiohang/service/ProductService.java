package com.codegym.taogiohang.service;

import com.codegym.taogiohang.entity.Product;
import com.codegym.taogiohang.entity.ProductList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    Product findById(Long id);
    void save(Product product);
    void remove(Long id);
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);
    void removeAll(ProductList productList);
}
