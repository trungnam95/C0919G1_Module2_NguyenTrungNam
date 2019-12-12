package com.codegym.demo.entity;

import com.sun.istack.NotNull;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.Message;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Table(name = "sinhvien")
@Entity
public class SinhVien {
    @Id
    @Column(name = "idsinhvien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "age")
    @NotNull
    private int age;

    @Column(name="sex")
    @NotEmpty
    private String sex;
    @ManyToOne
    @JoinColumn(name = "idschool")
    private School school;
//
//    @ManyToOne
//    @JoinColumn(name = "idclass")
//    private LopHoc lopHoc;

//    public LopHoc getLopHoc() {
////        return lopHoc;
////    }
////
////    public void setLopHoc(LopHoc lopHoc) {
////        this.lopHoc = lopHoc;
////    }
////
////
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public SinhVien(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public SinhVien() {
    }
}
