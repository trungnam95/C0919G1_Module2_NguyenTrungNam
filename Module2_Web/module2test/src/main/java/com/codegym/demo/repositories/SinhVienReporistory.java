package com.codegym.demo.repositories;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienReporistory extends JpaRepository<SinhVien,Long> {
    Page<SinhVien> findAllByNameContaining(String name, Pageable pageable);
    Iterable<SinhVien> findAllBySchool(School school);
}
