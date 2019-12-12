package com.codegym.demo.repositories;

import com.codegym.demo.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<LopHoc,Long> {
}
