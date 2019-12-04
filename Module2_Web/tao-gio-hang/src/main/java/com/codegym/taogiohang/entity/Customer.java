//package com.codegym.taogiohang.entity;
//
//import net.bytebuddy.dynamic.loading.InjectionClassLoader;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name="customers")
//public class Customer {
//    @Column(name="id_customer")
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idCustomer;
//    @Column(name="age_customer")
//    private int ageCustomer;
//    @Column(name="name_customer")
//    private int nameCustomer;
//    @OneToMany(targetEntity = Product.class)
//    private List<Product> products;
//    private Product product;
//
//    public Customer(int ageCustomer, int nameCustomer) {
//        this.ageCustomer = ageCustomer;
//        this.nameCustomer = nameCustomer;
//    }
//
//    public Long getIdCustomer() {
//        return idCustomer;
//    }
//
//    public void setIdCustomer(Long idCustomer) {
//        this.idCustomer = idCustomer;
//    }
//
//    public int getAgeCustomer() {
//        return ageCustomer;
//    }
//
//    public void setAgeCustomer(int ageCustomer) {
//        this.ageCustomer = ageCustomer;
//    }
//
//    public int getNameCustomer() {
//        return nameCustomer;
//    }
//
//    public void setNameCustomer(int nameCustomer) {
//        this.nameCustomer = nameCustomer;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public Customer() {
//    }
//}
