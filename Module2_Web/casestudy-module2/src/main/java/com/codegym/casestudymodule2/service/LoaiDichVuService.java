package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.LoaiDichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LoaiDichVuService {
    Page<LoaiDichVu> findAll(Pageable pageable);
    LoaiDichVu findById(Long id);
}
