package com.codegym.demo.service.Impl;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import com.codegym.demo.repositories.SchoolRepository;
import com.codegym.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SchoolImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Override
    public Page<School> findAll(Pageable pageable) {
        return schoolRepository.findAll(pageable);
    }

    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }


    @Override
    public School findById(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
