package com.codegym.demospringbootjpa.entity;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int id;
    @Column(name="name")
    public String name;
    @Column(name = "age")
    public int age;
    @Column(name="email")
    public String email;
    @Column(name = "department_id")
    public int department_id;
}
