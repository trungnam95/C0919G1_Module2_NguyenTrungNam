package com.codegym.demo.repositories;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {

}
