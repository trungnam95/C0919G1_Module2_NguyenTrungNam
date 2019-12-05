package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public  interface KhachHangService {
    Page<KhachHang> findAll(Pageable pageable);
    void save(KhachHang khachHang);
    Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable);
    KhachHang findById(Long id);
    void deleteById(Long id);
}
