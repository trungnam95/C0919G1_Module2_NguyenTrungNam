package com.codegym.productmanager.service;

import com.codegym.productmanager.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
