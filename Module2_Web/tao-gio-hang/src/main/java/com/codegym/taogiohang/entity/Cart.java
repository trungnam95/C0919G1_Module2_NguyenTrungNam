package com.codegym.taogiohang.entity;

public class Cart {
    private Product product;
    private int quantity;
    private int total;
    public int getTotal() {
        return total = quantity * product.getPrice_product();
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cart() {
    }

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
