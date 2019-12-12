package com.codegym.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idschool")
    private Long id;

    @Column(name = "name")
    private String name;


    @OneToMany(targetEntity = SinhVien.class)
    private List<SinhVien> sinhViens;
    @OneToMany(targetEntity = LopHoc.class)
    private List<LopHoc> lopHocs;

    public List<LopHoc> getLopHocs() {
        return lopHocs;
    }

    public void setLopHocs(List<LopHoc> lopHocs) {
        this.lopHocs = lopHocs;
    }

    public School(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public School() {
    }
}
