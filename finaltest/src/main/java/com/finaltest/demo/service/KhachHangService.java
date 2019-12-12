package com.finaltest.demo.service;

import com.finaltest.demo.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KhachHangService {
    Page<KhachHang> findAll(Pageable pageable);
    void save(KhachHang khachHang);
    void remove(Long id);
    KhachHang findById(Long id);
    Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable);
    Page<KhachHang> findAllById(Long id,Pageable pageable);
}
