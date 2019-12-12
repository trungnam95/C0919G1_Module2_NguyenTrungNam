package com.finaltest.demo.service.Impl;

import com.finaltest.demo.entity.KhachHang;
import com.finaltest.demo.repositories.KhachHangRepository;
import com.finaltest.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void remove(Long id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang findById(Long id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable) {
        return khachHangRepository.findAllByHoTenContaining(name, pageable);
    }

    @Override
    public Page<KhachHang> findAllById(Long id, Pageable pageable) {
        return khachHangRepository.findAllById(id,pageable);
    }
}
