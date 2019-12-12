package com.codegym.demo.service;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SchoolService {
    Page<School> findAll(Pageable pageable);
    void save(School school);
    School findById(Long id);
}
