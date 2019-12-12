package com.codegym.demo.service.Impl;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import com.codegym.demo.repositories.SinhVienReporistory;
import com.codegym.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SinhVienImpl implements SinhVienService {
    @Autowired
    private SinhVienReporistory sinhVienReporistory;
    @Override
    public Page<SinhVien> findAll(Pageable pageable) {
        return sinhVienReporistory.findAll(pageable);
    }

    @Override
    public void save(SinhVien sinhVien) {
        sinhVienReporistory.save(sinhVien);
    }

    @Override
    public void remove(Long id) {
        sinhVienReporistory.deleteById(id);
    }

    @Override
    public SinhVien findById(Long id) {
        return sinhVienReporistory.findById(id).orElse(null);
    }

    @Override
    public Page<SinhVien> findAllByNameContaining(String name, Pageable pageable) {
        return sinhVienReporistory.findAllByNameContaining(name, pageable);
    }

    @Override
    public Iterable<SinhVien> findAllBySchool(School school) {
        return sinhVienReporistory.findAllBySchool(school);
    }
}
