package com.codegym.demo.entity;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Table(name="class")
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclass")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Column(name="idschool")
////    private Long idSchool;

//    public Long getIdSchool() {
//        return idSchool;
//    }
//
//    public void setIdSchool(Long idSchool) {
//        this.idSchool = idSchool;
//    }

    @ManyToOne
    @JoinColumn(name = "idschool")
    private School school;

    @OneToMany(targetEntity = SinhVien.class)
    private List<SinhVien> sinhViens;

    public Long getId() {
        return id;
    }

    public Long getId(Long id) {
        return this.id;
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public LopHoc(String name) {
        this.name = name;
    }

    public LopHoc() {
    }
}
