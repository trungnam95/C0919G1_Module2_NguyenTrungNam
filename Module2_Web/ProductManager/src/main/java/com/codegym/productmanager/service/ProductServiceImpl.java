package com.codegym.productmanager.service;

import com.codegym.productmanager.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Mi Goi", 5000, "Do An Lien", "HaoHao"));
        products.put(2, new Product(2, "Dau An", 25000, "Nau An", "Tuong An"));
        products.put(3, new Product(3, "Chip Chip", 30000, "Do An Lien", "Onion"));
        products.put(4, new Product(4, "Bento", 15000, "Do An Lien", "ThaiLan"));
        products.put(5, new Product(5, "Me", 13000, "Do An Lien", "VietNam"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
