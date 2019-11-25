package com.codegym.provinces.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_province;

    private String name;

    @OneToMany(mappedBy = "province")
    private List<Customer> customers;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public Long getId_province() {
        return id_province;
    }

    public void setId_province(Long id_province) {
        this.id_province = id_province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
