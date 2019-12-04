package com.codegym.casestudymodule2.service.Impl;

import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.repositories.LoaiDichVuRepository;
import com.codegym.casestudymodule2.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LoaiDichVuServiceImpl implements LoaiDichVuService {
    @Autowired
    private LoaiDichVuRepository loaiDichVuRepository;
    @Override
    public Page<LoaiDichVu> findAll(Pageable pageable) {
        return loaiDichVuRepository.findAll(pageable);
    }

    @Override
    public LoaiDichVu findById(Long id) {
        return loaiDichVuRepository.findById(id).orElse(null);
    }
}
