package com.codegym.taogiohang.service.Impl;

import com.codegym.taogiohang.entity.Product;
import com.codegym.taogiohang.entity.ProductList;
import com.codegym.taogiohang.repositories.ProductRepository;
import com.codegym.taogiohang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable) {
        return productRepository.findAllByNameProductContaining(nameProduct,pageable);
    }

    @Override
    public void removeAll(ProductList productList) {
        productRepository.deleteAll();
    }

}
