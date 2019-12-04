package com.codegym.casestudymodule2.repositories;

import com.codegym.casestudymodule2.entity.LoaiDichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiDichVuRepository extends JpaRepository<LoaiDichVu,Long> {
}
