package com.codegym.demo.service;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SinhVienService {
    Page<SinhVien> findAll(Pageable pageable);
    void save(SinhVien sinhVien);
    void remove(Long id);
    SinhVien findById(Long id);
    Page<SinhVien> findAllByNameContaining(String name, Pageable pageable);
    Iterable<SinhVien> findAllBySchool(School school);
}
